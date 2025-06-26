package net.codejava;

import java.text.NumberFormat;

/**
 * Ferrari: defines the Ferrari Class
 * <p>
 * @author Mariano Martinez
 * @version 1.0
 * <p>
 * Assignment: #3
 * Course: ADEV-1000
 * Date Created: 2025-02-18
 * 
 */

public class Ferrari extends Car {
	private String badge;
	private int year;
	private double price;
	
	
	/**
	 * Constructor of the Ferrari Class
	 * 
	 * @param badge
	 * @param year
	 * @param price
	 * 
	 */
	
	public Ferrari(int doors, int wheels, String color, String badge, int year, double price) {
		super(doors, wheels, color);
		this.badge = badge; // Assuming "Badge" refers to model or trim of the car
		this.year = year;
		this.price = price;
	}
	
	
	// Setters
	public void setBadge(String badge)
	{
		this.badge = badge;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	
	// Getters
	public String getBadge()
	{
		return this.badge;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	
	// Utility methods
	static String getFormattedCurrency(double input)
	{
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		String response = currencyFormatter.format(input);
		return response;
	}
	
	
	// Override toString() method
	public String toString()
	{
		String response = "### I am a " + getColor() + ", " + getDoors() + "-door, Ferrari " + badge + " from " + year + ". My current price is " + getFormattedCurrency(price) + " including all " + getWheels() + " wheels. ###";
		return response;
	}
	
	
	
	// Other methods
	public void race()
	{
		System.out.println("The Ferrari is racing");
	}

}
