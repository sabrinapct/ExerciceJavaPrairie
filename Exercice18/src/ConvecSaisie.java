import java.util.Scanner;

public class ConvecSaisie {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Veuillez choisir un nombre entre 0 et 256");
	int pouya = sc.nextInt();
	
	if (pouya > 0 && pouya < 256 );
	else System.out.println("le chiffre doit etre compris entre 0 et 256" );	
		
		
	char pouyou = (char) pouya;
	
	System.out.println(pouya);
	System.out.println(pouyou);
	
   }
}