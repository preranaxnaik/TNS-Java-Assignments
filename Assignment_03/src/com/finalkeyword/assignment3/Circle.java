package com.finalkeyword.assignment3;
import java.util.Scanner;


public class Circle {
	
	float radius;
	String color;
	final float PI = 3.14f;
	float area;
	
	Scanner sc = new Scanner(System.in);
	
	void getInput(){
		System.out.print("Enter the radius : ");
		radius = sc.nextFloat();
		sc.nextLine(); 			//consumes next line
		System.out.print("Enter the color : ");
		color = sc.nextLine();
	}
	
	void calcArea() {
		area = PI * radius * radius;
	}
	
	void displayDetails() {
		System.out.println("--------Circle Details---------");
		System.out.println("Radius : " + radius);
		System.out.println("Color : " + color);
		System.out.println("Area  : " + area);
	}
	
	public static void main(String[] args) {
		
		Circle obj = new Circle();
		obj.getInput();
		obj.calcArea();
		obj.displayDetails();
		obj.sc.close();
	}

}
