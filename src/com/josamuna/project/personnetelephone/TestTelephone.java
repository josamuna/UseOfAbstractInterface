package com.josamuna.project.personnetelephone;

public class TestTelephone {

	public static void main(String[] args) {
		
		Personne p1 = new Personne(1, "Kasereka", "Joel");
		Personne p2 = new Personne(2, "Feza", "Sarah");
		Personne p3 = new Personne(3, "Alimasi", "Sophie", null);
		
		p1.showIdentity(1);
		p2.showIdentity(2);
		p3.showIdentity(3);
	}

}
