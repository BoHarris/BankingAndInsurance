package com.solvd.bankingandinsurance.utilities.address;

public class CountryCode {

	private String countryCode;

	public CountryCode() {

	}

	public CountryCode(String countryCode) {
		this.setCountryCode(countryCode);
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {

		return " Country Code : " + countryCode + "\n";
	}

}
