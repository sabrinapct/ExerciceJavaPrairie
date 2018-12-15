package methodePuissance;


import java.util.Scanner;


/*Demandez à l'utilisateur de saisir un nombre
Ecrivez la méthode qui retourne cette valeur élevé à la puissance 3.
utilisez cette méthode pour retourner la saisie de l'utilisateur à la puissance 3.*/

 
public class MethodePuissance {

	public static void main(String[] args) {
		  Puis3("puissance");
	}	
	static void Puis3(String puissance) {
		   Scanner sc = new Scanner(System.in);//  reponse scanner
		   System.out.println("Veuillez choisir un nombre pour obtenir sa puissance 3 :");//Question utlisateur
	       int rep = sc.nextInt();//réponse de l'utilisateur
	       System.out.println(Math.pow(rep, 3.0) ); //Méthode Puissance3
	       sc.close();
	}
}
