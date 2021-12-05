
package com.solvd.bankingandinsurance.utilities.address;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Country {
	private String countryName;
	private STATE stateName;
	private String countryCode;

	private static final Logger log = LogManager.getLogger(Country.class.getName());

	public Country() {

	}

	public Country(String countryName, String countryCode, STATE state) {

		this.countryName = countryName;
		this.countryCode = countryCode;
		this.stateName = state;

	}

	public String getCountry() {
		return countryName;
	}

	public void setCountry(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public STATE getStateName() {
		return stateName;
	}

	public void setStateName(STATE stateName) {
		this.stateName = stateName;
	}

	@Override
	public String toString() {

		return " Country Name : " + countryName + " Country Code : " + countryCode + "\n";
	}

}