
package com.solvd.bankingandinsurance.bankingservice;

import java.util.Objects;

import com.solvd.bankingandinsurance.exception.NoTransactionException;

public abstract class BankAccount {
	protected int balance;
	protected int previousTransaction;
	protected String customerName;
	protected int customerId;

	public BankAccount() {

	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public abstract void deposit(int amount);

	public abstract void withdraw(int amount);

	public abstract void getPreviousTransaction() throws NoTransactionException;

	@Override
	public int hashCode() {
		return Objects.hash(balance, customerId, customerName, previousTransaction);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return balance == other.balance && Objects.equals(customerId, other.customerId)
				&& Objects.equals(customerName, other.customerName) && previousTransaction == other.previousTransaction;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + ", previousTransaction=" + previousTransaction + ", customerName="
				+ customerName + ", customerId=" + customerId + "]";
	}

}