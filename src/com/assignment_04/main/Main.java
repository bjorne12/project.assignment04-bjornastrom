/**
 * Assignment 04
 * @author Björn Åström
 * @version 1
 **/

package com.assignment_04.main;

import com.assignment_04.superclasses.BankAccount;
import com.assignment_04.subclasses.BankCustomer;
import com.assignment_04.subclasses.PersonalAccount;
import com.assignment_04.subclasses.SavingAccount;



public class Main {
	public static void main(String[] args) {
		
	
		String account = "";
		
		/**
		 *  Tar in informtion från BankCustomer,  namn blir Björn, ålder 25. 
		 *  Den tar sedan in information ifrån BankAccount, PersonalAccount och SavingAccount
		 */
		
		BankCustomer bc = new BankCustomer("Björn", 25);
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingAccount());
		System.out.println(bc.toString());
		
		/** Avsätter 30 till "account" och läser sedan ut "bc.toString"
		 *  
		 */
		account = bc.getCustomerAccount().get(0).getAccountNumber();
		System.out.println("Depositing 30.0 to the first account");
		bc.depositToAccount(account, 30.0);
		System.out.println(bc.toString());
		
		
		/** Tar ut 200 från "account" och läser sedan ut "bc.toString"
		 *  
		 */
		 
		System.out.println("Withdrawing 200.0 to the first account");
		account = bc.getCustomerAccount().get(1).getAccountNumber();
		bc.withdrawMoneyFromAccount(account, 200.0);
		System.out.println(bc.toString());
		
		/** Avsätter 200 till "account" och läser sedan ut "bc.toString"
		 *  
		 */
		
		System.out.println("Deposinting 200.0 to the first account");
		account = bc.getCustomerAccount().get(2).getAccountNumber();
		bc.depositToAccount(account, 200.0);
		System.out.println(bc.toString());
		

	}

}