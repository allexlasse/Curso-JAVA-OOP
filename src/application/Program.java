package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		
		while(exit == false) {
			Tela.Menu();
			int option = sc.nextInt();
			switch(option) {
			case 1:
				Tela.RegisterEmployee();
				break;
			case 2:
				Tela.GiveEmployeeRaise();
				break;
			case 3:
				Tela.ShowEmployees();
				break;
			case 4:
				System.out.println("EXIT!");
				exit = true;
				break;
			default:
				System.out.println("Invalid command.");
				break;
			}
		}
		
		sc.close();
	}

}
