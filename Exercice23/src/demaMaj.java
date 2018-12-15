import java.util.Scanner;

import com.sun.xml.internal.ws.Closeable;

/*Exercice 22

Demandez à l'utilisateur de saisir un mot
Ecrivez une méthode qui prend en paramètre une chaine de caractère et qui retourne cette chaine en majuscule.
Utilisez cette méthode pour retourner à l'utilisateur son mot en majuscule.*/

public class demaMaj {

	public static void main(String[] args) {
		retMaj("majuscule");
	}
	static void retMaj(String majuscule) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Veuillez saisir un mot :");
	       String str = sc.nextLine();//réponse de l'utilisateur
	       System.out.println(str.toUpperCase() );  //Méthode Majuscule
	       sc.close();
	}
}