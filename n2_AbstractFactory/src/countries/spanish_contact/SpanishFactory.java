package countries.spanish_contact;

import generics.*;

public class SpanishFactory implements ContactFactory {

	public Address createAddress() {
		return new SpanishAddress();
	}
	public PhoneNumber createPhoneNumber() {
		return new SpanishPhoneNumber();
	}
}
