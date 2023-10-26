package com.epg.java.models;

public class Reservation {
	private int idClient;
	private int numeroChambre;
	private Date dateEntree;
	private int durre;
	
	public Reservation() {
		idClient=0;
		numeroChambre=0;
		dateEntree=new Date();
		durre=0;
		
	}
	public Reservation(int idClient, int numeroChambre, String dateEntree,int durre) {
		this.idClient = idClient;
		this.numeroChambre = numeroChambre;
		this.dateEntree = new Date(dateEntree);
		this.durre = durre;
	}
	
	public Reservation(int idClient, int numeroChambre, int jour,int mois , int annee,int durre) {
		this.idClient = idClient;
		this.numeroChambre = numeroChambre;
		this.dateEntree = new Date(jour,mois,annee);
		this.durre = durre;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public int getNumeroChambre() {
		return numeroChambre;
	}
	public void setNumeroChambre(int numeroChambre) {
		this.numeroChambre = numeroChambre;
	}
	public Date getDateEntree() {
		return dateEntree;
	}
	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}
	public int getDurre() {
		return durre;
	}
	public void setDurre(int durre) {
		this.durre = durre;
	}
	
	public boolean equals(Reservation reservation) {
		return (reservation.idClient == idClient && reservation.dateEntree.equals(dateEntree) && numeroChambre==reservation.numeroChambre && durre==reservation.durre);	
	}
	public String toString() {
		return "Reservation [idClient=" + idClient + ", numeroChambre=" + numeroChambre + ", dateEntree=" + dateEntree
				+ ", durre=" + durre + "]";
	}
	
	
}
