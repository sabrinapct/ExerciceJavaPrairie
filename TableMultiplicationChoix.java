package ExerciceMulti; //J'appel le package

import java.util.Scanner; //J'importe le scanner pour répondre

class TableMultiplicationChoix { // J'appel la class 
	public static void main(String[] args)// Je déclare en public
	{
		int saisieoperateur,i; //Je declare mes variables
		System.out.println("Choisir la table de votre choix");//J'ecris ma question
		Scanner in=new Scanner(System.in);//System qui appel une réponse
		
		
        saisieoperateur=in.nextInt();//commande de la valeur
		System.out.println("Table de Multiplication de "+saisieoperateur);
		for(i=1;i<=10;i++)//Formule basique de boucle
		{
			System.out.println(saisieoperateur+"*"+i+"="+(saisieoperateur*i));//Sorti ecran
			in.close();//Cloturer le scanner
		}
	}
}


