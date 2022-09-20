package countries.russian_contact;

import java.util.Scanner;

import generics.Address;

public class RussianAddress implements Address {

	private String street;
	private String house_num;
	private String floor;
	private String appartment;
	private String zip;
	private String city;
	private String province;
	
	private static final String COUNTRY = "Russia";
	
	
	public RussianAddress() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the street:");
		this.street = sc.nextLine();
		
		System.out.println("Enter the house number:");
		this.house_num = sc.nextLine();
		
		System.out.println("Enter the floor:");
		this.floor = sc.nextLine();
		
		System.out.println("Enter the appartment:");
		this.appartment = sc.nextLine();
		
		System.out.println("Enter the zip/postal code:");
		this.zip = sc.nextLine();
		
		System.out.println("Enter the province:");
		this.province = sc.nextLine();
	}
	
	@Override
	public String toString() {
		return "    " + street + house_num + ", " + floor + " " + appartment + "\n    " + zip + " " + province + "\n    " + COUNTRY;
	}
}
