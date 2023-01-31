//import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	
	public static String posNeg(int n) {
		String result , evenOdd;
		if(n>0) result = n + " est positif";
		else if(n<0) result = n + " est négatif";
		else  result = n + " est égal à 0";
		
		if(n%2==0) evenOdd = " et pair !";
		else evenOdd = " et impair !";
		
		return result + evenOdd;
	}
	public static void main(String[] args) {
		Scanner askNumber = new Scanner(System.in);
		System.out.println("Indiquez un ou des nombre(s) entier");
	
		while (askNumber.hasNextInt()) {
			int value = askNumber.nextInt();
			System.out.println(posNeg(value));
		}	
		
		//	try {}catch(InputMismatchException e){
		//		System.out.println("Erreur, un nombre entier demander");
		//	}	
		
		askNumber.close();
	}
}