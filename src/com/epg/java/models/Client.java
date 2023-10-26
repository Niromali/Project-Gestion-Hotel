package com.epg.java.models;

public abstract class Client {
	private int id;
	private String nom;
	private String prenom;
	
	public Client() {
		this.id = -1;
		this.nom = "";
		this.prenom = "";
	}

	public Client(int id, String nom, String prenom) {
		
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

	public boolean equals(Client client) {
		return (id == client.id);
	}
	@Override
	public String toString() {
		return "id=" + id + ", nom=" + nom + ", prenom=" + prenom ;
	}
	
	
}