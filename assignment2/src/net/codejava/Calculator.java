package net.codejava;


public class Calculator {
	
	public static int calculate(int opNumber1, int opNumber2, String opOperation) 
	{
		int total = 0;
		switch (opOperation)
		{
			case "a":
				total = opNumber1 + opNumber2;
				break;
			
			case "s":
				total = opNumber1 - opNumber2;
				break;
				
			case "m":
				total = opNumber1 * opNumber2;	
				break;
		}
		return total;
	}	
}
