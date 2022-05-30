package com.masai3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter No. of pasanges");
		int noOfPasanger = input.nextInt();
		
		System.out.println("Enter No. of km to traval");
		int noOfKm = input.nextInt();
		
		Car c1 = new Car();
		c1.setNumberOfPassenger(noOfPasanger);
		c1.setNumberOfKms(noOfKm);
		
		OLA o1 = new OLA();
		System.out.println("Total Ammount is: " + o1.calculateBill(c1));
		
	}
}
