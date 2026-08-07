//program to demonstrate user defined code in java

package com.userinput.assignment1;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------Please Enter your Details -------");
		System.out.print("Enter your fullname : ");
		String fullName = sc.nextLine();
		System.out.print("Enter your Roll No : ");
		int rollNo = sc.nextInt();
		System.out.print("Enter your Grade : ");
		char grade = sc.next().charAt(0);
		System.out.print("Enter your Percentage : ");
		float percentage = sc.nextFloat();
		
		System.out.println("----------STUDENT DETAILS ----------");
		System.out.println("Name	   : " + fullName);
		System.out.println("Roll No	   : " + rollNo);
		System.out.println("Grade	   : " + grade);
		System.out.println("Percentage : " + percentage);
		
		sc.close();
	}

}
