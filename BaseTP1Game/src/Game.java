import java.util.Scanner;
public class Game {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Voulez-vous jouer ?  oui / non");
		String reponse = scan.next();
		while(reponse.equalsIgnoreCase("oui")) {
			int unknownNumber =(int) (Math.random() * 100);
			System.out.println("Trouver un nombre entre 1 et 100.");
			int value = scan.nextInt();
			int counter = 1;
			while(value != unknownNumber){
				System.out.println((value>unknownNumber)? "C'est moins":"C'est plus");
				value = scan.nextInt();	
				counter++;
			}
			System.out.println("Bravo !! Le nombre est bien " + unknownNumber + ", vous avez trouvé en " + counter + " essais !");
			System.out.println("Voulez-vous rejouer ?");
			reponse = scan.next();
		}
		System.out.println("Au revoir !");
		scan.close();
	}
}
