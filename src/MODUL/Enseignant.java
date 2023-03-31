package MODUL;

public class Enseignant extends Personne {
	private String tel;
	private String mail;

	public Enseignant(String nom, String prenom, String id, String motDePasse, String tel, String mail) {
		super(nom, prenom, id, motDePasse);
		this.tel = tel;
		this.mail = mail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
