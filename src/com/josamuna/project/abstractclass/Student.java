package com.josamuna.project.abstractclass;

public class Student extends Person {
	
	private String rollNumber;
	
	public Student() {
	}

	public Student(String firstName, String lastName, String rollNumber) {
		super(firstName, lastName);
		this.rollNumber = rollNumber;
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
