package entities;

public class Triangle {

	public double a, b, c;
	
	public Triangle() {
		
	}
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double Area() {
		double p = (this.a + this.b + this.c) / 2.00;
		double area = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
		return area;
	}
}
