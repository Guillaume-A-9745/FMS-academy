// Exercice 6 factorielle
import java.util.Scanner;

public class Factorial {

	public static int fact (int n) {
        if (n==0) return(1);
        else return(n*fact(n-1));
    }

    public static void main (String[] args) {
        //System.out.print(fact(5));
        //System.out.print("\n");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer un entier  ");
        int userNumber = scan.nextInt();
        String result = "";
        for(int i = 1; i <= userNumber; i++) {
        	//System.out.println("La factorielle de " + i + " = " +fact(i));
        	
        	if(i == 1) {
        		result = "" + i ;
        		System.out.println(i +"! = " + result + " = " + fact(i));
        	}else {
        		result = result + " x " + i ;
        		System.out.println(i +"! = " + result + " = " + fact(i));
        	}
        }
        scan.close();
    }
}


