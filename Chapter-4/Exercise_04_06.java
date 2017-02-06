import java.util.Scanner;

public class Exercise_04_06 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

// Generate random points on circle

	final int RADIUS = 40;

	double angle1 = (Math.random() * (2*Math.PI) + 0);
	double angle2 = (Math.random() * (2*Math.PI) + 0);
	double angle3 = (Math.random() * (2*Math.PI) + 0);

	double x1 = RADIUS * Math.cos(angle1);
	double y1 = RADIUS * Math.sin(angle1);

	double x2 = RADIUS * Math.cos(angle2);
	double y2 = RADIUS * Math.sin(angle2);

	double x3 = RADIUS * Math.cos(angle3);
	double y3 = RADIUS * Math.sin(angle3);

// Find distance between generated points

	double a = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	double b = Math.sqrt(Math.pow((x3-x2), 2) + Math.pow((y3-y2), 2));
	double c = Math.sqrt(Math.pow((x1-x3), 2) + Math.pow((y1-y2), 2));

// Compute angles
	double C = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / 
	(2 * a * b));

	double A = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) /
	(2 * b * c));

	double B = Math.acos((Math.pow(c, 2) + Math.pow(a, 2) - Math.pow(b, 2)) /
	(2 * c * a));

	C = Math.toDegrees(C);
	A = Math.toDegrees(A);
	B = Math.toDegrees(B);
  
  //Display results:

	System.out.printf("Three points: (%.2f, %.2f), (%.2f, %.2f), and (%.2f, %.2f).", x1, y1, x2, y2, x3, y3);

	System.out.printf("\nAngles between points, in degrees: %.2f, %.2f, and %.2f.\n", A, B, C);

	}
}  
