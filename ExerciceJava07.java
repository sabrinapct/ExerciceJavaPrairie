package exo07;

import java.util.Scanner;

public class ExerciceJava {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		
		System.out.println("Veuillez choisir un chiffre a multiplier"); 
        int n = sc.nextInt();
	    System.out.println("Veuillez choisir un chiffre a multiplier");
        int x = sc.nextInt();
            System.out.println("Voici le résultats");
        
        for( int i = 1; i <= x; i++ )
        
        System.out.println(n * i);
        
        
        }
	}


