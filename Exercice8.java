package Exercices;

import java.util.Scanner;

public class Exercice8
{

	public static void main(String[] args)
	{
		int i= 1;
		int count = 0;
		int nbrsaisie= 1;
		Scanner sc = new Scanner(System.in);
		while(i<=20)
		{
			System.out.println("Quel age avez vous?");
			nbrsaisie = sc.nextInt();
			if (nbrsaisie <20)
			{
				count++;
			}
			i++;
			
		}
		System.out.println("Nous avons "+ count + " de moins de 20 ans ");
	}
		
}
	
	
	
	
