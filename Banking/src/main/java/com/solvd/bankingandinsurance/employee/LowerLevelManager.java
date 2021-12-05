
package com.solvd.bankingandinsurance.employee;

import com.solvd.bankingandinsurance.interfaces.IAnswerQuestion;
import com.solvd.bankingandinsurance.interfaces.ICollectAndInputData;
import com.solvd.bankingandinsurance.interfaces.IDiscussLoanRisks;
import com.solvd.bankingandinsurance.interfaces.IPresentTermsOfLoan;
import com.solvd.bankingandinsurance.utilities.DateUtil;
import com.solvd.bankingandinsurance.utilities.FullName;
import com.solvd.bankingandinsurance.utilities.address.Address;

public class LowerLevelManager extends Employee
		implements IAnswerQuestion, ICollectAndInputData, IPresentTermsOfLoan, IDiscussLoanRisks {

	public LowerLevelManager(FullName fullName, Address address, Integer taxIdNumber, String gender,
			DateUtil dateOfBirth, String jobTitle, String employeeID, DateUtil dateHired, String emailAddress,
			String phoneExtension) {
		super(fullName, address, taxIdNumber, gender, dateOfBirth, jobTitle, employeeID, dateHired, emailAddress,
				phoneExtension);

	}

	@Override
	public void loanRiskAssement() {
		// TODO Auto-generated method stub

	}

	@Override
	public void presentTermsOfLoan() {
		// TODO Auto-generated method stub

	}

	@Override
	public void collectAndInputData() {
		// TODO Auto-generated method stub

	}

	@Override
	public void informClientAndCollectData() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {

		return " FullName : " + getFullName() + " Address : " + getAddress() + " Tax ID: " + getTaxIdNumber()
				+ " Gender : " + getGender() + " Date of Birth : " + getDateOfBirth() + " Job Title :" + getJobTitle()
				+ " Employee ID : " + getEmployeeID() + " Date Hired : " + getDateHired() + " Company Email Address : "
				+ getEmailAddress() + " Phone Extension : " + getPhoneExtension() + "\n";
	}

}
