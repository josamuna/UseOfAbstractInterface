package com.josamuna.project.telephone;

import com.josamuna.project.telephone.model.Person;

public class TestStaticTelephone {

	public static void main(String[] args) {
		
		Person p1 = new Person(1, "Joel", "Kasereka");
		Person p2 = new Person(2, "Sarah", "Feza");
		Person p3 = new Person(3, "Sophie", "Alimasi", null);
		
		p1.showIdentity(1);
		p2.showIdentity(2);
		p3.showIdentity(3);
	}

}
