// Exercice 4.2
import java.util.Scanner;

public class nameStudent {
	
	public static double  average(double[] notes) {
		double result = 0;
		for(int i = 0; i < notes.length; i++)
			result += notes[i];
		result = result/notes.length;
		return result;
		}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Voulez vous entrer un nouvelle élève ? o / n ");
		String student = scan.next();
		while(student.equalsIgnoreCase("o")) {
			System.out.println("Veuillez indiquer le nom et le prénom de l'élève");
			String firstName = scan.next();
			String lastName = scan.nextLine();
			System.out.println("Veuillez indiquer le nombre de notes à rentrer pour l'élève ");
			int nbNote = scan.nextInt();
			double[] notes = new double[nbNote];
			for(int i = 0; i < nbNote; i++) {
				System.out.println("Entrez la " + (i+1) + " note(s) ");
				notes[i] = scan.nextDouble();
			}
			System.out.println("L'élève " + firstName + " " + lastName + " a une moyenne de " + average(notes));
			System.out.println("Voulez vous entrer un nouvelle éléve ? o / n ");
			student = scan.next();
		} 
		
		System.out.println("Fin du programme!");
		
		
		
		//Collections.sort(note);So
		
		
		
		scan.close();
	}

}
