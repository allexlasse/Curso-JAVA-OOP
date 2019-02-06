package util;

public class Currency {
	public static final double IOF = 0.06;
	
	public static double CurrencyConvert(double dollarValue, double amount) {
		return (dollarValue * amount) + (dollarValue * amount * IOF);
	}
}
