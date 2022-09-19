package n2_abstractfactory.spanish_contact;

import n2_abstractfactory.generics.Address;
import n2_abstractfactory.generics.ContactFactory;
import n2_abstractfactory.generics.PhoneNumber;

public class SpanishFactory implements ContactFactory {

	public Address createAddress() {
		return new SpanishAddress();
	}
	public PhoneNumber createPhoneNumber() {
		return new SpanishPhoneNumber();
	}
}
