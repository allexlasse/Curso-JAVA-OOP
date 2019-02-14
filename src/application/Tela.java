package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;


public class Tela {

	public static List<Employee> EmployeeList = new ArrayList<>();
	
	public static void Menu() {
		
		System.out.println("MENU\n"
				+ "Select one of the following options:\n"
				+ "1 - Register Employee\n"
				+ "2 - Raise salary\n"
				+ "3 - Show Employees Information\n"
				+ "4 - EXIT\n");
	}
	
	
	public static void RegisterEmployee() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//ID
		System.out.print("Enter ID: ");
		int id = sc.nextInt();
		//Name
		System.out.print("Enter employee name: ");
		String name = sc.next();
		//Salary
		System.out.print("Enter eployee salary: ");
		double salary = sc.nextDouble();
		Employee x = new Employee(id,name,salary);
		EmployeeList.add(x);
	}
	
	public static void GiveEmployeeRaise() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID: ");
		int id = sc.nextInt();
		Employee findId = EmployeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(findId == null) {
			System.out.println("ID not found.");
		}
		else {
			System.out.print("Enter percentage: ");
		    double percentage = sc.nextDouble();
		    findId.RaiseSalary(percentage);
		    System.out.println(findId);
		}
	}
	
	public static void ShowEmployees() {
		for (Employee x : EmployeeList) {
			System.out.println(x);
		}
	}
}
