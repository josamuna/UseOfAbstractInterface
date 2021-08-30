package com.josamuna.project.person.model.abstractclass;

public abstract class Person {
	protected int id;
	protected String firstName;
	protected String lastName;
	
	public Person() {
	}

	public Person(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public abstract void showIdentity(int id);
}
