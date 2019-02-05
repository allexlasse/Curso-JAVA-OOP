package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x = new Triangle() , y = new Triangle();
		
		System.out.println("Measures of triagle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.println("Triangle X area: " + x.Area());
		System.out.println("Triangle Y area: " + y.Area());
		
		if(x.Area() > y.Area())
			System.out.println("Triangle X has the largest area.");
		else if(x.Area() < y.Area())
			System.out.println("Triangle Y has the largest area.");
		else
			System.out.println("Both triangles have the same area.");
		sc.close();
	}

}
