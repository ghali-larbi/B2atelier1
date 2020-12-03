package atelier1B2;

public class Account3 {
	private String nom;
	 private String adresse;
	 private double solde;
	 public Account3(String nom,String adresse,double solde) {
		 this.nom=nom;
		 this.adresse=adresse;
		 this.solde=solde;
	 }
	 public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String afficherInfosSolde() {
		 return this.nom+" habite a "+this.adresse+"-info solde"+this.solde;
	 }
	public double retirer(double m) {
		return this.solde-m;
	}
}
