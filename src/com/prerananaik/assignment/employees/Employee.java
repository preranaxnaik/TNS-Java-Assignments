package com.prerananaik.assignment.employees;

public class Employee {
    // Private members
    private String name;
    private int employeeId;
    private float salary;

    // Protected member
    protected String companyName;

    // Default access method
    void displayCompany() {
        System.out.println("Company Name : " + companyName);
    }

    // Default constructor
    public Employee() {

    }

    // Parameterized constructor
    public Employee(String name, int employeeId, float salary, String companyName) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.companyName = companyName;
    }

    // Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public float getSalary() {
		return salary;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}


	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


}
