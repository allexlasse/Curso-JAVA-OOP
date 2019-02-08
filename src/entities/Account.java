package entities;

public class Account {
	
	private static final double FEE = 5.00;
	
	private int AccountNumber;
	private String OwnerName;
	private double Balance;
	
	//CONSTRUCTORS
	
	public Account(int accountNumber, String ownerName, double balance) {
		AccountNumber = accountNumber;
		OwnerName = ownerName;
		Balance = balance;
	}
	
	public Account(int accountNumber, String ownerName) {
		AccountNumber = accountNumber;
		OwnerName = ownerName;
		Balance = 0.00;
	}
	
	//GETTERS AND SETTERS
	
	public int getAccountNumber() {
		return AccountNumber;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}
	
	public double getBalance() {
		return Balance;
	}
	
	//BALANCE OPERATIONS

	public double Withdraw(double amount) {
		return Balance -= amount + FEE;
	}
	
	public double Deposit(double amount) {
		return Balance += amount;
	}
	
	// toString
	
	public String toString() {
		return "Account Number: " 
				+ AccountNumber
				+ "\nAccount owner's name: "
				+ OwnerName
				+ "\nBalance: "
				+ Balance;
	}

}
