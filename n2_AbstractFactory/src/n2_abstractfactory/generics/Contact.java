package n2_abstractfactory.generics;

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
	
	public void addAddress() {
		this.address = this.cf.createAddress();
	}
	
	public void addPhoneNumber() {
		this.phoneNumber = this.cf.createPhoneNumber();
	}
}
