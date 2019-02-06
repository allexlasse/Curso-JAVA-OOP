package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Radius: ");
		double radius = sc.nextDouble();
		
		System.out.println("Volume: " + String.format("%.2f", Volume(radius))
				+"\nCircumference: " + String.format("%.2f", Circumference(radius))
				+ "\nPi value: " + PI);
		
		sc.close();
	}
	
	public static double Circumference(double radius) {
		return 2 * PI * radius;
	}
	
	public static double Volume(double radius) {
		return (4.0 * PI * Math.pow(radius, 3)) / 3.0;
	}

}
