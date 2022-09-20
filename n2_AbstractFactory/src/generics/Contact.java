package generics;

public class Contact {
	private String name;
	private Address address;
	private PhoneNumber phoneNumber;
	private ContactFactory cf;
	
	public Contact(String name, ContactFactory cf){
		this.name = name;
		this.cf = cf;
		this.addAddress();
		this.addPhoneNumber();
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
		return "Contact name: " + name + "\n - address: \n" + address + "\n - phoneNumber: " + phoneNumber;
	}
	
	
}
