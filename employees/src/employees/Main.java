package employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered?");
		int qt = sc.nextInt();
		
		List<Employee> employees = new ArrayList<>();
		
		for(int i=0; i<qt; i++) {
			
			System.out.printf("Employee #%d:%n", i+1);
			
			System.out.println("Id:");
			int id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Name:");
			String name = sc.nextLine();
			
			System.out.println("Salary:");
			double salary = sc.nextDouble();
			
			employees.add(new Employee(id, name, salary));
			
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int increase = sc.nextInt();
		
		Employee emp = employees.stream().filter(x -> x.getId() == increase).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println("List of Employees:");
		for(Employee each : employees) {
			System.out.println(each);
		}
		
		sc.close();
		
		

	}

}