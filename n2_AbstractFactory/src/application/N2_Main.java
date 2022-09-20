package application;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class N2_Main 
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ContactBook cb = new ContactBook();
		
		boolean exit = false;
		
		while(!exit) {
			System.out.println("Enter the desired option:");
			System.out.println("    1. Add contact");
			System.out.println("    2. Modify existing contact");
			System.out.println("    3. Check existing contacts");
			System.out.println("    4. Exit");
			int opt = sc.nextInt();
			
			switch(opt) {
				case 1: cb.createContact(); break;
				case 2: cb.modifyContact(); break;
				case 3: cb.printContacts(); break;
				case 4: exit = true; System.out.println("Bye!"); break;
				default: System.out.println("Incorrect input");
			}
		}
	}
}
