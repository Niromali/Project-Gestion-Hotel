package com.epg.java.models;

import java.util.Vector;

public class Hotel {
	private int id;
	private String nom;
	private String ville;
	private String telephone;
	private Vector<Chambre> chambres;
	
	public Hotel() {
		this.id=-1;
		this.nom = "";
		this.ville = "";
		this.telephone = "";
		setChambres(new Vector<Chambre>());
	}
	public Hotel(int id, String nom, String ville, String telephone) {
		this.id = id;
		this.nom = nom;
		this.ville = ville;
		this.telephone = telephone;
		setChambres(new Vector<Chambre>());
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
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	
	public Vector<Chambre> getChambres() {
		return chambres;
	}
	public void setChambres(Vector<Chambre> chambres) {
		this.chambres = chambres;
	}
	
	public boolean equals(Hotel hotel) {
		return (hotel.id == id);
	}
	public String toString() {
		return "Hotel [id=" + id + ", nom=" + nom + ", ville=" + ville + ", telephone=" + telephone + ", chambres="
				+ chambres + "]";
	}
	
	public Chambre getChambre(int numero) {
		for(Chambre chambre:chambres) {
			if(chambre.getNumero()==numero) return chambre;
		}
		return null;
	}
	public int ajouterChambre(Chambre chambre) {
		 Chambre chambre2=getChambre(chambre.getNumero());
		 if(chambre2==null) {
			 chambres.add(chambre);
			 return 1;
		 }
		return 0;
	}
	public Vector<Chambre> getChambresLibre() {
		Vector<Chambre> chambres=new Vector<Chambre>();
		for (Chambre chambre : chambres) {
			if(chambre.getEtatChambre()==EtatChambre.LIBRE)
				chambres.add(chambre);
		}
		return chambres;
	}
	public String toTxtFile() {
		String s="Hotel :\n";
		s+="id Hotel="+id+"\n";
		s+="Nom hotel="+nom +"\n";
		s+="Ville hotel="+ville +"\n";
		s+="Telephone Hotel="+telephone +"\n";
		s+="Liste de chambres=\n";
		for (Chambre chambre : chambres) {
			s+=chambre.toTxtFile();
		}
		return s;
	}
	
	
}
