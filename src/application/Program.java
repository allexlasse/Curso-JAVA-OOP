package application;
import java.util.Locale;
import java.util.Scanner;
import util.Currency;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dollar Value: ");
		double dollarValue = sc.nextDouble();
		System.out.print("How many will be bought: ");
		double amount = sc.nextDouble();
		System.out.println("Total value of the purchase: " 
		+ String.format("%.2f", Currency.CurrencyConvert(dollarValue, amount)));
		
		sc.close();
	}

}
