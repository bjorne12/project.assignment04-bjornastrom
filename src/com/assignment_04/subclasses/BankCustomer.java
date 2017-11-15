/**
 * Assignment 04
 * @author Björn Åström
 * @version 1
 **/

package com.assignment_04.subclasses;
import java.util.ArrayList;
import com.assignment_04.superclasses.*;

public class BankCustomer extends Human {
	
	/**
	 * Skapar en arraylist med namn customerAccounts
	 */
    ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();

    /** Tar in namn och ålder till bankcustomer
     * 
     */
    
    public BankCustomer(String name, int age) {
        super(name, age);
    }

    /**
     * Getters och setters för attributet customerAccounts
     */
    public ArrayList<BankAccount> getCustomerAccount() {
        return customerAccounts;
    }

    public void setCustomerAccount(ArrayList<BankAccount> customerAccount) {
        this.customerAccounts = customerAccount;
    }

    public void addAccount(BankAccount bankAccount) {
        this.customerAccounts.add(bankAccount);
    }

    public void depositToAccount(String accountNumber, double amount) {
        for (int i = 0; i < customerAccounts.size(); i++) {
            if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
                customerAccounts.get(i).depositMoney(amount);
            }
        }
    }

    public void withdrawMoneyFromAccount(String accountNumber, double amount) {
        for (int i = 0; i < customerAccounts.size(); i++) {
            if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
                customerAccounts.get(i).withdrawMoney(amount);
            }
        }
    }

    public String toString() {
        return "Customer: " + getName() + " age " + getAge() + " \n" + customerAccounts.get(0) + "\n"
                + customerAccounts.get(1) + "\n" + customerAccounts.get(2) + "\n";
    }
}