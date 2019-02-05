package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] X = new double[3] , Y = new double[3];
		
		System.out.println("Measures of triagle X: ");
		X[0] = sc.nextDouble();
		X[1] = sc.nextDouble();
		X[2] = sc.nextDouble();
		System.out.println("Measures of triangle Y: ");
		Y[0] = sc.nextDouble();
		Y[1] = sc.nextDouble();
		Y[2] = sc.nextDouble();
		
		double p = (X[0] + X[1] + X[2]) / 2.0;
		double areaX = Math.sqrt(p * (p-X[0]) * (p-X[1]) * (p-X[2]));
		
		p = (Y[0] + Y[1] + Y[2]) / 2.0;
		double areaY = Math.sqrt(p * (p-Y[0]) * (p-Y[1]) * (p-Y[2]));
		
		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		
		if(areaX>areaY)
			System.out.println("Larger area: X");
		else if(areaX<areaY)
			System.out.println("Larger area: Y");
		else
			System.out.println("X and Y have the same area.");
		
		sc.close();
	}

}
