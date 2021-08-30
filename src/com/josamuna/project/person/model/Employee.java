package com.josamuna.project.person.model;

public class Employee implements IPerson {

	private int id;
	private String firstName;
	private String lastName;
	private String cnss;
	
	public Employee() {
	}
	
	public Employee(int id, String firstName, String lastName, String cnss) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cnss = cnss;
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

	public String getCnss() {
		return cnss;
	}

	public void setCnss(String cnss) {
		this.cnss = cnss;
	}

	@Override
	public void showIdentity(int id_person) {
		System.out.println(String.format("[Employee : Id = %s, FirstName = %s, LastName = %s, Social Security = %s]",
				id_person, this.firstName, this.lastName, this.cnss));

	}

}
