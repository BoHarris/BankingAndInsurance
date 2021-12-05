
package com.solvd.bankingandinsurance.employee;

import com.solvd.bankingandinsurance.utilities.DateUtil;
import com.solvd.bankingandinsurance.utilities.FullName;
import com.solvd.bankingandinsurance.utilities.address.Address;

public class MiddleManager extends Employee {

	public MiddleManager(FullName fullName, Address address, Integer taxIdNumber, String gender, DateUtil dateOfBirth,
			String jobTitle, String employeeID, DateUtil dateHired, String emailAddress, String phoneExtension) {
		super(fullName, address, taxIdNumber, gender, dateOfBirth, jobTitle, employeeID, dateHired, emailAddress,
				phoneExtension);

	}

	@Override
	public String toString() {

		return " FullName : " + getFullName() + " Address : " + getAddress() + " Tax ID: " + getTaxIdNumber()
				+ " Gender : " + getGender() + " Date of Birth : " + getDateOfBirth() + " Job Title :" + getJobTitle()
				+ " Employee ID : " + getEmployeeID() + " Date Hired : " + getDateHired() + " Company Email Address : "
				+ getEmailAddress() + " Phone Extension : " + getPhoneExtension() + "\n";
	}

}