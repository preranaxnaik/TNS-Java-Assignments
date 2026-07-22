package com.prerananaik.assignment.employees;

public class Manager extends Employee{
	int teamSize;
	
	public int getTeamSize() {
		return teamSize;
	}
	
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
    public Manager() {

    }

    public Manager(String name, int employeeId, float salary,String companyName, int teamSize)
    {
        super(name, employeeId, salary, companyName);
        this.teamSize = teamSize;
    }

    public void showCompany() {
        System.out.println("Company : " + companyName);
    }


}
