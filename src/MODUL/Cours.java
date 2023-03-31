package MODUL;

public class Cours {
	private int identifiant;
	private String nom;
	private int duree;
	private Date date;
	private String salle;
	private int idTypeCour;
	
	public Cours(int identifiant, String nom, int duree, Date date, String salle, int idTypeCour) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.duree = duree;
		this.date = date;
		this.salle = salle;
		this.idTypeCour = idTypeCour;
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

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSalle() {
		return salle;
	}

	public void setSalle(String salle) {
		this.salle = salle;
	}

	public int getIdTypeCour() {
		return idTypeCour;
	}

	public void setIdTypeCour(int idTypeCour) {
		this.idTypeCour = idTypeCour;
	}
	
	
}
