import java.util.Scanner;


public class palindrome {

	 public static void main(String args[])
	   {
	      String pouya, reverse = ""; // Entrer vide pour le reverse
	      Scanner sc = new Scanner(System.in);//scan reponse
	     
	      System.out.println("Entrer un mot :");//question
	      pouya = sc.nextLine();//reponse utilisateur
	     
	      int lect = pouya.length();//initialise ma variable de lecture
	      
	      for (int i = lect - 1; i >= 0; i--)//boucle de lecture partant de la fin du mot
	         reverse = reverse + pouya.charAt(i);//on entre les char du mot dans reverse mais à l'envers
	         
	      if /*si*/ (pouya.equals(reverse))//Méthode pour comparer les lettres du mot de l'utilisateur
	         System.out.println("Le mot est un palindrome.");// reponse valide
	      else//sinon
	         System.out.println("Le mot n'est pas un palindrome");//reponse si pas palindrome
	     sc.close();   
	   }
	}      