package naturalPerson_legalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;
import entities.Company;
import entities.Individual;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais podem ser PESSOA FÍSICA ou PESSOA JURÍDICA, e depois mostrar o valor do IMPOSTO PAGO por cada um, bem como o TOTAL DE IMPOSTO arrecadado.

		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		List <TaxPayer> list = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			System.out.printf("Tax payer#%d data: \n", i);
			System.out.println("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual Income: ");
			Double annualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health Expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, annualIncome, healthExpenditures));
			} else if (ch == 'c') {
				System.out.print("Number of Employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, annualIncome, numberOfEmployees));
	
			}
		
		
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(TaxPayer tx : list) {
			System.out.printf("%s: $ %.2f\n", tx.getName(),tx.tax());
	}
}
		
}
