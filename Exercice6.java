package atelier1B2;

import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 Account3 a1=new Account3("El alami hassan","safi",14765.80);
		  System.out.println(a1.afficherInfosSolde()); 
		  System.out.println("entrer le montant");
		  double m=scanner.nextDouble();
		  
		  System.out.println(a1.retirer(m));  
	}

}
