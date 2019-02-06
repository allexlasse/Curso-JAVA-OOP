package application;
import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Radius: ");
		double radius = sc.nextDouble();
		
		System.out.println("Volume: " + String.format("%.2f", Calculator.Volume(radius))
				+"\nCircumference: " + String.format("%.2f", Calculator.Circumference(radius))
				+ "\nPi value: " + Calculator.PI);
		
		sc.close();
	}

}
