package atelier1B2;

public class Client {
 public String nom;
 public String adresse;
 public double solde;
 public Client(String nom,String adresse,double solde) {
	 this.nom=nom;
	 this.adresse=adresse;
	 this.solde=solde;
 }
 public String tostring() {
	 return this.nom+" habite a "+this.adresse+"-info solde"+this.solde;
 }
}
