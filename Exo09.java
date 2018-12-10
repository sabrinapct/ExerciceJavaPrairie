package Exercice09;

import java.util.Scanner;

public class Exo09 
{

	public static void main(String[] args) 
	{
		int i= 1;
		int count0_20 = 0;
		int count21_40 = 0;
		int count41_100= 0;
		int nbrsaisie= 1;
		Scanner sc = new Scanner(System.in);
		while(i <= 20)
		{
			System.out.println("Quel age avez vous?");
			nbrsaisie = sc.nextInt();		
			if( nbrsaisie < 100)
			{
						if ((nbrsaisie <=0) && (nbrsaisie <=20))
						{
							count0_20++;
						}
						else if ((nbrsaisie <=21) && (nbrsaisie <=41))
						{
							count21_40++;	
						}
						else if ((nbrsaisie <=41) && (nbrsaisie <=100))
						{
							count41_100++;
						}
				}
				else
				    {
				    	System.out.println("Nombre trop élevé");
				    	break;
				    }
				    i++;
			}
				System.out.println("Il y a " + count0_20 + "personnes de moins de 20 ans," + count21_40 + "personnes qui ont entre 21 et 40 ans et " + count41_100 + "personnes qui ont entre 41 et 100 ans");
			
	}
}



