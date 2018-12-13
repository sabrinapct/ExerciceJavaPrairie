import java.util.Scanner;
public class ChaineCarat 

  {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		   
		   System.out.println("Veuillez saisir un mot :");
		       String str = sc.nextLine();//réponse de l'utilisateur
		   
        
		   System.out.println(str.toUpperCase() );  //Méthode Majuscule    
		      
		       String rep = ""; //appel la reponse
           Scanner lineScan = new Scanner(str);
          
           while(lineScan.hasNext()) {
               String word = lineScan.next();
               
               rep += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
           }
           System.out.println(rep.trim());
           sc.close();
           lineScan.close();
	       }
		   
	}
	
