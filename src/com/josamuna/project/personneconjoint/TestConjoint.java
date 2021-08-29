package com.josamuna.project.personneconjoint;

public class TestConjoint {

	public static void main(String[] args) {
		
		Personne p1 = new Personne(
				1, "Atolo", "Natasha", new Conjoint(
						1, "Salumu", "Espoir"));
		Personne p2 = new Personne(
				2, "Isamuna", "Josué",
				new Conjoint(2, "Materanya", "Vanessa"));
		Personne p3 = new Personne(3, "Baraka", "Espoir", null);
		
		p1.showIdentity(1);
		p2.showIdentity(2);
		p3.showIdentity(3);
	}

}
