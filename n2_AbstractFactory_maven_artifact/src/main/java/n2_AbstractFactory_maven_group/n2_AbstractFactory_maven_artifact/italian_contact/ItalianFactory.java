package n2_AbstractFactory_maven_group.n2_AbstractFactory_maven_artifact.italian_contact;

import n2_AbstractFactory_maven_group.n2_AbstractFactory_maven_artifact.generics.*;

public class ItalianFactory implements ContactFactory {

	public Address createAddress() {
		return new ItalianAddress();
	}
	public PhoneNumber createPhoneNumber() {
		return new ItalianPhoneNumber();
	}
}
