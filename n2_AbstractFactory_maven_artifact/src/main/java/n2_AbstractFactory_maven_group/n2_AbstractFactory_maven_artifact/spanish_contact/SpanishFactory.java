package n2_AbstractFactory_maven_group.n2_AbstractFactory_maven_artifact.spanish_contact;

import n2_AbstractFactory_maven_group.n2_AbstractFactory_maven_artifact.generics.*;

public class SpanishFactory implements ContactFactory {

	public Address createAddress() {
		return new SpanishAddress();
	}
	public PhoneNumber createPhoneNumber() {
		return new SpanishPhoneNumber();
	}
}
