package com.solvd.bankingandinsurance.client;

import java.util.Optional;

import com.solvd.bankingandinsurance.utilities.DateUtil;
import com.solvd.bankingandinsurance.utilities.FullName;
import com.solvd.bankingandinsurance.utilities.address.Address;

public class Client {

	private FullName fullName;
	private Address address;
	private int taxIdNumber;
	private String gender;
	private DateUtil dateOfBirth;

	public Client() {

	}

	public Client(FullName fullName, Address address, int taxIdNumber, String gender, DateUtil dateOfBirth) {

		this.fullName = fullName;
		this.address = address;
		this.taxIdNumber = taxIdNumber;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;

	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public DateUtil getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(DateUtil dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getTaxIdNumber() {
		return taxIdNumber;
	}

	public void setTaxIdNumber(Integer taxIdNumber) {
		this.taxIdNumber = taxIdNumber;
	}

	public Optional<String> getGender() {
		return Optional.ofNullable(gender);
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Client [fullName=" + fullName + ", address=" + address + ", taxIdNumber=" + taxIdNumber + ", gender="
				+ gender + ", dateOfBirth=" + dateOfBirth + "] \n";
	}

}