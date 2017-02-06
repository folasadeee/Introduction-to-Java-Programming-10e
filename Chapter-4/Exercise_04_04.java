import java.util.Scanner;

public class Exercise_04_04 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

// Prompt user to enter the side of hexagon

	System.out.print("Enter side length of hexagon: ");
	double side = input.nextDouble();

// Compute area

	double area = (6 * Math.pow(side, 2))/ (4 * Math.tan(Math.PI/6));

// Display result

	System.out.printf("The area of the hexagon is %.2f", area);

	}
}
