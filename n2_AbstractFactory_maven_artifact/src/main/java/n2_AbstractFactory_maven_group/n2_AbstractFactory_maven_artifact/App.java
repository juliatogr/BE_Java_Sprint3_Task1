package n2_AbstractFactory_maven_group.n2_AbstractFactory_maven_artifact;

import java.io.IOException;
import java.util.Scanner;

import net.placemarkt.AddressFormatter;

/**
 * Hello world!
 *
 */
public class App 
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
		
		AddressFormatter formatter = new AddressFormatter(false, false);
		String json = "{country_code: 'US',\n"
		          + "house_number: '301',\n"
		          + "road: 'Hamilton Avenue',\n"
		          + "neighbourhood: 'Crescent Park',\n"
		          + "city: 'Palo Alto',\n"
		          + "postcode: '94303',\n"
		          + "county: 'Santa Clara County',\n"
		          + "state: 'California',\n"
		          + "country: 'United States',}";
		String formatted;
		try {
			formatted = formatter.format(json);
			System.out.println(formatted);
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		301 Hamilton Avenue
		Palo Alto, CA 94303
		United States of America
		*/

		AddressFormatter abbreviateFormatter = new AddressFormatter(true, false);
		json = "{country_code: 'US',\n"
		          + "house_number: '301',\n"
		          + "road: 'Hamilton Avenue',\n"
		          + "neighbourhood: 'Crescent Park',\n"
		          + "city: 'Palo Alto',\n"
		          + "postcode: '94303',\n"
		          + "county: 'Santa Clara County',\n"
		          + "state: 'California',\n"
		          + "country: 'United States',}";
		try {
			formatted = abbreviateFormatter.format(json);
			System.out.println(formatted);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		301 Hamilton Ave
		Palo Alto, CA 94303
		United States of America
		*/

		AddressFormatter appendCountryFormatter = new AddressFormatter(false, true);
		json = "{country_code: 'US',\n"
		          + "house_number: '301',\n"
		          + "road: 'Hamilton Avenue',\n"
		          + "neighbourhood: 'Crescent Park',\n"
		          + "city: 'Palo Alto',\n"
		          + "postcode: '94303',\n"
		          + "county: 'Santa Clara County',\n"
		          + "state: 'California',}";
		try {
			formatted = appendCountryFormatter.format(json);
			System.out.println(formatted);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		301 Hamilton Ave
		Palo Alto, CA 94303
		United States of America
		*/
	}
}
