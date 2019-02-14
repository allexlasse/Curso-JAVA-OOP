package entities;

public class Employee {

	private int Id;
	private String Name;
	private double Salary;
	
	//Constructor
	
	public Employee() {
	}

	public Employee(int id, String name, double salary) {
		Id = id;
		Name = name;
		Salary = salary;
	}
	
	// Getter and Setter
	
	public int getId() {
		return Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getSalary() {
		return Salary;
	}
	
	// METHODS
	
	public double RaiseSalary(double percentage) {
		if(percentage >= 1.00) {
			percentage = Salary * percentage / 100;
			return Salary += percentage;
		}
		else {
			percentage = Salary * percentage;
			return Salary += percentage;
			
		}
	}
	
	// toString 
	
	public String toString() {
		return "ID: "
				+ Id
				+ ", Employee name: "
				+ Name
				+ ", Salary: $"
				+ String.format("%.2f", Salary);
	}
	
	
}
