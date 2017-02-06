/** Write a program that prompts the user to enter the latitude 
*   and longitude of two points on the earth in degrees and
*   displays its great circle distance.
*/

import java.util.Scanner;

public class Exercise_04_02 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

// Prompt user to enter the latitude and longitude of two points on the earth, in degrees.

	System.out.print("Enter point one, in degrees (latitude, longitude): ");
	String coordinateOne = input.nextLine();

	System.out.print("Enter point two, in degrees (latitude, longitude): ");
	String coordinateTwo = input.nextLine();

// Extract variables from strings

	if (coordinateOne.startsWith("(")
	|| coordinateTwo.startsWith("(")) {

	coordinateOne = coordinateOne.replaceAll("[()]", "");
	coordinateTwo = coordinateTwo.replaceAll("[()]", "");

		}

	else if (!coordinateOne.contains(",")
	|| !coordinateTwo.contains(",")) {
		System.out.println("Invalid input. Please seperate coordinate values with a comma (,).");
		System.exit(0);
		}

	int comma = coordinateOne.indexOf(',');
	String x1 = coordinateOne.substring(0, comma);
	String y1 = coordinateOne.substring(comma + 1);
		
	int comma2 = coordinateTwo.indexOf(',');
	String x2 = coordinateTwo.substring(0, comma2);
	String y2 = coordinateTwo.substring(comma2 + 1);

	x1 = x1.replaceAll("\\s", "");
	y1 = y1.replaceAll("\\s", "");
	x2 = x2.replaceAll("\\s", "");
	y2 = y2.replaceAll("\\s", "");

// Convert strings to double values
	double x1_degrees = Double.parseDouble(x1);
	double y1_degrees = Double.parseDouble(y1);
	double x2_degrees = Double.parseDouble(x2);
	double y2_degrees = Double.parseDouble(y2);

// Convert degree values to radians

	double x1_radians = Math.toRadians(x1_degrees);
	double y1_radians = Math.toRadians(y1_degrees);
	double x2_radians = Math.toRadians(x2_degrees);
	double y2_radians = Math.toRadians(y2_degrees);

// Calculate great circle distance

	final double RADIUS = 6371.01;
	double distance = RADIUS * Math.acos(
	(Math.sin(x1_radians) * 
	Math.sin(x2_radians) + 
	Math.cos(x1_radians) * 
	Math.cos(x2_radians) * 
	Math.cos(y1_radians - y2_radians) ));

// Display result
	System.out.println("The distance between the two points is: " + distance + " km.");
	}
	
}
