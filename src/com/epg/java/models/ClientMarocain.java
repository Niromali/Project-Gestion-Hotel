package com.epg.java.models;

public class ClientMarocain extends Client{
	private String cin;
	private String ville;
	
	public ClientMarocain() {
		super();
		cin="";
		ville="";
	}
	public ClientMarocain(int id, String nom, String prenom,String cin, String ville) {
		super(id, nom, prenom);
		this.cin = cin;
		this.ville = ville;
		
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	@Override
	public String toString() {
		return "ClientMarocain ["+super.toString()+",cin=" + cin + ", ville=" + ville + "]";
	}
	
	
	
}