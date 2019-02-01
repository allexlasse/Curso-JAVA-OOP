package course;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> Numbers = new HashSet<Integer>();
		
		
		for(int i = 0;;i++) {
			System.out.print("Enter the " + (i+1) + "º number or '0' to exit: ");
			int aux = sc.nextInt();
			if(aux == 0)
				break;
			Numbers.add(aux);
			
		}
				
		System.out.println("The highest number typed was: " + HigherBetween(Numbers));
		
		sc.close();
	}
	
	public static int HigherBetween (HashSet<Integer> List) {
		int Higher = Collections.max(List);
		return Higher;
	}
}



