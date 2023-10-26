package com.epg.java.models;

public class ClientEntreprise extends Client{
	private String code;
	private String raisonsociale;
	private String ville;
	private String pays;
	
	public ClientEntreprise() {
		super();
		code ="";
		raisonsociale="";
		pays = "";
		ville = "";
	}
	public ClientEntreprise(int id, String nom, String prenom,String code, String raisonsociale,String pays,String ville) {
		super(id, nom, prenom);
		this.code = code;
		this.raisonsociale=raisonsociale;
		this.pays = pays;
		this.ville = ville;
		
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getRaisonsociale() {
		return raisonsociale;
	}
	public void setRaisonsociale(String raisonsociale) {
		this.raisonsociale = raisonsociale;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	@Override
	public String toString() {
		return "ClientEntreprise ["+super.toString()+",code=" + code + ", raisonsociale=" + raisonsociale + ", ville=" + ville + ", pays="
				+ pays + "]";
	}
	
	
}