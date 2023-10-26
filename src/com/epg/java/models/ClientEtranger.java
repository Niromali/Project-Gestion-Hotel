package com.epg.java.models;

public class ClientEtranger extends Client{
	private String NPasseport;
	private String pays;
	private String ville;
	
	public ClientEtranger() {
		super();
		NPasseport ="";
		pays = "";
		ville = "";
	}
	public ClientEtranger(int id, String nom, String prenom,String NPasseport, String pays,String ville) {
		super(id, nom, prenom);
		this.NPasseport = NPasseport;
		this.pays = pays;
		this.ville = ville;
		
	}
	
	public String getNPasseport() {
		return NPasseport;
	}
	public void setNPasseport(String nPasseport) {
		NPasseport = nPasseport;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	@Override
	public String toString() {
		return "ClientEtranger ["+ super.toString() +",NPasseport=" + NPasseport + ", pays=" + pays + ", ville=" + ville + "]";
	}
	
	
}