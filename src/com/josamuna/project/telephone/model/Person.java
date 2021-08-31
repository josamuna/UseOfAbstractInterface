package com.josamuna.project.telephone.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.josamuna.project.database.implementations.DatabaseConnection;
import com.josamuna.project.database.implementations.MySQLDbConnection;

public class Person {
	private int id;
	private String firstName;
	private String lastName;
	private List<Telephone> telephonePersons;

	public Person() {
	}

	public Person(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}	

	public Person(int id, String firstName, String lastName, List<Telephone> telephonePersonnes) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephonePersons = telephonePersonnes;
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

	public List<Telephone> getTelephonePersons() {
		if (telephonePersons == null)
			telephonePersons = new ArrayList<Telephone>();

		telephonePersons.clear();

		telephonePersons = loadTelephonePerson(id);

		return telephonePersons;
	}
	
	public List<Telephone> getTelephonePersonsDynamic() throws ClassNotFoundException, SQLException{
		if (telephonePersons == null)
			telephonePersons = new ArrayList<Telephone>();

		telephonePersons.clear();

		telephonePersons = loadTelephonePersonDynamic(id);

		return telephonePersons;
	}

	private List<Telephone> loadTelephonePerson(int id_person) {
		List<Telephone> lstTelephone = new ArrayList<Telephone>();
		lstTelephone.add(new Telephone(1, "+24399853246"));
		lstTelephone.add(new Telephone(2, "+250789140630"));
		lstTelephone.add(new Telephone(3, "+243816078930"));
		return lstTelephone;
	}
	
	private List<Telephone> loadTelephonePersonDynamic(int id_person) throws ClassNotFoundException, SQLException {
		List<Telephone> lstTelephone = new ArrayList<Telephone>();
		
		DatabaseConnection dbConnection = new MySQLDbConnection();
		Connection connection = dbConnection.getConnection();
		String query = "SELECT telephone.id,telephone.id_person,telephone.number FROM telephone "
				+ "LEFT OUTER JOIN person ON person.id=telephone.id_person WHERE person.id=?";
		
		try(PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setInt(1, id_person);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Telephone telephone = new Telephone(Integer.parseInt(rs.getString("id")), 
						rs.getString("telephone.number"));
				lstTelephone.add(telephone);
			}
		}
		
		return lstTelephone;
	}

	public void showIdentity(int id_person) {
		System.out.println(
				String.format("Id = %s, FistName = %s, LastName = %s\nTelephone :", 
						id, firstName, lastName));
		System.out.println("====Classic method with loop ====");
		// Classic method with loop
		for(Telephone tel : getTelephonePersons()) {
			System.out.println(tel.getNumber());
		}
		
		System.out.println("===Using Lambda Expression==");
		// Using Lambda Expression
		getTelephonePersons().forEach(
				tel -> System.out.println(tel.getNumber()));
	}
	
	public void showDynamicIdentity(int id_person) throws ClassNotFoundException, SQLException {
		DatabaseConnection dbConnection = new MySQLDbConnection();
		Connection connection = dbConnection.getConnection();
		String query = "SELECT person.id,person.firstname,person.lastname FROM person WHERE person.id=?";
		try (PreparedStatement ps = connection
				.prepareStatement(query);) {
			ps.setInt(1, id_person);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				List<Telephone> telephones = new ArrayList<Telephone>();
				telephones = loadTelephonePersonDynamic(id_person);
						
				Person person = new Person(Integer.parseInt(rs.getString("id")),
						rs.getString("firstname"),
						rs.getString("lastName"),
						telephones);
				
				System.out.println(String.format(
						"Person : [Id = %s, %s %s]\nTelephone :",
						person.getId(), person.getFirstName(), person.getLastName()));
				telephones.forEach(phone -> { System.out.println(phone.getNumber()); });
			}
		}

	}

	public void showDynamicIdentity() throws ClassNotFoundException, SQLException {
		DatabaseConnection dbConnection = new MySQLDbConnection();
		Connection connection = dbConnection.getConnection();
		String query = "SELECT person.id,person.firstname,person.lastname FROM person";
		try(PreparedStatement ps = connection.prepareStatement(query);) {
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				List<Telephone> telephones = new ArrayList<Telephone>();
				int id_person = Integer.parseInt(rs.getString("id"));
				telephones = loadTelephonePersonDynamic(id_person);
				
				Person person = new Person(id_person, 
						rs.getString("firstname"), 
						rs.getString("lastname"), 
						telephones);
				
				System.out.println(String.format(
						"Person : [Id = %s, %s %s]\nTelephone :",
						person.getId(), person.getFirstName(), person.getLastName()));
				telephones.forEach(phone -> { System.out.println(phone.getNumber()); });
				System.out.println("----------------------------------------------------------");
			}
		}
		
	}

}
