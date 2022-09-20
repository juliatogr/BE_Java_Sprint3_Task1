package countries.united_states_contact;

import generics.*;

public class UnitedStatesFactory implements ContactFactory {

	public Address createAddress() {
		return new UnitedStatesAddress();
	}
	public PhoneNumber createPhoneNumber() {
		return new UnitedStatesNumber();
	}
}
