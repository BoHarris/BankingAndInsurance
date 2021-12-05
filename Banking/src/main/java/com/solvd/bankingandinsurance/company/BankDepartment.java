
package com.solvd.bankingandinsurance.company;

import java.util.List;

import com.solvd.bankingandinsurance.employee.Employee;

public class BankDepartment extends Department {

	private Department department;
	private List<Employee> employee;

	public BankDepartment() {
	}

	public BankDepartment(Department department) {
		this.setDepartment(department);
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Employee> getEmployeeDepartment() {
		return employee;
	}

	public void setEmployeeDepartment(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department : " + department + "Employee : " + employee + "\n";
	}
}