package com.solvd.bankingandinsurance.exception;

public class NoTransactionException extends Exception {

	public NoTransactionException() {
		super("Missing Required Paperwork ");
	}

	public NoTransactionException(String message) {
		super("Missing Required Paperwork ");

	}
}
