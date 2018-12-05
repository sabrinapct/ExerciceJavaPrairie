package ExerciceMulti;    //J'appel mon package

import java.util.Scanner; //J'importe mon scanner

public class Exercicesix {  //J'appel ma class
      public static void main(String[] args) // Je définis la méthode
      {
	    Scanner scan= new Scanner(System.in);// Je crée mon scanner
	    
	   
	    int premiernombre = 0;//Je définis ma premiere variable
	    
	    int deuxiemenombre = 0;// Je définis ma deuxiéme variable
	    
	    String operateur = "";// Je déclare ma chaine 
	    
	    System.out.println("Saisir un premier nombre compris entre -1000 et 1000");//J'imprime la sortie la premiere question
	     premiernombre = scan.nextInt();//Je dis a mon programme de revenir a la ligne
	    System.out.println("Saisir un deuxième nombre compris entre -1000 et 1000");//J'imprime la sortie la deuxieme question
	     deuxiemenombre = scan.nextInt();//Je dis a mon programme de revenir a la ligne 
	    System.out.println("saisir un opérateur");//J'imprime la sortie de la troisieme question
	    scan.nextLine();//Je reviens a la ligne
	    operateur = scan.nextLine();//Je reviens a la ligne quand mon operateur valide
	    
	   if ((premiernombre >= -1000) && (premiernombre <= 1000) && (deuxiemenombre >= -1000) && (deuxiemenombre <= 1000)) { //Je definis ma condition
	    
	    
	    		switch (operateur) {
	    			case "+" : System.out.println(premiernombre+deuxiemenombre);//Je définis les formules de calculs
	    			break;
	    			case "-" : System.out.println(premiernombre-deuxiemenombre);//Je définis les formules de calculs
	    			break;
	    			case "*" : System.out.println(premiernombre*deuxiemenombre);//Je définis les formules de calculs
	    			break;//J'arrete ma boucle 
	    			case "/" ://Je définis la formule de calcul
	    				if ((premiernombre !=0) && (deuxiemenombre !=0)) {//Je crée un condition
	    					System.out.println(premiernombre / deuxiemenombre);// Je donne les conditions de l'exception
	    					
	    				} else {//Formule de fin de if else
	    					System.out.println("Erreur on ne peut diviser par 0");//Je définis ma phrase de sortie 
	    				}
	    				break;//J'arrete la boucle
	    				default : System.out.println("L'operateur n'est pas valide nous avons donc fait une addition");//J'annonce que par défault le prog a fait une addition
	    				break;//J'arrete la boucle 
	    			    
	    				       }
	   } scan.close();// Je cloture mon scan 
      }
}


