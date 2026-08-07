package com.constructor.assignment2;
import java.util.*;


class CommissionDemo {
	String name;
	String address;
	long phone;
	float salesAmount;
	double commission;
	
	Scanner sc = new Scanner(System.in);
	
	void getDetails() {
		System.out.print("Enter your name : ");
		name = sc.nextLine();
		
		System.out.print("Enter your address : ");
		address = sc.nextLine();
		
		System.out.print("Enter your Mobile Number : ");
		phone = sc.nextLong();
		
		System.out.print("Enter your Sales Amount : ");
		salesAmount = sc.nextFloat();	
	}
	
	void displayDetails() {
		System.out.println("\n-----------Employee Details-----------");
		System.out.println("Name          : "+ name);
		System.out.println("Address       : "+ address);	
		System.out.println("Mobile No     : "+ phone);	
		System.out.println("Sales Amount  : "+ salesAmount);
		System.out.println("Commission    : "+ commission);
		System.out.println("----------------------------------------");
	}
	
	void calculateCommission(){
		if(salesAmount >= 100000) {
			commission = salesAmount * 0.10;
		}else if(50000 <= salesAmount && salesAmount < 100000) {
			commission = salesAmount * 0.05;
		}else if(30000 <= salesAmount && salesAmount < 50000) {
			commission = salesAmount * 0.03;
		}else {
			commission = 0;
		}
	}
	
}

public class Commission {
	public static void main(String[] args) {

        System.out.println("Enter your details:");

        CommissionDemo obj = new CommissionDemo();

        obj.getDetails();
        obj.calculateCommission();
        obj.displayDetails();

        obj.sc.close();
    }
}
