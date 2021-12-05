
package com.solvd.bankingandinsurance.company;

import com.solvd.bankingandinsurance.utilities.DateUtil;
import com.solvd.bankingandinsurance.utilities.address.Address;

public class InsuranceAgency extends Company {

	public InsuranceAgency(String name, Address address, String phoneNumber, String website, String description,
			DateUtil dateFounded, String headquarters, String companyType) {
		super(name, address, phoneNumber, website, description, dateFounded, headquarters, companyType);

	}

	@Override
	public String toString() {

		return " Company Name : " + getName() + " Address : " + getAddress() + " Phone Number : " + getPhoneNumber()
				+ " Website : " + getWebsite() + " Company Description : " + getDescription() + " Date Founded : "
				+ getDateFounded() + " Headquarter : " + getHeadquarters() + " Company Type: " + getCompanyType() + "\n";
	}

}
