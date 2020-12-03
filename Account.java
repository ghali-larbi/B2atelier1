package atelier1B2;

public class Account {
	public String nom;
	 public String adresse;
	 public double solde;
	 public Account(String nom,String adresse,double solde) {
		 this.nom=nom;
		 this.adresse=adresse;
		 this.solde=solde;
	 }
	 public String afficherInfosSolde() {
		 return this.nom+" habite a "+this.adresse+"-info solde"+this.solde;
	 }
	 public double calculerInterer() {
		 return this.solde*7.0;
	 }
}
