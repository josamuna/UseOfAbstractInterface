package com.josamuna.project.person.model;

public class Person implements IPerson {
	private int id;
	private String firstName;
	private String lastName;
	private Conjoint conjoint;

	public Person() {
	}

	public Person(int id, String firstName, String lastName, Conjoint conjoint) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.conjoint = conjoint;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Conjoint getConjoint() {
		return conjoint;
	}

	public void setConjoint(Conjoint conjoint) {
		this.conjoint = conjoint;
	}

	@Override
	public void showIdentity(int id_person) {
		if(conjoint == null) {
			System.out.println(String.format(
					"Person : [Id_person = %s, FirstName = %s, LastName = %s]\nLa personne n'a pas de Conjoint, elle est Célibataire", 
					id_person, this.firstName, this.lastName));
		} else {
			System.out.println(String.format(
					"Person : [Id_person = %s, Nom = %s, Prénom = %s]\nConjoint : [Id_conjoint = %s, FirstName = %s, LastName = %s]", 
					id_person, this.firstName, this.lastName, conjoint.getId(), conjoint.getFirstName(), conjoint.getLastName()));
		}
		
	}

}
