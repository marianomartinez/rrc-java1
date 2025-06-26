package net.codejava;

import java.util.ArrayList;

/**
 * TestClass: it hosts the Main class, to create objects, group in an ArrayList, and output to the console
 * <p>
 * @author Mariano Martinez
 * @version 1.0
 * <p>
 * Assignment: #3
 * Course: ADEV-1000
 * Date Created: 2025-02-18
 * uploaded to git
 */ 
public class TestClass {

	public static void main(String[] args) {
		
		// Creates two object instances as per the instructions requirement
		Car myCar = new Ferrari(2, 4, "red", "Testarosa", 1988, 500000);
		Truck myTruck = new Ford(5, 3);
		
		// Creates an ArrayList collection of objects
		ArrayList<Vehicle> myVehicles = new ArrayList<>();
		myVehicles.add(myCar);
		myVehicles.add(myTruck);
		
		// Output to console
		System.out.println("My current list has " + myVehicles.size() + " vehicles.");
		displayVehicles(myVehicles);
		
	}
	
	static void displayVehicles(ArrayList<Vehicle> arrayList)
	{
		arrayList.forEach(System.out::println); // Using forEach, as it is a cleaner syntax for the output needed.
	}
}
