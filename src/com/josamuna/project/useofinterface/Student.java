package com.josamuna.project.useofinterface;

public class Student implements IPerson {

	private String firstName;
	private String lastName;
	private String rollNumber;
	
	public Student() {
	}
	
	public Student(String firstName, String lastName, String rollNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNumber = rollNumber;
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
	public void showIdentity() {
		System.out.println(String.format("Student : [FistName = %s, LastName = %s, RollNumber = %s]", 
				firstName, lastName, rollNumber));

	}

}
