package countries.japanese_contact;

import generics.*;

public class JapaneseFactory implements ContactFactory {

	public Address createAddress() {
		return new JapaneseAddress();
	}
	public PhoneNumber createPhoneNumber() {
		return new JapanesePhoneNumber();
	}
}
