package com.userinput.assignment1;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------Please Enter your Details [name. rollno, grade , percenatge]-------");
		String fullName = sc.nextLine();
		int rollNo = sc.nextInt();
		char grade = sc.next().charAt(0);
		float percentage = sc.nextFloat();
		
		
		System.out.println(fullName);
		System.out.println(rollNo);
		System.out.println(grade);
		System.out.println(percentage);
		
		sc.close();
	}

}
