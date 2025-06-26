package net.codejava;
import java.util.Scanner;

public class DateConverter {

	public static void main(String[] args) {
		
		// Print a welcome message
		
		System.out.println("*** Date Validator and Formatter ***");

		
		// Get input from the user
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter a valid Day (1-31): ");
		int inputDay = Integer.parseInt(userInput.nextLine());
		
		System.out.print("Please enter a valid Month (1-12): ");
		int inputMonth = Integer.parseInt(userInput.nextLine());
		
		System.out.print("Please enter a valid Year (1582-9999): ");
		int inputYear = Integer.parseInt(userInput.nextLine());

		userInput.close();
		
		
		// Validate input range for Day, Month and Year
		// * "System.exit(0)" was added to stop the execution of the program once an error was found
		
		boolean validInputDay = validateDay(inputDay);
		if (!validInputDay)
		{
			System.exit(0);
		}
		
		boolean validInputMonth = validateMonth(inputMonth);
		if (!validInputMonth)
		{
			System.exit(0);
		}
		
		boolean validInputYear = validateYear(inputYear);
		if (!validInputYear)
		{
			System.exit(0);
		}

		
		// Validate month number of days
		// Check if input day is valid for the month and year entered
		// * Note that the general range for all three inputs has already been validated, 
		//   so only the months that have less than 31 days are being checked
		
		if (validInputDay && validInputMonth && validInputYear) {	
			switch (inputMonth) {
				
			// February
			case 2:
				// Check if it is a leap year				
				boolean isLeapYear = isLeapYear(inputYear);
				validInputDay = validateFebruary(inputDay, inputYear, isLeapYear);
				break;
				
			// 30-day month
			case 4:
			case 6:
			case 9:
			case 11:
				validInputDay = validateShortMonth(inputDay);
				break;
			}
		}
		
		
		// Create an array of months
		
		String[] months = {
				"January",
				"February",
				"March",
				"April",
				"May",
				"June",
				"July",
				"August",
				"September",
				"October",
				"November",
				"December"
		};
		
				
		// Build date output
		// * A StringBuilder class was used for the creation of the response, although the concatenation process could be simpler if it was made directly inside of the printf
		
		if (validInputDay && validInputMonth && validInputYear) 
		{
			String formattedDate = dateFormatter(inputDay, inputMonth, inputYear, months);
			System.out.println();
			System.out.printf(formattedDate);
		}
		
	}
	
	
	// Methods' declaration
	
	public static boolean validateDay(int inputDay)
	{
		if (inputDay >= 1 && inputDay <=31) 
		{
			return true;
		}
		else
		{
			System.out.println("");
			System.out.printf("[%d] is not a valid Day value.", inputDay);
			return false;
		}
	}
	
	public static boolean validateMonth(int inputMonth)
	{
		if (inputMonth >= 1 && inputMonth <=12) 
		{
			return true;
		} 
		else 
		{
			System.out.println("");
			System.out.printf("[%d] is not a valid Month value.", inputMonth);
			return false;
		}
	}
	
	public static boolean validateYear(int inputYear)
	{
		if (inputYear >= 1582 && inputYear <= 9999) 
		{
			return true;
		} 
		else 
		{
			System.out.println("");
			System.out.printf("[%d] is not a valid Year value.", inputYear);
			return false;
		}
	}
	
	public static boolean isLeapYear(int inputYear)
	{
		if (((inputYear % 4 == 0) && (inputYear % 100 != 0)) || ((inputYear % 4 == 0) && (inputYear % 100 == 0) && (inputYear % 400 == 0))) 
		{
			return true;
		}
		return false;
	}
	
	public static boolean validateFebruary(int inputDay, int inputYear, boolean isLeapYear)
	{
		if (inputDay > 28 && !isLeapYear)
		{
			System.out.println("");
			System.out.printf("[%d] February has 28 days on the selected non-leap year.", inputYear);
			return false;
		}
		else if (inputDay > 29 && isLeapYear) 
		{
			System.out.println("");
			System.out.printf("[%d] February has 29 days on the selected leap year [%d].", inputDay, inputYear);
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static boolean validateShortMonth(int inputDay)
	{
		if (inputDay > 30)
		{
			System.out.println("");
			System.out.printf("[%d] The selected month has 30 days.", inputDay);
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static String dateFormatter(int inputDay, int inputMonth, int inputYear, String months[])
	{
		StringBuilder formattedDate = new StringBuilder();
		formattedDate.append(months[inputMonth - 1])
		             .append(" ")
		             .append(inputDay)
		             .append(", ")
		             .append(inputYear);

		// Return the formatted date string
		return formattedDate.toString();
	}

}
