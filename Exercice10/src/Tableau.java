
public class Tableau {

	public static void main(String[] args) 
	{
		int tab1[] = {4,67,25,87}; 
		double tab2[] = {4.5,67,25.50,87.00}; 
		char tab3[] = {'r','2','?','+'};
		String tab4[] = {"Robert","Noémie","David","Bertrant"};
		System.out.println("Le premier element du tab1 est : " + tab1[0]);
		
		tab1[2] = 42;//Remplace la donnée 2 du tab1
		System.out.println("Ici nous avons remplacer la valeur 25 par :" + tab1[2]); //Imprine sortie écran de la valeur remplacée
		
		for(int i = 0; i < tab3.length; i++)
		{
		  System.out.println("À l'emplacement " + i +" du tableau nous avons = " + tab3[i]);
		  
		}
		  System.out.println("La taille du tab1 est: " + tab1.length);
    }
	 
}
