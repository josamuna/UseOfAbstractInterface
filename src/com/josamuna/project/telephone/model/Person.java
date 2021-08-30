package com.josamuna.project.telephone.model;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private int id;
	private String firstName;
	private String lastName;
	private List<Telephone> telephonePersons;

	public Person() {
	}

	public Person(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}	

	public Person(int id, String firstName, String lastName, List<Telephone> telephonePersonnes) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephonePersons = telephonePersonnes;
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

	public List<Telephone> getTelephonePersons() {
		if (telephonePersons == null)
			telephonePersons = new ArrayList<Telephone>();

		telephonePersons.clear();

		telephonePersons = loadTelephonePerson(id);

		return telephonePersons;
	}

	private List<Telephone> loadTelephonePerson(int id_person) {
		List<Telephone> lstTelephone = new ArrayList<Telephone>();
		lstTelephone.add(new Telephone(1, "+24399853246"));
		lstTelephone.add(new Telephone(2, "+250789140630"));
		lstTelephone.add(new Telephone(3, "+243816078930"));
		return lstTelephone;
	}

	public void showIdentity(int id_person) {
		System.out.println(
				String.format("Id = %s, FistName = %s, LastName = %s\nTelephone :", 
						id, firstName, lastName));
		System.out.println("====Classic method with loop ====");
		// Classic method with loop
		for(Telephone tel : getTelephonePersons()) {
			System.out.println(tel.getNumber());
		}
		
		System.out.println("===Using Lambda Expression==");
		// Using Lambda Expression
		getTelephonePersons().forEach(
				tel -> System.out.println(tel.getNumber()));
	}

}
