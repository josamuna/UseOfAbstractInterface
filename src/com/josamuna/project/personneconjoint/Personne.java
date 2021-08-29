package com.josamuna.project.personneconjoint;

public class Personne {
	private int id;
	private String nom;
	private String prenom;
	private Conjoint conjoint;

	public Personne() {
	}

	public Personne(int id, String nom, String prenom, Conjoint conjoint) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.conjoint = conjoint;
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

	public Conjoint getPersonne_conjoint() {
		return conjoint;
	}

	public void setPersonne_conjoint(Conjoint personne_conjoint) {
		this.conjoint = personne_conjoint;
	}

	public void showIdentity(int id_personne) {
		if(conjoint == null) {
			System.out.println(String.format(
					"Personne : [Id = %s, Nom = %s, Prénom = %s]\nLa personne n'a pas de Conjoint, il est Célibataire", 
					id, nom, prenom));
		} else {
			System.out.println(String.format(
					"Personne : [Id = %s, Nom = %s, Prénom = %s]\nConjoint : [Id = %s, Nom = %s, Prénom = %s]", 
					id, nom, prenom, conjoint.getId(), conjoint.getNom(), conjoint.getPrenom()));
		}
		
	}

}
