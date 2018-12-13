import java.util.Scanner;


public class SaisieUtilisateur {

	public static void main(String[] args) {
    
   Scanner sc = new Scanner(System.in); 
   
   System.out.println("Veuillez saisir un mot :");
   String str = sc.nextLine();
   System.out.println("Veuillez choisir une lettre dans votre premiere phrase");
   String charet = sc.nextLine();
   
   int compt = 0;
   for (int i=0; i< str.length(); i++) {
	   if(str.charAt(i)== charet.charAt(0)) {
			compt++;
	   }
	 }
   System.out.println(compt);
   sc.close();
 }
} 

