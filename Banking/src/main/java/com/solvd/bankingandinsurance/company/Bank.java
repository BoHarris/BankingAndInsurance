package com.solvd.bankingandinsurance.company;

import java.util.List;

import com.solvd.bankingandinsurance.utilities.DateUtil;
import com.solvd.bankingandinsurance.utilities.address.Address;

public class Bank extends Company {

	private List<BankDepartment> departments;
	private String hourOpen;
	private String minuteOpen;
	private String secondOpen;
	private String hourClose;
	private String minuteClose;
	private String secondClose;

	public Bank(String name, Address address, String phoneNumber, String website, String description,
			DateUtil dateFounded, String headquarters, String companyType) {
		super(name, address, phoneNumber, website, description, dateFounded, headquarters, companyType);


	}

	public List<BankDepartment> getDepartments() {
		return departments;
	}

	public void setDepartments(List<BankDepartment> departments) {
		this.departments = departments;
	}

	public String getBankClose() {
		return hourClose + ":" + minuteClose + ":" + secondClose;
	}

	public void setBankClose(String hourClose, String minuteClose, String secondClose) {
		this.hourClose = hourClose;
		this.minuteClose = minuteClose;
		this.secondClose = secondClose;
	}

	public String getBankOpen() {
		return hourOpen + ":" + minuteOpen + ":" + secondOpen;

	}

	public void setBankOpen(String hourOpen, String minuteOpen, String secondOpen) {
		this.hourOpen = hourOpen;
		this.minuteOpen = minuteOpen;
		this.secondOpen = secondOpen;
	}

	@Override
	public String toString() {

		return " Company Name : " + getName() + " Address : " + getAddress() + " Phone Number : " + getPhoneNumber()
				+ " Website : " + getWebsite() + " Company Description : " + getDescription() + " Date Founded : "
				+ getDateFounded() + " Headquarter : " + getHeadquarters() + " Company Type: " + getCompanyType() + "\n";
	}

}
