package com.epg.java.models;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class GroupeHotel {
	private String nom;
	private Vector<Hotel> hotels;
	
	public GroupeHotel() {
		nom="";
		hotels = new Vector<Hotel>();
	}
	public GroupeHotel(String nom) {
		this.nom = nom;
		hotels = new Vector<Hotel>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Vector<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(Vector<Hotel> hotels) {
		this.hotels = hotels;
	}
	public boolean equals(GroupeHotel groupehotel) {
		return (groupehotel.nom.equals(nom));
	}
	public String toString() {
		return "GroupeHotel [nom=" + nom + ", hotels=" + hotels + "]";
	}
	public Hotel getHotel(int id) {
		for(Hotel hotel:hotels) {
			if(hotel.getId()==id) return hotel;
		}
		return null;
	}
	public int ajouterHotel(Hotel hotel) {
		 Hotel hotel2=getHotel(hotel.getId());
		 if(hotel2==null) {
			 hotels.add(hotel);
			 return 1;
		 }
		return 0;
	}
	public int ajouterChambreHotel(int idHotel, Chambre chambre) {
		 Hotel hotel2=getHotel(idHotel);
		 if(hotel2==null) return -1;
		return hotel2.ajouterChambre(chambre);
	}
	public Chambre getChambre(int numeroChambre) {
		for(int i=0;i<hotels.size();i++) {
			Hotel hotel=hotels.get(i);
			Chambre chambre=hotel.getChambre(numeroChambre);
			if(chambre!=null) return chambre;
		}
		return null;
	}
	
	
}
