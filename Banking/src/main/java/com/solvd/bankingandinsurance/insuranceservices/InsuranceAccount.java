
package com.solvd.bankingandinsurance.insuranceservices;

import com.solvd.bankingandinsurance.client.InsuranceClient;

public class InsuranceAccount {
	private InsuranceClient client;
	private int monthlyPayment;
	private String coverageDescription;


	public InsuranceAccount(InsuranceClient client, int monthlyPayment, String coverageDescription) {

	}

	public InsuranceClient getClient() {
		return client;
	}

	public void setClient(InsuranceClient client) {
		this.client = client;
	}

	public int getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(int monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public String getCoverageDescription() {
		return coverageDescription;
	}

	public void setCoverageDescription(String coverageDescription) {
		this.coverageDescription = coverageDescription;
	}

	

}
