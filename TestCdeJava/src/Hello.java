import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Bonjour bienvenu dans mon projramme java.");
	
		Scanner askUser = new Scanner(System.in);
		System.out.println("Quel est votre nom ?");
		String name = askUser.next();
		System.out.println("Bonjour " + name);
		
		System.out.println("Quel est votre prènom ?");
		String LastName = askUser.next();
		System.out.println("Bonjour " + name + " " + LastName);
		
		askUser.close();		
	}
}
