package n2_AbstractFactory_maven_group.n2_AbstractFactory_maven_artifact;

import java.util.ArrayList;
import java.util.Scanner;

import n2_AbstractFactory_maven_group.n2_AbstractFactory_maven_artifact.generics.Contact;
import n2_AbstractFactory_maven_group.n2_AbstractFactory_maven_artifact.generics.ContactFactory;
import n2_AbstractFactory_maven_group.n2_AbstractFactory_maven_artifact.italian_contact.ItalianFactory;
import n2_AbstractFactory_maven_group.n2_AbstractFactory_maven_artifact.spanish_contact.SpanishFactory;

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
	
	public void modifyContact() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		
		Contact c = findContact(name);
		
		if (c == null) {
			System.out.println("There is no contact with name " + name + " in the database.");
		} else {
			boolean exit = false;
			
			while (!exit) {
				System.out.println("Enter the option");
				System.out.println("    1. Modify the address");
				System.out.println("    2. Modify the phone number");
				System.out.println("    3. Exit");
				int opt = sc.nextInt();
				
				switch(opt) {
					case 1: c.addAddress(); break;
					case 2: c.addPhoneNumber(); break;
					case 3: exit = true;
				}
			}
		}
		
	}
	
	public void printContacts() {
		int num_contacts = this.contacts.size();
		
		for (int i=0; i<num_contacts; i++) {
			System.out.println(this.contacts.get(i));
		}
	}
	
	public Contact findContact(String name) {
		int num_contacts = this.contacts.size();
		Contact c = null;
		
		int i=0;
		boolean found = false;
		
		while (i<num_contacts & !found) {
			c = this.contacts.get(i);
			if (c.getName().equals(name)) {
				found=true;
			} else {
				c = null;
			}
			i++;
		}
		return c;
	}
	
}
