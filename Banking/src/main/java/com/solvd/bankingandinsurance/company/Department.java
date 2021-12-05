
package com.solvd.bankingandinsurance.company;

import java.util.List;

import com.solvd.bankingandinsurance.employee.Employee;

public abstract class Department {

	private String name;
	private String description;
	private List<Employee> employee;

	public Department() {
	}

	public Department(String name, int department_id, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return " Department : " + " name '" + name + " description : " + description + "\n";
	}
}