package com.josamuna.project.person.model;

import java.sql.SQLException;

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
	public void showStaticIdentity(int id_person) {
		System.out.println(String.format("[Employee : Id = %s, %s %s, Social Security = %s]",
				id_person, this.firstName, this.lastName, this.cnss));

	}

	@Override
	public void showDynamicIdentity(int id_person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showDynamicIdentity() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

}
