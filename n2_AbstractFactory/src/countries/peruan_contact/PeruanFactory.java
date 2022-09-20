package countries.peruan_contact;

import generics.*;

public class PeruanFactory implements ContactFactory {

	public Address createAddress() {
		return new PeruanAddress();
	}
	public PhoneNumber createPhoneNumber() {
		return new PeruanPhoneNumber();
	}
}
