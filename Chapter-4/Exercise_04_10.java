import java.util.Scanner;

public class Exercise_04_10 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

// Define string sets
	String set1 =
			"\n 1   3   5   7\n" +
			" 9  11  13  15\n" +
			"17  19  21  23\n" +
			"25  27  29  31";

	String set2 =
			" 2   3   6   7\n" +
			"10  11  14  15\n" +
			"18  19  22  23\n" +
			"26  27  30  31";

	String set3 =
			" 4   5   6   7\n" +
			"12  13  14  15\n" +
			"20  21  22  23\n" +
			"28  29  30  31";	

	String set4 =
			" 8   9  10  11\n" +
			"12  13  14  15\n" +
			"24  25  26  27\n" +
			"28  29  30  31";

	String set5 =
			"16  17  17  19\n" +
			"20  21  22  23\n" +
			"24  25  26  27\n" +
			"28  29  30  31";

// Prompt: Set 1

	int birthday = 0;

	System.out.println(set1);
	System.out.print("Is your birth day in set 1 (Y/N)?: ");
	char set1_Answer = input.next().trim().toUpperCase().charAt(0);
	
	char Y = 'Y';
	char N = 'N';

	if (set1_Answer == Y)
		birthday = 1; 
	
	else if (set1_Answer == N)
		birthday = 0;

// Prompt: Set 2

	System.out.println(set2);
	System.out.print("Is your birth day in set 2 (Y/N)?: ");
	char set2_Answer = input.next().trim().toUpperCase().charAt(0);

	if (set2_Answer == Y)
		birthday = birthday + 2; 
	
	else if (set2_Answer == N)
		birthday = birthday + 0;

// Prompt: Set 3

	System.out.println(set3);
	System.out.print("Is your birth day in set 3 (Y/N)?: ");
	char set3_Answer = input.next().trim().toUpperCase().charAt(0);

	if (set3_Answer == Y)
		birthday = birthday + 4; 
	
	else if (set3_Answer == N)
		birthday = birthday + 0;

// Prompt: Set 4

	System.out.println(set4);
	System.out.print("Is your birth day in set 4 (Y/N)?: ");
	char set4_Answer = input.next().trim().toUpperCase().charAt(0);

	if (set4_Answer == Y)
		birthday = birthday + 8; 
	
	else if (set4_Answer == N)
		birthday = birthday + 0;

// Prompt: Set 5

	System.out.println(set5);
	System.out.print("Is your birth day in set 5 (Y/N)?: ");
	char set5_Answer = input.next().trim().toUpperCase().charAt(0);

	if (set5_Answer == Y)
		birthday = birthday + 16; 
	
	else if (set5_Answer == N)
		birthday = birthday + 0;

// Display results

	System.out.print("Your birthday is: " + birthday + "!");

	}

}
