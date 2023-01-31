// Exercice 5.3
import java.util.Scanner;

public class FindWordOfUser {

	public static String Research(String str, String word,String replaces) {
		String result = null;
		if(str.toLowerCase().contains(word.toLowerCase())) {
			result = str.replace(word, replaces);
		}else {
			result = word + " n'est pas dans la phrase";
		}
			
		return result;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = "Il fait beau aujourd'hui.";
		System.out.println("Quel mot chercher vous ?");
		String str2 = scan.next();
		System.out.println("Par quel mot voulez vous remplacer " + str2 +" ?");
		String str3 = scan.next();
		System.out.println(Research(str1,str2,str3));

		
		scan.close();
	}

}
