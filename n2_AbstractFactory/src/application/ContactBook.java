package application;

import java.util.ArrayList;
import java.util.Scanner;

import countries.australian_contact.AustralianFactory;
import countries.chinese_contact.ChineseFactory;
import countries.italian_contact.ItalianFactory;
import countries.japanese_contact.JapaneseFactory;
import countries.mexican_contact.MexicanFactory;
import countries.peruan_contact.PeruanFactory;
import countries.russian_contact.RussianFactory;
import countries.spanish_contact.SpanishFactory;
import countries.united_states_contact.UnitedStatesFactory;
import generics.Contact;
import generics.ContactFactory;

public class ContactBook {
	
	private ArrayList<Contact> contacts;
	
	ContactBook(){
		contacts = new ArrayList<Contact>(); 
	}
	
	public void createContact() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name and surname(s):");
		String name = sc.nextLine();
		

		ContactFactory cf = null;
		boolean isValidCountry = true;
		
		do {
			System.out.println("Enter their country: \n"
					+ "    (Implemented countries:\n"
					+ "		    - Australia\n"
					+ "			- China\n"
					+ "			- Italy\n"
					+ "			- Japan\n"
					+ "			- Mexico\n"
					+ "			- Peru\n"
					+ "			- Russia\n"
					+ "			- Spain\n"
					+ "			- United States)");
			
			String country = sc.nextLine();
			
			if (country.equalsIgnoreCase("Australia")) {
				cf = new AustralianFactory();
				isValidCountry = true;
				
			} else if (country.equalsIgnoreCase("China")) {
				cf = new ChineseFactory();
				isValidCountry = true;
				
			} else if (country.equalsIgnoreCase("Italy")) {
				cf = new ItalianFactory();
				isValidCountry = true;
				
			} else if (country.equalsIgnoreCase("Japan")) {
				cf = new JapaneseFactory();
				isValidCountry = true;
				
			} else if (country.equalsIgnoreCase("Mexico")) {
				cf = new MexicanFactory();
				isValidCountry = true;
				
			} else if (country.equalsIgnoreCase("Peru")) {
				cf = new PeruanFactory();
				isValidCountry = true;
				
			} else if (country.equalsIgnoreCase("Russia")) {
				cf = new RussianFactory();
				isValidCountry = true;
				
			} else if (country.equalsIgnoreCase("Spain")) {
				cf = new SpanishFactory();
				isValidCountry = true;
				
			} else if (country.equalsIgnoreCase("United States")) {
				cf = new UnitedStatesFactory();
				isValidCountry = true;
				
			}else {
				isValidCountry = false;
				System.out.println("You should select a valid country");
			}
		} while (!isValidCountry);

		
		Contact c = new Contact(name, cf);

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
