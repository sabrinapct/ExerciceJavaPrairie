package ExerciceMulti; //J'appel le package

import java.util.Scanner; //J'importe le scanner pour répondre a mon opérateur

class TableMultiplicationChoix { // J'appel la class 
	public static void main(String[] args)// Je définis ma méthode
	{
		int saisieoperateur,i; //Je declare mes variables
		System.out.println("Choisir la table de votre choix");//J'imprime ma question en sortie
		Scanner in=new Scanner(System.in);//System qui appel une réponse
		
		
        saisieoperateur=in.nextInt();//Je définis mes valeur en lui indiquant de passer automatique à la réponse
		System.out.println("Table de Multiplication de "+saisieoperateur);
		for(i=1;i<=10;i++)//Je crée ma boucle en définissant les parametre de calcul
		{
			System.out.println(saisieoperateur+"*"+i+"="+(saisieoperateur*i));//Sortie ecran
			in.close();//Cloturer le scanner
		}
	}
}


