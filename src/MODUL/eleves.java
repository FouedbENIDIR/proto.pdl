package MODUL;

public class eleves extends Personne {//classe eleve etendue à personne 
	private String filiere;
	private String mail;
	public eleves(String nom, String prenom, String id, String motDePasse, String filiere, String mail) {
		super(nom, prenom, id, motDePasse);
		this.filiere = filiere;
		this.mail = mail;
		}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String newNom) {
		this.nom = newNom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String newPrenom) {
		this.prenom = newPrenom;
	}
	public void display() {
		System.out.println("Donnees de l'eleve :\n");
		System.out.println("Nom :\n"+nom);
		System.out.println("Prenom :\n"+prenom);
		System.out.println("Filiere :\n"+filiere);
		System.out.println("Mail :\n"+mail);
	}
	
}
	
	
