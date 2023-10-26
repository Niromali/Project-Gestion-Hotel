package com.epg.java.models;

public class Chambre {
	private int numero;
	private TypeChambre typeChambre;
	
	private int nombreLits;
	private float tarif;
	private EtatChambre etatChambre;
	private int nbJours;
	
	public Chambre() {
		this.numero = -1;
		this.nombreLits = 0;
		this.tarif = 0;
		this.nbJours = 0;
	}

	public Chambre(int numero, TypeChambre typeChambre, int nombreLits, float tarif, EtatChambre etatChambre,
			int nbJours) {
		super();
		this.numero = numero;
		this.typeChambre = typeChambre;
		this.nombreLits = nombreLits;
		this.tarif = tarif;
		this.etatChambre = etatChambre;
		if(etatChambre!=EtatChambre.LIBRE) {
		this.nbJours = nbJours;
		}
	}
	public Chambre(int numero, TypeChambre typeChambre, int nombreLits, float tarif, EtatChambre etatChambre) {
		super();
		this.numero = numero;
		this.typeChambre = typeChambre;
		this.nombreLits = nombreLits;
		this.tarif = tarif;
		this.etatChambre = etatChambre;
		
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public TypeChambre getTypeChambre() {
		return typeChambre;
	}

	public void setTypeChambre(TypeChambre typeChambre) {
		this.typeChambre = typeChambre;
	}

	public int getNombreLits() {
		return nombreLits;
	}

	public void setNombreLits(int nombreLits) {
		this.nombreLits = nombreLits;
	}

	public float getTarif() {
		return tarif;
	}

	public void setTarif(float tarif) {
		this.tarif = tarif;
	}

	public EtatChambre getEtatChambre() {
		return etatChambre;
	}

	public void setEtatChambre(EtatChambre etatChambre) {
		this.etatChambre = etatChambre;
	}

	public int getNbJours() {
		return nbJours;
	}

	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}
	public boolean equals(Chambre chambre) {
		return (chambre.numero==numero);
	}

	@Override
	public String toString() {
		return "Chambre [numero=" + numero + ", typeChambre=" + typeChambre + ", nombreLits=" + nombreLits + ", tarif="
				+ tarif + ", etatChambre=" + etatChambre + ", nbJours=" + nbJours + "]";
	}

	public String toTxtFile() {
		return "Chambre \t"+numero+"\t"+nombreLits+"\t"+nbJours+"\t"+tarif+"\t"+etatChambre+"\t"+typeChambre+"\n";
	
	}

}