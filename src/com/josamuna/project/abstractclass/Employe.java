package com.josamuna.project.abstractclass;

public class Employe extends Person {

	private String cnss;
	
	public Employe() {
	}
	
	public Employe(String firstName, String lastName, String cnss) {
		super(firstName, lastName);
		this.cnss = cnss;
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
