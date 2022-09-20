package countries.russian_contact;

import generics.*;

public class RussianFactory implements ContactFactory {

	public Address createAddress() {
		return new RussianAddress();
	}
	public PhoneNumber createPhoneNumber() {
		return new RussianPhoneNumber();
	}
}
