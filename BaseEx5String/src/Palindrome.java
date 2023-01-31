// exercices: 5.4  5.5
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Donner un mot :");
		String wordUser = scan.nextLine();
		wordUser = wordUser.replaceAll("\\s","").toLowerCase();
		String reverseWord = "";
		 for(int i = wordUser.length() - 1; i >= 0; i--)
	        {
			 reverseWord = reverseWord + wordUser.charAt(i);
	        }
		if(reverseWord.equals( wordUser)) {
			System.out.println("C'est un palindrome !");
		}else {
			System.out.println("Ce n'est pas un palindrome !");
		}
		//System.out.println(reverseWord + " " + wordUser);
		scan.close();
	}
}
