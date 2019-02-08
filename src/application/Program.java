package application;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		HashSet<Account> Accounts = new HashSet<Account>();
		boolean exit = false;
		
		while(exit == false) {
			System.out.println("MENU"
					+ "\nPlease select an option:"
					+ "\n1 - Create Account"
					+ "\n2 - Show Account Details"
					+ "\n3 - Withdraw"
					+ "\n4 - Deposit"
					+ "\n5 - EXIT");
			int option = sc.nextInt();
			switch(option) {
			// CREATE ACCOUNT
			case 1:
				//Account Number
				System.out.print("Enter account number: ");
				int accountNumber = sc.nextInt();
				//Owner Name
				System.out.print("Enter account owner's name: ");
				String ownerName = sc.next();
				//Deposit
				System.out.print("Do you want to make a deposit?\n[Y]es/[N]o - ");
				char depositOption = sc.next().charAt(0);
				while(depositOption != 'y' || depositOption != 'Y' ||
						depositOption != 'n' || depositOption != 'N') {
					
					if(depositOption == 'y' || depositOption == 'Y') {
						System.out.print("Enter the amount you want to deposit: ");
						double depositAmount = sc.nextDouble();
						Account acc = new Account(accountNumber, ownerName, depositAmount);
						Accounts.add(acc);
						System.out.println("Account Details:\n" + acc);
						break;
					}
					else if(depositOption == 'n' || depositOption == 'N') {
						Account acc = new Account(accountNumber,ownerName);
						Accounts.add(acc);
						System.out.println("Account Details:\n" + acc);
						break;
					}
					else {
						System.out.print("Enter a valid option: [Y]es/[N]o - ");
						depositOption = sc.next().charAt(0);
					}
				}
				break;
			// SHOW DETAILS	
			case 2:
				System.out.print("Enter account number to show details: ");
				int accNumber = sc.nextInt();
				for(Account acc : Accounts) {
					if(acc.getAccountNumber() == accNumber) {
						System.out.println(acc);
					}
					else {
						System.out.println("Account number not found.");
					}	
				}
				break;
			// WITHDRAW
			case 3:
				System.out.print("Enter account number: ");
				int withdrawNumber = sc.nextInt();
				for(Account acc : Accounts) {
					if(acc.getAccountNumber() == withdrawNumber) {
						System.out.print("Enter amount to be witdrawn: ");
						double Amount = sc.nextDouble();
						acc.Withdraw(Amount);
					}
					else {
						System.out.println("Account number not found.");
					}	
				}
				break;
			// DEPOSIT
			case 4:
				System.out.print("Enter account number: ");
				int depositNumber = sc.nextInt();
				for(Account acc : Accounts) {
					if(acc.getAccountNumber() == depositNumber) {
						System.out.print("Enter amount to be deposited: ");
						double Amount = sc.nextDouble();
						acc.Deposit(Amount);
					}
					else {
						System.out.println("Account number not found.");
					}	
				}
				break;
			// EXIT
			case 5:
				exit = true;
				System.out.println("EXIT!");
				break;
			}
		}
		
		
		sc.close();
	}

}
