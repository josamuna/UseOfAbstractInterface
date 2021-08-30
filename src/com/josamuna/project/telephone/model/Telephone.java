package com.josamuna.project.telephone.model;

public class Telephone {
	
	private int id;
	private String number;
	
	public Telephone() {
	}

	public Telephone(int id, String number) {
		this.id = id;
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}
