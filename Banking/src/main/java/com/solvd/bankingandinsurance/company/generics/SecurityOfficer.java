
package com.solvd.bankingandinsurance.company.generics;

import java.util.Collection;

import com.solvd.bankingandinsurance.employee.EntryLevel;
import com.solvd.bankingandinsurance.utilities.DateUtil;
import com.solvd.bankingandinsurance.utilities.FullName;
import com.solvd.bankingandinsurance.utilities.address.Address;

public class SecurityOfficer<E extends EntryLevel> {
	private E e;
	private Collection<E> securityOfficer;

	public SecurityOfficer(FullName fullName, Address address, Integer taxIdNumber, String gender, DateUtil dateOfBirth,
			String jobTitle, String employeeID, DateUtil dateHired, String emailAddress, String phoneExtension) {
		super();

	}

	public SecurityOfficer(E entryLevel) {

		this.e = entryLevel;

	}

	public E getT() {
		return e;
	}

	public void setT(E e) {
		this.e = e;
	}

	public Collection<E> getSecurityOfficer() {
		return securityOfficer;
	}

	public void setSecurityOfficer(Collection<E> securityOfficer) {
		this.securityOfficer = securityOfficer;
	}

	@Override
	public String toString() {
		return " [ " + e + "\n";
	}

}