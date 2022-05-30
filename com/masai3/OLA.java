package com.masai3;

public class OLA extends Car {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		Car c1 = new Car();
		numberOfPassenger = c1.getNumberOfPassenger();
		numberOfKMs = c1.getNumberOfKms();
		
		return c1;
		
	}
	
	public int calculateBill(Car car) {
		Car c1 = new Car();
		int p = c1.getNumberOfPassenger();
		int totalFare;
		
		if(p <= 3) {
			Sedan s1 = new Sedan();
			totalFare=c1.getNumberOfKms()*s1.farePerKm;
			return totalFare;
		}
		
		else {
				HatchBack h1 = new HatchBack();
				totalFare=c1.getNumberOfKms()*h1.farePerKm;
				return totalFare;
			}
		}		
}

