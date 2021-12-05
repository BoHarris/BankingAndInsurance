
package com.solvd.bankingandinsurance.utilities.address;

public class ZipCode {

	private String zipCode;

	public ZipCode() {

	}

	public ZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {

		return " Zip Code : " + zipCode + "\n";
	}
}