package com.josamuna.project.person.model.abstractclass;

public class Student extends Person {
	
	private String rollNumber;
	
	public Student() {
	}

	public Student(int id, String firstName, String lastName, String rollNumber) {
		super(id, firstName, lastName);
		this.rollNumber = rollNumber;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public void showIdentity(int id_person) {
		System.out.println(String.format("Student : [Id = %s, FistName = %s, LastName = %s, RollNumber = %s]", 
				id_person, this.firstName, this.lastName, this.rollNumber));
		
	}
	
}
