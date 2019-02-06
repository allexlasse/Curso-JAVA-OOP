package util;

public class Calculator {
	
	public static final double PI = 3.14159;
	
	public static double Circumference(double radius) {
		return 2 * PI * radius;
	}
	
	public static double Volume(double radius) {
		return (4.0 * PI * Math.pow(radius, 3)) / 3.0;
	}
}