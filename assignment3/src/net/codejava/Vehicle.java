package net.codejava;

/**
 * Vehicle: The Vehicle interface defines the basic methods of every vehicle
 * <p>
 * @author Mariano Martinez
 * @version 1.0
 * <p>
 * Assignment: #3
 * Course: ADEV-1000
 * Date Created: 2025-02-18
 * 
 */

interface Vehicle {
	void drive();
	boolean stop();
	void steer(int steerInput);
}
