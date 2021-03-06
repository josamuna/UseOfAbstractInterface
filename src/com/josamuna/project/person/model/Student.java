package com.josamuna.project.person.model;

import java.sql.SQLException;

public class Student implements IPerson {

	private int id;
	private String firstName;
	private String lastName;
	private String rollNumber;
	
	public Student() {
	}
	
	public Student(int id, String firstName, String lastName, String rollNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNumber = rollNumber;
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

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public void showStaticIdentity(int id_person) {
		System.out.println(String.format("Student : [Id = %s, %s %s, RollNumber = %s]", 
				id_person, this.firstName, this.lastName, this.rollNumber));

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
