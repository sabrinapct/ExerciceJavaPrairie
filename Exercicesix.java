package ExerciceMulti;

import java.util.Scanner;

public class Exercicesix {
      public static void main(String[] args) 
      {
	    Scanner scan= new Scanner(System.in);
	    
	   
	    int premiernombre = 0;
	    
	    int deuxiemenombre = 0;
	    
	    String operateur = "";
	    
	    System.out.println("Saisir un premier nombre compris entre -1000 et 1000");
	     premiernombre = scan.nextInt();
	    System.out.println("Saisir un deuxième nombre compris entre -1000 et 1000");
	     deuxiemenombre = scan.nextInt();
	    System.out.println("saisir un opérateur");
	    scan.nextLine();
	    operateur = scan.nextLine();
	    
	   if ((premiernombre >= -1000) && (premiernombre <= 1000) && (deuxiemenombre >= -1000) && (deuxiemenombre <= 1000)) { 
	    
	    
	    		switch (operateur) {
	    			case "+" : System.out.println(premiernombre+deuxiemenombre);
	    			break;
	    			case "-" : System.out.println(premiernombre-deuxiemenombre);
	    			break;
	    			case "*" : System.out.println(premiernombre*deuxiemenombre);
	    			break;
	    			case "/" :
	    				if ((premiernombre !=0) && (deuxiemenombre !=0)) {
	    					System.out.println(premiernombre / deuxiemenombre);
	    					
	    				} else {
	    					System.out.println("Erreur on ne peut diviser par 0");
	    				}
	    				break;
	    				default : System.out.println("L'operateur n'est pas valide nous avons donc fait une addition");
	    				break;
	    			    
	    				       }
	   } scan.close();
      }
}


