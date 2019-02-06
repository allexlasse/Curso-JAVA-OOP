package application;
import java.util.Locale;
import java.util.Scanner;
import java.util.HashSet;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product TV = new Product("TV", 900.00 , 10);
		
		System.out.println(TV + "\nTotal value in stock: " + TV.TotalValueInStock());
		
		System.out.print("Quantity to be put in stock: ");
		int add = sc.nextInt();
		TV.AddProduct(add);
		
		System.out.println("Updated data: \n" + TV + "\nTotal value in stock: " + TV.TotalValueInStock());
		
		System.out.print("Quantity to be removed from stock: ");
		int remove = sc.nextInt();
		TV.RemoveProduct(remove);
		
		System.out.println("Updated data: \n" + TV + "\nTotal value in stock: " + TV.TotalValueInStock());
		
		sc.close();
	}

}
