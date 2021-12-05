package com.solvd.bankingandinsurance.bankingservice;

import com.solvd.bankingandinsurance.client.BankingClient;

public class PersonalLoanAccount {
	private int startingLoanAmount;
	private int interestRate;
	private int currentBalance;
	private int lastTransaction;
	private BankingClient client;
	private int downPayment;

	public PersonalLoanAccount(BankingClient client, int startingLoanAmount, int interestRate, int currentBalance,
			int lastTransaction) {
		super();

		this.client = client;
		this.startingLoanAmount = startingLoanAmount;
		this.interestRate = interestRate;
		this.currentBalance = currentBalance;
		this.lastTransaction = lastTransaction;

	}

	enum DOWNPAYMENT {
		DOWNPAYMENT
	}

	 class DownpaymentString {
		public final static String DOWNPAYMENT = "Down Payment Accepted";

	}

	public int getStartingLoanAmount() {
		return startingLoanAmount;
	}

	public void setStartingLoanAmount(int startingLoanAmount) {
		this.startingLoanAmount = startingLoanAmount;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	public int getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(int currentBalance) {
		this.currentBalance = currentBalance;
	}

	public int getLastTransaction() {
		return lastTransaction;
	}

	public int getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(int downPayment) {
		this.downPayment = downPayment;
	}

	public void setClient(BankingClient client) {
		this.client = client;
	}

	public BankingClient getClient() {
		return client;
	}

}
