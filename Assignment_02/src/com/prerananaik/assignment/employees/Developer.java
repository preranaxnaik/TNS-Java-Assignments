package com.prerananaik.assignment.employees;

public class Developer extends Employee{
	String technology;
	
	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
    public Developer() {

    }

    public Developer(String name, int employeeId, float salary,String companyName, String technology) 
    {
        super(name, employeeId, salary, companyName);
        this.technology = technology;
    }

    public void showCompany() {
        System.out.println("Company : " + companyName);
    }

}
