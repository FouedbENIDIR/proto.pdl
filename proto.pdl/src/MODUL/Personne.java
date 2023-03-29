package MODUL;

public class Personne {
	protected String nom;
	protected String prenom;
	protected String id;
	protected String motDePasse;
	
	public Personne(String nom, String prenom, String id, String motDePasse) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
		this.motDePasse = motDePasse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	

}
