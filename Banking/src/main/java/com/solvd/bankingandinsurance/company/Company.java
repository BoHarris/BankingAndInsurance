package com.solvd.bankingandinsurance.company;

import java.util.Objects;

import com.solvd.bankingandinsurance.utilities.DateUtil;
import com.solvd.bankingandinsurance.utilities.address.Address;

public class Company {
	protected String name;
	private Address address;
	private String phoneNumber;
	private String website;
	private String description;
	private DateUtil dateFounded;
	private String headquarters;
	private String companyType;

	public Company(String name, Address address, String phoneNumber, String website, String description,
			DateUtil dateFounded, String headquarters, String companyType) {

		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.website = website;
		this.description = description;
		this.dateFounded = dateFounded;
		this.headquarters = headquarters;
		this.companyType = companyType;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DateUtil getDateFounded() {
		return dateFounded;
	}

	public void setDateFounded(DateUtil dateFounded) {
		this.dateFounded = dateFounded;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	@Override
	public String toString() {

		return "Company Profile : " + " CompanyName : " + getName() + "Address : " + getAddress() + " Phone Number : "
				+ getPhoneNumber() + " Website : " + getWebsite() + " Description : " + getDescription()
				+ " Date Founded : " + getDateFounded() + " Headquarters : " + getHeadquarters() + " Company Type : "
				+ getCompanyType() + "\n";

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return Objects.equals(address, other.address) && Objects.equals(companyType, other.companyType)
				&& Objects.equals(dateFounded, other.dateFounded) && Objects.equals(description, other.description)
				&& Objects.equals(headquarters, other.headquarters) && Objects.equals(name, other.name)
				&& Objects.equals(phoneNumber, other.phoneNumber) && Objects.equals(website, other.website);
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, companyType, dateFounded, description, headquarters, name, phoneNumber, website);
	}

}
