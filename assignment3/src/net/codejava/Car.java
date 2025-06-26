package net.codejava;

/**
 * Car: defines the Car Class
 * <p>
 * @author Mariano Martinez
 * @version 1.0
 * <p>
 * Assignment: #3
 * Course: ADEV-1000
 * Date Created: 2025-02-18
 * 
 */

public class Car implements Vehicle {
	private int doors;
	private int wheels;
	private String color;
	
	
	/**
	 * Constructor of the Car Class
	 * 
	 * @param doors
	 * @param wheels
	 * @param color
	 * 
	 */
	
	public Car() {};
	
	public Car(int doors, int wheels, String color) {
		this.doors = doors;
		this.wheels = wheels;
		this.color = color;
	};
	
	
	// Setters
	public void setDoors(int doors)
	{
		this.doors = doors;
	}
	
	public void setWheels(int wheels)
	{
		this.wheels = wheels;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	
	// Getters
	public int getDoors()
	{
		return this.doors;
	}
	
	public int getWheels()
	{
		return this.wheels;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	
	// Override toString() method
	public String toString()
	{
		String response = "I am a " + color + " Car with " + doors + " doors and " + wheels + " wheels.";
		return response;
	}
	
	
	// Other methods
	public void drive() 
	{
		System.out.println("The car is moving");
	}
	
	public boolean stop() 
	{
		System.out.println("The car stopped");
		return true;
	}
	
	public void steer(int steerInput)
	{
		System.out.println("The car steered " + steerInput);
	}

}
