
package com.solvd.bankingandinsurance.bankingservice;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.bankingandinsurance.exception.InsufficentFundsException;
import com.solvd.bankingandinsurance.exception.NoTransactionException;

public class SavingsAccount extends BankAccount {

	private static final Logger log = LogManager.getLogger(SavingsAccount.class.getName());

	public SavingsAccount() {

	}

	enum TRANSACTION {
		DEPOSIT, WITHDRAW
	}

	private class Transactions {
		public final static String DEPOSIT = "Deposit";
		public final static String WITHDRAW = "Withdraw";

	}

	@Override
	public void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
			log.debug(TRANSACTION.DEPOSIT);
		}

	}

	@Override
	public void withdraw(int amount) {

		try {
			if (amount > balance) {
				throw new InsufficentFundsException();
			} else if (amount != 0) {
				balance = balance - amount;
				previousTransaction = -amount;
				log.debug(TRANSACTION.WITHDRAW);
			}

		} catch (InsufficentFundsException e) {
			log.error(e.getMessage());
		}

	}

	@Override
	public void getPreviousTransaction() throws NoTransactionException {
		if (previousTransaction > 0) {
			log.debug(TRANSACTION.DEPOSIT);
		} else if (previousTransaction < 0) {
			log.debug(TRANSACTION.WITHDRAW);
		} else {
			throw new NoTransactionException();

		}
	}

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

}
