package com.josamuna.project.telephone;

import java.sql.SQLException;

import com.josamuna.project.telephone.model.Person;

public class TestAllTelephone {

	public static void main(String[] args) {
		try {
			new Person().showDynamicIdentity();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
