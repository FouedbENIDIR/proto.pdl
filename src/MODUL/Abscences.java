package MODUL;

public class Abscences {
	private int identifiant;
	private int quota;
	private int duree;
	private String justification;
	private int idEleve;
	private int idCour;
	private int enseignant;
	
	public Abscences(int identifiant, int quota, int duree, String justification, int idEleve, int idCour,
			int enseignant) {
		super();
		this.identifiant = identifiant;
		this.quota = quota;
		this.duree = duree;
		this.justification = justification;
		this.idEleve = idEleve;
		this.idCour = idCour;
		this.enseignant = enseignant;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public int getQuota() {
		return quota;
	}

	public void setQuota(int quota) {
		this.quota = quota;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public int getIdEleve() {
		return idEleve;
	}

	public void setIdEleve(int idEleve) {
		this.idEleve = idEleve;
	}

	public int getIdCour() {
		return idCour;
	}

	public void setIdCour(int idCour) {
		this.idCour = idCour;
	}

	public int getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(int enseignant) {
		this.enseignant = enseignant;
	}
	
}

