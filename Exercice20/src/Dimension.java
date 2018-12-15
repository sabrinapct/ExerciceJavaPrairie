
public class Dimension {

	public static void main(String[] args) {

		int[][] tab ={{1,2},{3,4}};// declaration des deux tableaux

		int i;//Attribution de i a mon premier tableau
		int j;//Attirbution de j a mon deuxieme tableau
		for(i=0; i<tab.length; i++) {//boucle qui parcour premier tableau i

			for(j=0; j<tab[i].length; j++) //boucle qui parcours mon deuxiéme tableau j

				System.out.println(tab [i][j]);   // imprime valeur de mes deux tableaux
		}
	}
}

