package com.revature.driver;
import com.revature.beans.*;
import java.util.Scanner;

public class Driver {
	static void input(Scanner in, User u) {
		System.out.print("Enter id: ");
		int id = Integer.parseInt(in.nextLine());
		System.out.print("Enter username: ");
		String username = in.next();
		System.out.print("Enter password: ");
		String password = in.next();
		in.nextLine();
		
		u = new User(id, username, password);
	}
	static void input(Scanner in, Order o) {
		System.out.print("Enter id: ");
		int id = Integer.parseInt(in.nextLine());
		System.out.print("Enter price: ");
		double price = Double.parseDouble(in.nextLine());
		System.out.print("Enter item name: ");
		String name = in.next();
		in.nextLine();
		
		o = new Order(id, price, name);
	}
	static int input(Scanner in) {
		return in.nextInt();
	}
	
	public static void main(String[] args) {
		Integer choice, idx;
		Scanner in = new Scanner(System.in);
		User users[] = new User[2];
		Order orders[] = new Order[2];
		
		
		for(idx = 0; idx < 2; ++idx) {
			input(in, users[idx]);
			input(in, orders[idx]);
		}
		
		idx = 0;
		do {
			System.out.println("Which object to print? type \'-1\' to exit: ");
			System.out.print("0 = User, 1 = Order: ");
			choice = input(in);
			System.out.println(choice);
			switch(choice.intValue()) {
				case 0:
					while(idx < 2)
						System.out.println(users[idx++]);
					idx = 0;
					break;
				case 1:
					while(idx < 2)
						System.out.println(orders[idx++]);
					idx = 0;
					break;
				case -1:
					System.out.println("exiting program");
					break;
				default:
					System.out.println("choice not recognized");
					break;
			}
		}while(choice != -1);
		
	}
}
