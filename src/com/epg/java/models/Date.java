package com.epg.java.models;

public class Date {
	private int jour;
	private int mois;
	private int annee;
	
	public Date() {
		jour=1;
		mois=1;
		annee=1900;
	}
	public Date(int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	
	public Date(String date) {
		// TODO Auto-generated constructor stub
		try {
		String [] t=date.split("/");
		jour=Integer.parseInt(t[0]);
		mois=Integer.parseInt(t[1]);
		annee=Integer.parseInt(t[2]);
		} catch (Exception e) {
			jour=1;
			mois=1;
			annee=1900;
		}
		
	}
	public int getJour() {
		return jour;
	}
	public void setJour(int jour) {
		this.jour = jour;
	}
	public int getMois() {
		return mois;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	public boolean equals(Date date) {
		return (jour==date.jour && mois == date.mois && annee == date.annee);
	}
	public String toString() {
		return  jour + "/" + mois + "/" + annee;
	}
	
	
}