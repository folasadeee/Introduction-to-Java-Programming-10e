import java.util.Scanner;

public class Exercise_04_17 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

// Prompt user to enter a year and month

	System.out.print("Enter a year: ");
	int year = input.nextInt().trim().toLowerCase();

	System.out.print("Enter a month: ");
	String month = input.next();

	month = month.substring(0, 3);
	int days = 0;
	
	switch(month) {
	case "feb": 	if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				days = 29;
			else 
				days = 28; break;
	case "jan": days = 31;
	case "mar": 
	case "may":
	case "jul": 
	case "aug": 
	case "oct": 
	case "dec": break;
	case "apr": days = 30;
	case "jun":
	case "sep":
	case "nov": break;
		}

	System.out.println(month.toUpperCase() + " " + year + " has " + days + " days.");


	}
}
