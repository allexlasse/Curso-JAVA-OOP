package course;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println(HigherBetween(a,b,c));
		
		sc.close();
	}
	
	public static int HigherBetween (int x, int y, int z) {
		HashSet<Integer> List = new HashSet<Integer>(Arrays.asList(x, y, z));
		int Higher = Collections.max(List);
		return Higher;
	}
}
