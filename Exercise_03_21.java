import java.util.Scanner;

public class Exercise_03_21 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

// Prompt user input
	System.out.print("Enter year (e.g. 2012): ");
	int year = input.nextInt();

	System.out.print("Enter month (1-12): ");
	int month = input.nextInt();

	System.out.print("Enter day of the month (1-31): ");
	int day = input.nextInt();

//Calculate values
	
	int q = day;
	
	int m = month;

//Calculate month (i.e. change input for January/February)

        if (m == 1) {
		m = 13;
		year = --year;
		}


        if (m == 2) {
		m = 14;
		year = --year;
		}

//Determine century and year of century

        int k = year % 100;
        int j = year / 100;

//Perform Zeller's congruance
	
	int h = ( q + ( 26 * (m+1) / 10 ) + k + ( k / 4 ) + ( j / 4 ) + ( 5 * j ) ) % 7;

	
// Display result

	switch (h) {
	case (0): System.out.println("Day of the week is Saturday."); break;
	case (1): System.out.println("Day of the week is Sunday."); break;
	case (2): System.out.println("Day of the week is Monday."); break;
	case (3): System.out.println("Day of the week is Tuesday."); break;
	case (4): System.out.println("Day of the week is Wednesday."); break;
	case (5): System.out.println("Day of the week is Thursday."); break;
	case (6): System.out.println("Day of the week is Friday.");
		}
	}
}
