package com.prerananaik.assignment.utilities;

import com.prerananaik.assignment.employees.Developer;
import com.prerananaik.assignment.employees.Employee;
import com.prerananaik.assignment.employees.Manager;

/**
 * Utility class for employee operations.
 */
public class EmployeeUtilities {

    public void displayEmployee(Employee emp) {

        System.out.println("----------------------------");
        System.out.println("Employee Name : " + emp.getName());
        System.out.println("Employee ID   : " + emp.getEmployeeId());
        System.out.println("Salary        : " + emp.getSalary());
        System.out.println("Company       : " + emp.getCompanyName());
    }

    public void displayManager(Manager manager) {

        displayEmployee(manager);
        System.out.println("Team Size     : " + manager.getTeamSize());
    }

    public void displayDeveloper(Developer developer) {

        displayEmployee(developer);
        System.out.println("Technology    : " + developer.getTechnology());
    }

    public void increaseSalary(Employee emp, float amount) {

        emp.setSalary(emp.getSalary() + amount);

        System.out.println();
        System.out.println("Salary Updated Successfully!");
        System.out.println("Updated Salary : " + emp.getSalary());
    }
}