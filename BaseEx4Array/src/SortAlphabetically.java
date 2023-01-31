// Exercice 4.4
import java.util.Arrays;

public class SortAlphabetically {

	public static void main(String[] args) {
		String [] name = {"Guillaume","Vincent","Jean","Marc","Françoise","Marie"};
		Arrays.sort(name);
		System.out.println("Par ordre croissant : ");
		for(int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Par ordre décroissant : ");
		for(int j = name.length ; j > 0; j--) {
			System.out.print(name[j-1] + " ");
		}
	}

}
