package com.josamuna.project.person;

import com.josamuna.project.person.model.Conjoint;
import com.josamuna.project.person.model.Person;

public class TestConjoint {

	public static void main(String[] args) {
		
		Person p1 = new Person(
				1, "Natasha", "Atolo", new Conjoint(
						1, "Espoir", "Salumu"));
		Person p2 = new Person(
				2, "Josué", "Isamuna",
				new Conjoint(2, "Vanessa", "Materanya"));
		Person p3 = new Person(3, "Espoir", "Baraka", null);
		
		p1.showIdentity(1);
		p2.showIdentity(2);
		p3.showIdentity(3);
	}

}
