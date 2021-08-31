package com.josamuna.project.person;

import java.sql.SQLException;

import com.josamuna.project.person.model.Conjoint;
import com.josamuna.project.person.model.Person;

public class TestAllConjoint {

	public static void main(String[] args) {
		try {
			System.out.println("======Person and Conjoint========");
			new Person().showDynamicIdentity();
			
			System.out.println("========Conjoint only============");
			new Conjoint().showDynamicIdentity();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
