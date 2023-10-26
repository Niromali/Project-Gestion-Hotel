package com.epg.java.service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import com.epg.java.models.Chambre;
import com.epg.java.models.Client;
import com.epg.java.models.EtatChambre;
import com.epg.java.models.GroupeHotel;
import com.epg.java.models.Hotel;
import com.epg.java.models.Reservation;

public class GestionHotel {
	private Vector<GroupeHotel> groupeHotels;
	private Vector<Reservation> reservations;
	private Vector<Client> clients;
	public GestionHotel() {
		groupeHotels=new Vector<GroupeHotel>();
		reservations=new Vector<Reservation>();
		clients=new Vector<Client>();
	}
	public GroupeHotel getGroupeHotel(String nomGroupe) {
		for(GroupeHotel groupeHotel:groupeHotels) {
			if(groupeHotel.getNom().equals(nomGroupe)) return groupeHotel;
		}
		return null;
	}
	public int ajouterHotelGroupe(String nomGroupe,Hotel hotel) {
		GroupeHotel groupeHotel=getGroupeHotel(nomGroupe);
		if(groupeHotel==null) return -2;
		return groupeHotel.ajouterHotel(hotel);
		
	}
	public Client getClient(int idClient) {
		for (int i = 0; i < clients.size(); i++) {
			Client client=clients.get(i);
			if(client.getId()==idClient) return client;
			
		}
		return null;
	}
	public int ajouterChambreHotelGroupe(String nomGroupe,int idHotel,Chambre chambre) {
		GroupeHotel groupeHotel=getGroupeHotel(nomGroupe);
		if(groupeHotel==null) return -2;
		return groupeHotel.ajouterChambreHotel(idHotel,chambre);
		
	}
	public Chambre getChambre(int numeroChambre) {
		for(int i=0;i<groupeHotels.size();i++) {
			GroupeHotel groupeHotel=groupeHotels.get(i);
			Chambre chambre=groupeHotel.getChambre(numeroChambre);
			if(chambre!=null) return chambre;
		}
		return null;
	}
	public boolean reserver(int numeroChambre) {
		for(int i=0;i<reservations.size();i++) {
			Reservation reservation=reservations.get(i);
			if(reservation.getNumeroChambre()==numeroChambre){
				return true;
			}
		}
		return false;
	}
	public int reserverChambreClient(int idClient, int numeroChambre, String dateEntree,int durre) {
	  Client client=getClient(idClient);
	  if(client==null) return -1;
	  Chambre chambre=getChambre(numeroChambre);
	  if(chambre==null) return -2;
	  if(chambre.getEtatChambre()==EtatChambre.OCCUPEE ||chambre.getEtatChambre()==EtatChambre.RESERVEE ) return -4;
	  boolean reserver=reserver(numeroChambre);
	  if(reserver) return -3;
	  Reservation reservation=new Reservation(idClient,numeroChambre, dateEntree,durre);
	  reservations.add(reservation);
	  chambre.setEtatChambre(EtatChambre.RESERVEE);
	  chambre.setNbJours(durre);
	  
	  return 1;
	}
	public Hotel getHotel(int idHotel) {
		for (GroupeHotel groupeHotel : groupeHotels) {
			Hotel hotel=groupeHotel.getHotel(idHotel);
			if(hotel!=null) return hotel;
		}
		return null;
	}
	public Vector<Chambre> listChambreLibre(int idHotel){
		
		Hotel hotel=getHotel(idHotel);
		if(hotel==null) return null;
		
		 return hotel.getChambresLibre();
	}
	public int sauvegarderHotel(int idHotel) {
		Hotel hotel=getHotel(idHotel);
		if(hotel==null) return 0;
		try {
			FileWriter writer = new FileWriter("hotel_"+hotel.getNom()+".txt");
			writer.write(hotel.toTxtFile());
			writer.close();
			return 1;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

}
