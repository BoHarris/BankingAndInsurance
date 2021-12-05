package com.solvd.bankingandinsurance.exception;

public class DownPaymentException extends Exception {

	public DownPaymentException() {
		super("Down Payment less than 10%.");

	}

	public DownPaymentException(String message) {
		super("Down Payment less than 10%.");

	}

}
