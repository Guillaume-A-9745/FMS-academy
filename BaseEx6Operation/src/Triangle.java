// Exercice 6.2
import java.util.Collections;

public class Triangle {

	public static void main(String[] args) {
		
		//première méthode:
		System.out.println("        *       ");
		System.out.println("       ***      ");
		System.out.println("      *****     ");
		System.out.println("     *******    ");
		System.out.println("    *********   ");
		System.out.println("   ***********  ");
		System.out.println("  ************* ");
		System.out.println(" ***************");
		
		
		System.out.println();
		System.out.println();
		
		//deuxième méthode:
		
		int rows = 8;
		   
		for (int i = 0; i < rows; i++) {
		   System.out.println(String.join("", Collections.nCopies(8-i-1, " "))
		             + String.join("", Collections.nCopies(2 * i + 1, "*")));
		   }
		   
	}

}
