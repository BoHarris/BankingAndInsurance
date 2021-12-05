package com.solvd.bankingandinsurance.utilities.address;

public class City {

	private String cityName;
	private String state;
	private String zipCode;

	public City() {

	}

	public City(String cityName, String zipCode) {

		this.cityName = cityName;
		this.setZipCode(zipCode);

	}

	public String getCity() {
		return cityName;
	}

	public void setCountry(String cityName) {
		this.cityName = cityName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {

		return cityName + " Zip Code : " + "\n";
	}

}