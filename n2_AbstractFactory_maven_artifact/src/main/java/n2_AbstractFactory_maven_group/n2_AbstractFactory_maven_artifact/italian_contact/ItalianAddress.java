package n2_AbstractFactory_maven_group.n2_AbstractFactory_maven_artifact.italian_contact;

import n2_AbstractFactory_maven_group.n2_AbstractFactory_maven_artifact.generics.Address;

public class ItalianAddress implements Address {

	private String address = "";
	
	public boolean checkFormat(String a) {
		
		return false;
	}
	
	public void askData() {
		
	}
	@Override
	public String toString() {
		return address;
	}
}
