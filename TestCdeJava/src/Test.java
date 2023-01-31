import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	
	public static String posNeg(int n) {
		String result , evenOdd;
		if(n>0) result = "Le nombre est positif !";
		else if(n<0) result = "Le nombre est négatif !";
		else  result = "Le nombre est 0 !";
		
		if(n%2==0) evenOdd = "Le nombre est pair !";
		else evenOdd = "Le nombre est impair !";
		
		return result + "\n" + evenOdd;
	}
	public static void main(String[] args) {
		Scanner askNumber = new Scanner(System.in);
		try {	
			System.out.println("Indiquez un nombre entier");
			int value = askNumber.nextInt();

			System.out.println(posNeg(value));
			
		}catch(InputMismatchException e){
			System.out.println("Erreur, un nombre entier demander");
		}
		askNumber.close();	
	}
}
