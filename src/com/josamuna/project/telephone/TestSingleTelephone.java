package com.josamuna.project.telephone;

import java.sql.SQLException;

import com.josamuna.project.telephone.model.Person;

public class TestSingleTelephone {

	public static void main(String[] args) {
		try {
			new Person().showDynamicIdentity(4);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
