import java.util.Scanner;//J'importe le scanner pour répondre a mon operateur

class test {//J'importe ma classe 
public static void main(String[]arg) {//Je définis la méthode
	Scanner sc = new Scanner(System.in);//Je déclare le scanner
        System.out.println("Quel est ton nom");//J'imprime la question de sortie
        String str = sc.nextLine();  //Je crée une chaine pour lui ajouter une réponse
        System.out.println("Coucou" + " " + str) ;// J'imprime "coucou" en réponse à la sienne 
          
}
}
