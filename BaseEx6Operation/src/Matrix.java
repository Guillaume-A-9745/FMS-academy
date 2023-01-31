//Exercice 6.4
public class Matrix {
	
	public static int[][] add(int[][] numbersOne, int[][] numbersTwo) {
		int [][] result = new int [2][3];
		for(int i = 0; i < numbersOne.length;i++) {
			for(int j = 0; j < numbersOne[i].length; j++) {
				result[i][j] = numbersOne[i][j] + numbersTwo[i][j];
			}
		}
		display(numbersOne);
		System.out.println("+");
		display(numbersTwo);
		System.out.println("=");
		display(result);
		return null;
	}
	public static int[][] sub(int[][] numbersOne, int[][] numbersTwo) {
		int [][] result = new int [2][3];
		for(int i = 0; i < numbersOne.length;i++) {
			for(int j = 0; j < numbersOne[i].length; j++) {
				result[i][j] = numbersOne[i][j] - numbersTwo[i][j];
			}
		}
		display(numbersOne);
		System.out.println("-");
		display(numbersTwo);
		System.out.println("=");
		display(result);
		return null;
	}
	public static int[] display (int[][]arrayOne){
	
		for (int[] displayResult: arrayOne) {             // Affichage des tableaux avec une boucle for each
		     for (int s: displayResult) {
		         System.out.print(s + "   ");
		     }
		     System.out.println();
		  }
		return null;
		
	}
	public static void main(String[] args) {
		int [][] numbersOne = {
				{1,2,0},
				{4,3,-1}
		};
		int [][] numbersTwo = {
				{5,2,3},
				{1,3,4}
		};
		
		add(numbersOne,numbersTwo);
		System.out.println("---------------");
		sub(numbersOne,numbersTwo);
		
	}
}
