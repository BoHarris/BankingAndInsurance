
package com.solvd.bankingandinsurance.employee;

import java.util.Optional;

import com.solvd.bankingandinsurance.utilities.DateUtil;
import com.solvd.bankingandinsurance.utilities.FullName;
import com.solvd.bankingandinsurance.utilities.address.Address;

public class Employee {

	private FullName fullName;
	private Address address;
	private Integer taxIdNumber;
	private String gender;
	private DateUtil dateOfBirth;
	private String jobTitle;
	private String employeeID;
	private DateUtil dateHired;
	private String emailAddress;
	private String phoneExtension;

	public Employee() {

	}

	public Employee(FullName fullName, Address address, Integer taxIdNumber, String gender, DateUtil dateOfBirth,
			String jobTitle, String employeeID, DateUtil dateHired, String emailAddress, String phoneExtension) {

		this.fullName = fullName;
		this.address = address;
		this.taxIdNumber = taxIdNumber;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.jobTitle = jobTitle;
		this.employeeID = employeeID;
		this.dateHired = dateHired;
		this.emailAddress = emailAddress;
		this.phoneExtension = phoneExtension;

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

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getTaxIdNumber() {
		return taxIdNumber;
	}

	public void setTaxIdNumber(Integer taxIdNumber) {
		this.taxIdNumber = taxIdNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Optional<String> getEmployeeID() {
		return Optional.ofNullable(employeeID);
	}

	public void setEmployeeID(String newEmployeeID) {
		this.employeeID = newEmployeeID;
	}

	public DateUtil getDateHired() {
		return dateHired;
	}

	public void setDateHired(DateUtil dateHired) {
		this.dateHired = dateHired;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String newEmailAddress) {
		this.emailAddress = newEmailAddress;
	}

	public String getPhoneExtension() {
		return phoneExtension;
	}

	public void setPhoneExtension(String newPhoneExtension) {
		this.phoneExtension = newPhoneExtension;
	}

	@Override
	public String toString() {

		return " FullName : " + getFullName() + " Address : " + getAddress() + " Tax ID: " + getTaxIdNumber()
				+ " Gender : " + getGender() + " Date of Birth : " + getDateOfBirth() + " Job Title :" + getJobTitle()
				+ " Employee ID : " + getEmployeeID() + " Date Hired : " + getDateHired() + " Company Email Address : "
				+ getEmailAddress() + " Phone Extension : " + getPhoneExtension() + "\n";
	}

}
