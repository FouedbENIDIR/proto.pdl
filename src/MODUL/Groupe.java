package MODUL;

public class Groupe {
	private int identifiant;
	private String nom;
	
	public Groupe(int identifiant, String nom) {
		this.identifiant = identifiant;
		this.nom = nom;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
