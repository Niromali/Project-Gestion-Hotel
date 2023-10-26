package com.epg.java.test;

import java.util.Vector;

import com.epg.java.models.Client;
import com.epg.java.models.ClientMarocain;
import com.epg.java.models.Date;
import com.epg.java.models.Occupation;
import com.epg.java.models.Reservation;
import com.epg.java.service.GestionHotel;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Client client=new Client(1,"ali","hassan");
		ClientMarocain  cm=new ClientMarocain();
		ClientMarocain  cm1=new ClientMarocain();
		if( cm.equals(cm1))System.out.println("Meme client");
		Date d=new Date("1/1/2000");
		System.out.println(d);
		
		Occupation o=new Occupation(1, 2, "1/1/2000", 2);
		System.out.println(o);
		
		Reservation r=new Reservation(3, 99, "1/1/1545", 2);
		System.out.println(r);
		
		
		
		GestionHotel gh = new GestionHotel();
		Vector<Chambre> ch = gh.chercherlistChambre(99);
	}

}
