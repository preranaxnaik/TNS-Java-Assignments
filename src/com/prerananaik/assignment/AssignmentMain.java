package com.prerananaik.assignment;

import com.prerananaik.assignment.employees.Developer;
import com.prerananaik.assignment.employees.Manager;
import com.prerananaik.assignment.utilities.EmployeeUtilities;

//Main class to test the assignment.

public class AssignmentMain {

    public static void main(String[] args) {

        Manager manager = new Manager(
                "Prerana",
                101,
                85000f,
                "TNS India",
                10);

        Developer developer = new Developer(
                "Krushna",
                102,
                65000f,
                "TNS India",
                "Java Full Stack");

        EmployeeUtilities utility = new EmployeeUtilities();

        System.out.println("===== MANAGER DETAILS =====");
        utility.displayManager(manager);

        System.out.println();

        System.out.println("===== DEVELOPER DETAILS =====");
        utility.displayDeveloper(developer);

        System.out.println();

        utility.increaseSalary(developer, 5000f);

        System.out.println();

        System.out.println("===== UPDATED DEVELOPER DETAILS =====");
        utility.displayDeveloper(developer);
    }
}