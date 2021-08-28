package com.josamuna.project.exemple1;

import java.util.ArrayList;
import java.util.List;

public class Personne {
	private int id;
	private String nom;
	private String prenom;
	private List<Telephone> telephonePersonnes;

	public Personne() {
	}

	public Personne(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Telephone> getTelephonePersonnes() {
		if (telephonePersonnes == null)
			telephonePersonnes = new ArrayList<Telephone>();

		telephonePersonnes.clear();

		telephonePersonnes = loadTelephonePersonne(id);

		return telephonePersonnes;
	}

	private List<Telephone> loadTelephonePersonne(int id_personne) {
		List<Telephone> lstTelephone = new ArrayList<Telephone>();
		lstTelephone.add(new Telephone("+24399853246"));
		lstTelephone.add(new Telephone("+250789140630"));
		lstTelephone.add(new Telephone("+243816078930"));
		return lstTelephone;
	}

	public void showIdentity(int id_personne) {
		System.out.println(
				String.format("Id = %s, Nom = %s, Prenom = %s\nTelephone :", 
						id, nom, prenom));
		System.out.println("====Classic method with loop ====");
		// Classic method with loop
		for(Telephone tel : getTelephonePersonnes()) {
			System.out.println(tel.getNumero());
		}
		
		System.out.println("===Using Lambda Expression==");
		// Using Lambda Expression
		getTelephonePersonnes().forEach(
				tel -> System.out.println(tel.getNumero()));
	}

}
