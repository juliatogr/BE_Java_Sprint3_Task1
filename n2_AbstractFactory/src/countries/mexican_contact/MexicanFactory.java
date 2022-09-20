package countries.mexican_contact;

import generics.*;

public class MexicanFactory implements ContactFactory {

	public Address createAddress() {
		return new MexicanAddress();
	}
	public PhoneNumber createPhoneNumber() {
		return new MexicanPhoneNumber();
	}
}
