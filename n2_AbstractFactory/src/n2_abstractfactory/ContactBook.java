package n2_abstractfactory;

import java.util.ArrayList;
import java.util.Scanner;

import n2_abstractfactory.generics.Contact;
import n2_abstractfactory.generics.ContactFactory;
import n2_abstractfactory.italian_contact.ItalianFactory;
import n2_abstractfactory.spanish_contact.SpanishFactory;

public class ContactBook {
	
	private ArrayList<Contact> contacts;
	
	ContactBook(){
		contacts = new ArrayList<Contact>(); 
	}
	
	public void createContact() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		

		ContactFactory cf = null;
		boolean isValidCountry = true;
		
		do {
			System.out.println("Enter their country:");
			String country = sc.nextLine();
			if (country.equalsIgnoreCase("spain")) {
				cf = new SpanishFactory();
				isValidCountry = true;
				
			} else if (country.equalsIgnoreCase("italy")) {
				cf = new ItalianFactory();
				isValidCountry = true;
				
			} else {
				isValidCountry = false;
				System.out.println("You should select a valid country");
			}
		} while (!isValidCountry);

		
		Contact c = new Contact(name, cf);
		c.addPhoneNumber();
		this.contacts.add(c);
		
		
	}
}
