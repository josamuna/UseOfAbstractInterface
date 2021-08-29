package com.josamuna.project.useofinterface;

public class Employe implements IPerson {

	private String firstName;
	private String lastName;
	private String cnss;
	
	public Employe() {
	}
	
	public Employe(String firstName, String lastName, String cnss) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cnss = cnss;
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
	public void showIdentity() {
		System.out.println(String.format("[Employe : FirstName = %s, LastName = %s, Social Security = %s]",
				firstName, lastName, cnss));

	}

}
