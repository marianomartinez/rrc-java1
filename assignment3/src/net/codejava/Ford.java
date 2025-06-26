package net.codejava;

/**
 * Ford: defines the Ford Class
 * <p>
 * @author Mariano Martinez
 * @version 1.0
 * <p>
 * Assignment: #3
 * Course: ADEV-1000
 * Date Created: 2025-02-18
 * 
 */

public class Ford extends Truck {
	
	/**
	 * Constructor of the Ford Class
	 * 
	 * @param badge
	 * @param year
	 * @param price
	 * 
	 */

	Ford(int gears, int horn)
	{
		super(gears, horn);
	}
	
	
	// Override toString() method
	public String toString()
	{
		String response = "*** I am a Ford truck with " + getGears() + " gears and a type " + getHorn() + " horn. ***";
		return response;
	}
		
	// Other methods
	public void drive()
	{
		System.out.println("The Ford truck is moving");
	}
	
	public boolean stop()
	{
		System.out.println("The Ford truck stopped");
		return true;
	}
	
	public void steer(int steerInput)
	{
		System.out.println("The Ford truck steered " + steerInput);
	}
	
	public void honk()
	{
		System.out.println("The truck is honking");
	}
}
