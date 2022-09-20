package countries.australian_contact;

import generics.*;

public class AustralianFactory implements ContactFactory {

	public Address createAddress() {
		return new AustralianAddress();
	}
	public PhoneNumber createPhoneNumber() {
		return new AustralianPhoneNumber();
	}
}
