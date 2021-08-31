package com.josamuna.project.person;

import com.josamuna.project.person.model.Conjoint;
import com.josamuna.project.person.model.IPerson;
import com.josamuna.project.person.model.Person;

public class TestStaticConjoint {

	public static void main(String[] args) {
		IPerson p1 = new Person(
				1, "Natasha", "Atolo", new Conjoint(
						1, "Espoir", "Salumu"));
		IPerson p2 = new Person(
				2, "Josué", "Isamuna",
				new Conjoint(2, "Vanessa", "Materanya"));
		IPerson p3 = new Person(3, "Espoir", "Baraka", null);
		
		Conjoint conjoint = new Conjoint(3, "Joyce", "Amina");
		
		p1.showStaticIdentity(1);
		p2.showStaticIdentity(2);
		p3.showStaticIdentity(3);
		
		conjoint.showStaticIdentity(3);

	}

}
