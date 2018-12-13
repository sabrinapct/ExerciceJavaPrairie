import java.util.Scanner;

public class MotdePasse {

	public static void main(String[] args) {
		                 
		    Scanner sc = new Scanner(System.in);               
		    System.out.println("Entrez un mot de plus de 6 lettres");          
		    String pouya = sc.nextLine();
		    
		    if (pouya.length() > 5) {
		    System.out.println(pouya.substring(pouya.length() -3));        
		    System.out.println(pouya.substring(2, pouya.length() -3));
		    }
		    else {
		    System.out.println("tu sais pas lire une consigne ou quoi ???");
		    
		    sc.close();
		    }

		}
		
	}
	