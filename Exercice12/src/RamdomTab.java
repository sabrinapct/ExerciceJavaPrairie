import java.util.Random;

public class RamdomTab {

	public static void main(String[] args) {
	
		int chat = (int) (Math.random() * 10 + 0);
		int chien = (int) (Math.random()* 10 + 0);
		int lapin = (int) (Math.random()* 10 + 0);
		int loup = (int) (Math.random() * 10 + 0);
		int girafe = (int) (Math.random()* 10 + 0);
		
		int tab1[] = {chat,chien,lapin,loup,girafe};
				
		System.out.println("La valeur de chat est " +tab1[0]);	
		System.out.println("La valeur du chien est " +tab1[1]);
		System.out.println("La valeur du lapin est " +tab1[2]);
		System.out.println("La valeur du loup est " +tab1[3]);
		System.out.println("La valeur de la girafe est " +tab1[4]);
		
		if(chat==4) {
			System.out.println("La valeur de la position 0 du tableau est de 4");
		}
		if(chien==4) {
			System.out.println("La valeur de la position 0 du tableau est de 4");	
			}
		if(lapin==4) {
			System.out.println("La valeur de la position 0 du tableau est de 4");
		}
		if(loup==4)	{
			System.out.println("La valeur de la position 0 du tableau est de 4");
		}
		if(girafe==4) {
			System.out.println("La valeur de la position 0 du tableau est de 4");
		}
	}  
}
