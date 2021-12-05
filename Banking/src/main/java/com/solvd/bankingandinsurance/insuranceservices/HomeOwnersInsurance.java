
package com.solvd.bankingandinsurance.insuranceservices;

import com.solvd.bankingandinsurance.client.InsuranceClient;

public class HomeOwnersInsurance extends InsuranceAccount {

	public HomeOwnersInsurance(InsuranceClient client, int monthlyPayment, String coverageDescription) {
		super(client, monthlyPayment, coverageDescription);

	}

	@Override
	public String toString() {

		return " Client Profile : " + getClient() + " Monthly Payment : " + getMonthlyPayment()
				+ "Coverage Description : " + getCoverageDescription() + "\n";
	}

}
