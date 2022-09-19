package n2_AbstractFactory_maven_group.n2_AbstractFactory_maven_artifact.generics;

public class Contact {
	private String name;
	private Address address;
	private PhoneNumber phoneNumber;
	private ContactFactory cf;
	
	public Contact(String name, ContactFactory cf){
		this.name = name;
		this.address = null;
		this.phoneNumber = null;
		this.cf = cf;
	}
	
	
	public String getName() {
		return name;
	}


	public Address getAddress() {
		return address;
	}


	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}


	public void addAddress() {
		this.address = this.cf.createAddress();
	}
	
	public void addPhoneNumber() {
		this.phoneNumber = this.cf.createPhoneNumber();
	}

	@Override
	public String toString() {
		return "Contact name: " + name + "\n    address: " + address + "\n    phoneNumber: " + phoneNumber;
	}
	
	
}
