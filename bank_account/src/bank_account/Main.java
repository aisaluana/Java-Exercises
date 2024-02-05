package bank_account;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainExceptions;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		try {
		System.out.println("");
		System.out.println("Enter Account Data:");
		System.out.println("Number: ");
		int number = sc.nextInt();
		System.out.println("Holder: ");
		String holder = sc.next();
		sc.nextLine();
		System.out.println("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.println("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		
		acc.withdraw(amount);
		
		System.out.println(acc);
		
		}
		catch(DomainExceptions e){
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error!");
		}
		sc.close();

	}

}
