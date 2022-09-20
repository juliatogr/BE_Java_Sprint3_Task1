package countries.italian_contact;

import generics.*;

public class ItalianFactory implements ContactFactory {

	public Address createAddress() {
		return new ItalianAddress();
	}
	public PhoneNumber createPhoneNumber() {
		return new ItalianPhoneNumber();
	}
}
