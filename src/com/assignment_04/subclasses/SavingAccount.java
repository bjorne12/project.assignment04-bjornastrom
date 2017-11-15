/**
 * Assignment 04
 * @author Björn Åström
 * @version 1
 **/

package com.assignment_04.subclasses;
import java.util.UUID;
import com.assignment_04.superclasses.*;

public class SavingAccount extends BankAccount{
	public SavingAccount() {
		this.setAccountNumber( UUID.randomUUID().toString().substring(0,6));
		this.setBalance(0.0);
		this.setAccountType("Saving Account");
	}
}