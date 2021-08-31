package com.josamuna.project.person.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.josamuna.project.database.implementations.DatabaseConnection;
import com.josamuna.project.database.implementations.MySQLDbConnection;

public class Conjoint implements IPerson {

	private int id;
	private String firstName;
	private String lastName;

	public Conjoint() {
	}

	public Conjoint(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
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

	@Override
	public void showStaticIdentity(int id_conjoint) {
		System.out.println(String.format(
				"Conjoint : [Id_conjoint = %s, %s %s]\nLa personne est un(e) Conjoint(e), elle est mariée.",
				id_conjoint, this.firstName, this.lastName));

	}

	@Override
	public void showDynamicIdentity(int id_conjoint) throws ClassNotFoundException, SQLException {
		DatabaseConnection dbConnection = new MySQLDbConnection();
		Connection connection = dbConnection.getConnection();
		String query = "SELECT conjoint.id,conjoint.firstname,conjoint.lastname FROM conjoint\r\n"
				+ "WHERE conjoint.id=?";
		
		try (PreparedStatement ps = connection.prepareStatement(query);) {
			ps.setInt(1, id_conjoint);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Conjoint conjoint = new Conjoint(Integer.parseInt(rs.getString("id")), 
						rs.getString("firstname"), 
						rs.getString("lastname"));
				System.out.println(String.format("Conjoint: [Id = %s, %s %s]", conjoint.getId(),
						conjoint.getFirstName(), conjoint.getLastName()));
			}
		}

	}

	@Override
	public void showDynamicIdentity() throws ClassNotFoundException, SQLException {
		DatabaseConnection dbConnection = new MySQLDbConnection();
		Connection connection = dbConnection.getConnection();
		String query = "SELECT conjoint.id,conjoint.firstname,conjoint.lastname FROM conjoint";
		
		try (PreparedStatement ps = connection.prepareStatement(query);) {

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Conjoint conjoint = new Conjoint(Integer.parseInt(rs.getString("id")), 
						rs.getString("firstname"), 
						rs.getString("lastname"));
				System.out.println(String.format("Conjoint: [Id = %s, %s %s]", conjoint.getId(),
						conjoint.getFirstName(), conjoint.getLastName()));
				System.out.println("--------------------------------------------------");
			}
		}

	}

}
