package n2_AbstractFactory_maven_group.n2_AbstractFactory_maven_artifact.spanish_contact;

import java.util.Scanner;

import n2_AbstractFactory_maven_group.n2_AbstractFactory_maven_artifact.generics.Address;

public class SpanishAddress implements Address {

	private String wayType;
	private String address;
	
	public boolean checkFormat(String a) {
		
		return false;
	}
	
	public void askData() {
		Scanner sc = new Scanner(System.in);
		
		
	}
	
	@Override
	public String toString() {
		return address;
	}
	
	public int menuWay() {
		Scanner sc = new Scanner(System.in);
		
		int opt = -1;
		String wayType = "";
		
		do {
			System.out.println("Choose the way type of the street");
			System.out.println("    1.");
			switch(opt) {
			case 1:
			}
			
		} while (opt < 1 || opt > 10);
		
		
		return opt;
	}
}
