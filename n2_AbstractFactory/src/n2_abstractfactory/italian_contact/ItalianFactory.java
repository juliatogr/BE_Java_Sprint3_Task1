package n2_abstractfactory.italian_contact;

import n2_abstractfactory.generics.Address;
import n2_abstractfactory.generics.ContactFactory;
import n2_abstractfactory.generics.PhoneNumber;

public class ItalianFactory implements ContactFactory {

	public Address createAddress() {
		return new ItalianAddress();
	}
	public PhoneNumber createPhoneNumber() {
		return new ItalianPhoneNumber();
	}
}
