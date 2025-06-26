package net.codejava;

/**
 * Truck: defines the Truck Class
 * <p>
 * @author Mariano Martinez
 * @version 1.0
 * <p>
 * Assignment: #3
 * Course: ADEV-1000
 * Date Created: 2025-02-18
 * 
 */

public class Truck implements Vehicle {
	private int gears;
	private int horn;
	
	
	/**
	 * Constructor of the Truck Class
	 * 
	 * @param gears
	 * @param horn
	 * 
	 */
	
	public Truck() {};
	
	public Truck(int gears, int horn) {
		this.gears = gears;
		this.horn = horn;
	};
	
	
	// Setters
	public void setGears(int gears)
	{
		this.gears = gears;
	}
	
	public void setHorn(int horn)
	{
		this.horn = horn;
	}


	// Getters
	public int getGears()
	{
		return this.gears;
	}
	
	public int getHorn()
	{
		return this.horn;
	}
	
	
	// Override toString() method
	public String toString()
	{
		String response = "I am a Truck with " + gears + " gears and a type " + horn + " horn.";
		return response;
	}
	
	
	// Other methods
	public void drive()
	{
		System.out.println("The truck is moving");
	}
	
	public boolean stop()
	{
		System.out.println("The truck stopped");
		return true;
	}
	
	public void steer(int steerInput)
	{
		System.out.println("The truck steered " + steerInput);
	}
	
	public void honk()
	{
		System.out.println("The truck is honking");
	}
}
