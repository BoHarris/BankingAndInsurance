
package com.solvd.bankingandinsurance.company.generics;

import java.util.Collection;

import com.solvd.bankingandinsurance.employee.LowerLevelManager;
import com.solvd.bankingandinsurance.utilities.DateUtil;
import com.solvd.bankingandinsurance.utilities.FullName;
import com.solvd.bankingandinsurance.utilities.address.Address;

public class BankManager<E extends LowerLevelManager> {
		private E e;
		private Collection<E> BankManager;

		public BankManager(FullName fullName, Address address, Integer taxIdNumber, String gender, DateUtil dateOfBirth,
				String jobTitle, String employeeID, DateUtil dateHired, String emailAddress, String phoneExtension) {
			super();

		}

		public BankManager(E lowervelerManager) {

			this.e = lowervelerManager;

		}

		public E getT() {
			return e;
		}

		public void setT(E e) {
			this.e = e;
		}



		public Collection<E> getBankManager() {
			return BankManager;
		}

		public void setBankManager(Collection<E> bankManager) {
			BankManager = bankManager;
		}

		@Override
		public String toString() {
			return " [ " + e + "\n";
		}

	}
