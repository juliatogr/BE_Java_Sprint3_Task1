package countries.chinese_contact;

import generics.*;

public class ChineseFactory implements ContactFactory {

	public Address createAddress() {
		return new ChineseAddress();
	}
	public PhoneNumber createPhoneNumber() {
		return new ChinesePhoneNumber();
	}
}
