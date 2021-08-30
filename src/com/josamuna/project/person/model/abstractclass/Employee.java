package com.josamuna.project.person.model.abstractclass;

public class Employee extends Person {

	private String cnss;
	
	public Employee() {
	}
	
	public Employee(int id, String firstName, String lastName, String cnss) {
		super(id, firstName, lastName);
		this.cnss = cnss;
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
