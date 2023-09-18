package boardingHouse;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many students will rent a room?");
		int students = sc.nextInt();
		
		if(students>10 && students<=0) {
			students = sc.nextInt();
		}
		
		Rooms[] rooms = new Rooms[10];
		
		for(int i=1; i<=students; i++) {
			
			System.out.printf("Rent #%d%n", i);
			System.out.println("Name");
			String name = sc.next();
			System.out.println("Email");
			String email = sc.next();
			System.out.println("Room");
			int roomNumber = sc.nextInt();
			Rooms room = new Rooms(name,email);
			rooms[roomNumber] = room;
		}
		System.out.println("Busy rooms");
		for(int i=0; i<10;i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
