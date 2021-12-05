
package com.solvd.bankingandinsurance.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BadCreditException extends Exception {

	private static final Logger log = LogManager.getLogger(BadCreditException.class.getName());

	public BadCreditException() {

		super("Client has bad credit");
	}

	public BadCreditException(String message) {
		super("Client has bad credit.");
		log.debug("Exiting bad credit exception");
	}
}
