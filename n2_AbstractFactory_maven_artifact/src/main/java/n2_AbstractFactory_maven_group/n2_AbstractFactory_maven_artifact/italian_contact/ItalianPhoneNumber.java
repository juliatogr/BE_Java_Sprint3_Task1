package n2_AbstractFactory_maven_group.n2_AbstractFactory_maven_artifact.italian_contact;

import java.util.Scanner;

import n2_AbstractFactory_maven_group.n2_AbstractFactory_maven_artifact.generics.PhoneNumber;

public class ItalianPhoneNumber implements PhoneNumber {
	private static final String PREFIX = "+34";
	private static final int LENGTH = 9;
	private String phoneNumber;
	
	public ItalianPhoneNumber() {
		Scanner sc = new Scanner(System.in);
		
		boolean correctFormat = false;
		String pn;
		
		do {
			System.out.println("Enter the phone number:");
			pn = sc.nextLine();
			correctFormat = this.checkFormat(pn);
			if (!correctFormat) {
				System.out.println("The format is not correct.");
			}
		} while (!correctFormat);

		this.phoneNumber = this.PREFIX + " " + pn.replace(" ", "");
		System.out.println();
		
	}
	public boolean checkFormat(String pn) {
		boolean isValid = true;
		
		String noSpacePn = pn.replace(" ", "");
		int num_length = noSpacePn.length();
		
		if (num_length != LENGTH) {
			isValid = false;
			
		} else {
			boolean allNumChars = true;
			int i = 0;
			
			while (i < num_length && allNumChars == true) {
				if (!Character.isDigit(noSpacePn.charAt(i))) {
					allNumChars = false;
					isValid = false;
				}
			}
		}
		
		if (isValid) {
			System.out.println("Valid number");
		} else {
			System.out.println("The format is not correct.");
		}
		
		return isValid;
	}
	@Override
	public String toString() {
		return phoneNumber;
	}
	
	
}
