package com.josamuna.project.person.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.josamuna.project.database.implementations.DatabaseConnection;
import com.josamuna.project.database.implementations.MySQLDbConnection;

public class Person implements IPerson {
	private int id;
	private String firstName;
	private String lastName;
	private Conjoint conjoint;

	public Person() {
	}

	public Person(int id, String firstName, String lastName, Conjoint conjoint) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.conjoint = conjoint;
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

	public Conjoint getConjoint() {
		return conjoint;
	}

	public void setConjoint(Conjoint conjoint) {
		this.conjoint = conjoint;
	}

	@Override
	public void showStaticIdentity(int id_person) {
		if (conjoint == null) {
			System.out.println(String.format(
					"Person : [Id_person = %s, FirstName = %s, LastName = %s]\nLa personne n'a pas de Conjoint, elle est Célibataire",
					id_person, this.firstName, this.lastName));
		} else {
			System.out.println(String.format(
					"Person : [Id_person = %s, Nom = %s, Prénom = %s]\nConjoint : [Id_conjoint = %s, FirstName = %s, LastName = %s]",
					id_person, this.firstName, this.lastName, conjoint.getId(), conjoint.getFirstName(),
					conjoint.getLastName()));
		}

	}

	@Override
	public void showDynamicIdentity(int id_person) throws ClassNotFoundException, SQLException {
		DatabaseConnection dbConnection = new MySQLDbConnection();
		Connection connection = dbConnection.getConnection();
		String query = "SELECT person.id as id_p,person.firstname as firstname_p,person.lastname as lastname_p,conjoint.id as id_c,conjoint.firstname as firstname_c,conjoint.lastname as lastname_c FROM person\r\n" + 
				"LEFT OUTER JOIN conjoint ON conjoint.id=person.id_conjoint\r\n" + 
				"WHERE person.id=?";
		try (PreparedStatement ps = connection
				.prepareStatement(query);) {
			ps.setInt(1, id_person);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				if(rs.getString("id_c") == null) {
					Person person = new Person(Integer.parseInt(rs.getString("id_p")), 
							rs.getString("firstname_p"), 
							rs.getString("lastname_p"), null);
					
					System.out.println(String.format("Person : [Id = %s, %s %s]\nLa personne n'a pas de Conjoint, elle est Célibataire", 
							person.id, person.firstName, person.lastName));
				} else {
					Conjoint conjoint = new Conjoint(Integer.parseInt(rs.getString("id_c")),
							rs.getString("firstname_c"),
							rs.getString("lastname_c"));
					Person person = new Person(Integer.parseInt(rs.getString("id_p")), 
							rs.getString("firstname_p"), 
							rs.getString("lastname_p"), conjoint);
					
					System.out.println(String.format(
							"Person : [Id = %s, %s %s]\nConjoint : [Id = %s, %s %s]",
							person.getId(), person.getFirstName(), person.getLastName(), conjoint.getId(), conjoint.getFirstName(),
							conjoint.getLastName()));
					
				}
			}
		}

	}

	@Override
	public void showDynamicIdentity() throws ClassNotFoundException, SQLException {
		DatabaseConnection dbConnection = new MySQLDbConnection();
		Connection connection = dbConnection.getConnection();
		String query = "SELECT person.id as id_p,person.firstname as firstname_p,person.lastname as lastname_p,conjoint.id as id_c,conjoint.firstname as firstname_c,conjoint.lastname as lastname_c FROM person\r\n" + 
				"LEFT OUTER JOIN conjoint ON conjoint.id=person.id_conjoint";
		try (PreparedStatement ps = connection.prepareStatement(query);) {
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				if(rs.getString("id_c") == null) {
					Person person = new Person(Integer.parseInt(rs.getString("id_p")), 
							rs.getString("firstname_p"), 
							rs.getString("lastname_p"), null);
					
					System.out.println(String.format("Person : [Id = %s, %s %s]\nLa personne n'a pas de Conjoint, elle est Célibataire", 
							person.id, person.firstName, person.lastName));
					System.out.println("------------------------------------------------------------");
				} else {
					Conjoint conjoint = new Conjoint(Integer.parseInt(rs.getString("id_c")),
							rs.getString("firstname_c"),
							rs.getString("lastname_c"));
					Person person = new Person(Integer.parseInt(rs.getString("id_p")), 
							rs.getString("firstname_p"), 
							rs.getString("lastname_p"), conjoint);
					
					System.out.println(String.format(
							"Person : [Id = %s, %s %s]\nConjoint : [Id = %s, %s %s]",
							person.getId(), person.getFirstName(), person.getLastName(), conjoint.getId(), conjoint.getFirstName(),
							conjoint.getLastName()));
					System.out.println("============================================================");
					
				}
			}
		}
		
	}

}
