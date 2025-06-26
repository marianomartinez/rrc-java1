package net.codejava;
import java.util.Scanner;

public class App {
	public static void main (String[] args) {
		
		// Greeting message
		System.out.println("*** Custom Calculator ***");

		
		// Initialize the input
		Scanner scanner = new Scanner(System.in);

				
		// Get and validate input
		int opNumber1 = getOpNumber("Enter first value: ", scanner);
		int opNumber2 = getOpNumber("Enter second value: ", scanner);
		String opOperation = getOpOperation(scanner);
		
		
		// Perform calculation
		int total = Calculator.calculate(opNumber1, opNumber2, opOperation);
		
		
		// Build and print output
        System.out.println("");
		System.out.printf("The total is $%d", total);
        System.out.println("");
		
        
		// Close the input
		scanner.close();
		
	}
	

	// Prompt user to input a number
	// - keeps prompting until the input is valid
	// - takes a message as a parameter so it can be re-used for input 1 and input 2
	// - calls the checkNumeric() method, which handles exception
	// - calls the checkPositive() method, which handles exception
	// - returns the integer value of the input
	private static int getOpNumber(String message, Scanner scanner) {
		int opNumber = 0;
		while (true) {
            try 
            {
                System.out.print(message);
                String data = scanner.nextLine();
                opNumber = convertToInteger(data);
                checkPositive(opNumber);
        		return opNumber;
            } 
            catch (CustomValidationException cve) 
            {
                System.out.println("Caught exception: " + cve.getMessage());
                System.out.println("");
            }           
        }
	}
	
	// convertToInteger() returns the input converted to integer, or throws exception
	private static int convertToInteger(String input) throws CustomValidationException {
	    try 
	    {
	        return Integer.parseInt(input);
	    }
	    catch (NumberFormatException nfe) 
	    {
	        throw new CustomValidationException("!!! Input must be numeric !!!");
	    }
	}
	
	// checkPositive() returns true if the integer is positive, or returns false and throws exception if it is not positive
	private static void checkPositive(int input) throws CustomValidationException {
		if (input <= 0)
		{
			throw new CustomValidationException("!!! Number must be greater than 0 !!!");
		}
	}
	
	// // Prompt user to input the operation
	// - keeps prompting until the input is valid
	// - returns the string value of the operation
	private static String getOpOperation(Scanner scanner) {
		String opOperation = "";
		while (true) 
		{
            try 
            {
                System.out.print("Enter operation (a=Add, s=Subtract, m=Multiply): ");
                opOperation = scanner.nextLine();
                checkValidOperation(opOperation);
                return opOperation;
            } 
            catch (InvalidOperationException ioe) 
            {
                System.out.println("Caught exception: " + ioe.getMessage());
                System.out.println("");
            }
        }
		
	}

	// checkValidOperation() throws exception if if the input is a not dvalid operation
	private static void checkValidOperation(String opOperation) throws InvalidOperationException {
		if (!(opOperation.equals("a") || opOperation.equals("s") || opOperation.equals("m")))  
		{
			throw new InvalidOperationException("!!! Operation must be 'a', 's', or 'm' !!!");
		}
	}
	
}

