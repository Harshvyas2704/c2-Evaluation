package com.masai2;

import java.util.Scanner;

public class Demo {
	 
	int total = 0;

	public static void main(String[] args) {

			Demo d1 = new Demo();
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("How many Student objects need to be created");
			int noOfObject = input.nextInt();
			Student s1 = new Student();
			
			Object[] details = new Object[noOfObject];
			
			for(int i=0; i<noOfObject; i++) {
				

			System.out.println("Enter roll number");
			int rollNumber = input.nextInt();
		
			System.out.println("Enter your name");
			String name = input.next();
			
			System.out.println("Enter your address");
			String address = input.next();
			
			System.out.println("Enter your marks");
			int marks = input.nextInt();
			
			s1.setRoll(rollNumber);
			s1.setName(name);
			s1.setAddress(address);
			s1.setMarks(marks);
			
			String studentName = s1.getName();
			String studentAddress = s1.getAddress();
			int studentRoll = s1.getRoll();
			int studentMarks = s1.getMarks();
			
			System.out.println(studentName);
			System.out.println(studentRoll);
			System.out.println(studentMarks);
			System.out.println(studentAddress);
			
			d1.total += studentMarks;
		}
			
			System.out.println("Average marks is: " + (d1.total/noOfObject));
	}

}
