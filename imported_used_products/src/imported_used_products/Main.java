package imported_used_products;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) throws ParseException {
		// Build a program to read N products data (N typed by user). At the end, show the PRICE TAGS of each product the same order they've been typed.
		// Every product has NAME and PRICE. Imported products have a CUSTOMS FEE, and used products have a MANUFACTURE DATE. These specific data should be added to the price tag. For imported products, the customs fee should be add to the final price of the product.
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			System.out.printf("Product #%d data:\n", i);
			
			System.out.print("Common, used or imported (c/u/i)?");
			sc.nextLine();
			char ch = sc.next().charAt(0);
		
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.next();
			
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if(ch == 'u') {
				
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				String date = sc.next();
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				Date manufactureDate = formatter.parse(date);
				//Encontrar jeito melhor de retornar a data!!
				
				Product p = new UsedProduct(name,price,manufactureDate);
				list.add(p);
			} else if (ch == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				
				Product p = new ImportedProduct(name,price,customsFee);
				list.add(p);
			} else {
				Product p = new Product(name,price);
				list.add(p);
			}
			
		}
		sc.close();
		System.out.print("\nPRICE TAGS:\n");
		for(Product p : list) {
			System.out.print(p.priceTag());
		}

	}

}
