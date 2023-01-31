// Exercice 5.2
public class FindWord {
	
	public static String Research(String str, String word) {
		String result;
		if(str.toLowerCase().contains(word.toLowerCase())) {
			result = word + " est bien dans la phrase";
		}else {
			result = word + " n'est pas dans la phrase";
		}
			
		return result;
	}

	public static void main(String[] args) {
		String str1 = "Il fait beau aujourd'hui.";
		String str2 = "Beau";
		
		System.out.println(Research(str1,str2));

	}

}
