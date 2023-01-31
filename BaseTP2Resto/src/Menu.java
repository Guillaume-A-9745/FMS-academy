/* Exercice TP 2
 * 	Simuler la prise d'une commande
 */
import java.util.Scanner;

public class Menu {
	
	public static String displayMenu (String[][]arrayOne){
		String displayResult = "";
		for (int i = 0; i < arrayOne.length; i++) {       
				displayResult +=   "[ ";
		     for (int j = 0; j < arrayOne[i].length; j++) { 
		    	 if(j != 0)
		    		 displayResult +=   " - ";
		    	 displayResult +=  arrayOne[i][j] ;
		     }
		     displayResult +=   " ]";
		  }
		return displayResult;
	}
	public static String displayChoices (String[][]menus,String[][]choices) {
		String result="";

		for(int i = 0; i < menus.length; i++) {
			for(int k = 0; k < choices.length;k++) {	
				if(choices[k][0].equals(menus[i][0])) {
					result += " - " + menus[i][1] ;
				}		
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String [] [] entree = {{"1", "Salade"},{"2","Soupe"},{"3","Quiche"},{"4","Aucune"}};
		String [] [] dishes = {{"1", "Poulet"},{"2","Boeuf"},{"3","Poissons"},{"4","Végétarien"},{"5","Vegan"},{"6","Aucun"}};
		String [] [] accompaniment = {{"1", "Riz"},{"2","Pates"},{"3","Frites"},{"4","Légumes"},{"5","Aucun"}};
		String [] [] drinks = {{"1", "Eau plate"},{"2","Eau gazeuze"},{"3","Soda"},{"4","Vin"},{"5","Aucune"}};
		String [] [] desserts = {{"1", "Tarte maison"},{"2","Mousse au chocolat"},{"3","Tiramisu"},{"4","Aucun"}};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bonjour, combien de menus souhaitez-vous ?");
		int nbMenu = scan.nextInt();
		String[][] customer = new String[nbMenu][5];
		for(int i = 0; i < nbMenu; i++) {
			System.out.println("Commande n° " + (i+1));
			System.out.println("Choix entrée :");
			System.out.println(displayMenu(entree));
			customer[i][0] = scan.next();
			System.out.println("Choix plats :");
			System.out.println(displayMenu(dishes));
			customer[i][1] = scan.next();
			System.out.println("Choix accompagnements :");
			System.out.println(displayMenu(accompaniment));
			customer[i][2] = scan.next();
			System.out.println("Choix boissons :");
			System.out.println(displayMenu(drinks));
			customer[i][3] = scan.next();
			System.out.println("Choix desserts :");
			System.out.println(displayMenu(desserts));
			customer[i][4] = scan.next();
		}
		/*
		 for(int i = 0; i < customer.length; i++) {
			for(int j = 0; j < customer[i].length; j++) {
				System.out.print(customer[i][j] + " ");
			}
			System.out.println();
		}
		 */
		System.out.println();System.out.println();
		
		System.out.println("Entrées à servire : " + displayChoices(entree,customer));
		System.out.println("Plats à servire : " + displayChoices(dishes,customer));
		System.out.println("Accompagements à servire : " + displayChoices(accompaniment,customer));
		System.out.println("Boissons à servire : " + displayChoices(drinks,customer));
		System.out.println("Desserts à servire : " + displayChoices(desserts,customer));
		
		scan.close();
	}
}
