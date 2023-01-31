
public class MatrixTest {

	public static void addMatrix(int[][] numbersOne, int[][] numbersTwo) {
		int bigRow = numbersOne.length; 
		int bigColumn = numbersOne[0].length;
		int smallRow = numbersOne.length;
		int smallColumn = numbersOne[0].length;
		if((numbersOne.length != numbersTwo.length)||(numbersOne[0].length != numbersTwo[0].length)) {
			if(numbersOne.length < numbersTwo.length) {
				smallRow = numbersOne.length;
				bigRow = numbersTwo.length;
			} else {
				smallRow = numbersTwo.length;
				bigRow = numbersOne.length;
			}
			if(numbersOne[0].length < numbersTwo[0].length) {
				smallColumn = numbersOne[0].length;
				bigColumn = numbersTwo[0].length;
			}else {
				smallColumn = numbersTwo[0].length;
				bigColumn = numbersOne[0].length;
			}
					
			//System.out.println("Rows = " + smallRow + " Columns = " + smallColumn);
		} 
		
		int [][] result = new int [smallRow][smallColumn];
		for(int i = 0; i < smallRow;i++) {
			for(int j = 0; j < smallColumn; j++) {
					result[i][j] = numbersOne[i][j] + numbersTwo[i][j];
			}
		}
		displayMatrix(numbersOne);
		System.out.println("+");
		displayMatrix(numbersTwo);
		System.out.println("=");
		displayMatrix(result);
		
	}
	/*
	public static void subMatrix(int[][] numbersOne, int[][] numbersTwo) {
		int [][] result = new int [numbersOne.length][numbersTwo[0].length];
		for(int i = 0; i < numbersOne.length;i++) {
			for(int j = 0; j < numbersOne[i].length; j++) {
				result[i][j] = numbersOne[i][j] - numbersTwo[i][j];
			}
		}
		displayMatrix(numbersOne);
		System.out.println("-");
		displayMatrix(numbersTwo);
		System.out.println("=");
		displayMatrix(result);
	}
	public static void mulScalMatrix(int[][] numbersOne, int numbersTwo) {
		int [][] result = new int [numbersOne.length][numbersOne[0].length];
		for(int i = 0; i < numbersOne.length;i++) {
			for(int j = 0; j < numbersOne[i].length; j++) {
				result[i][j] = numbersOne[i][j] * numbersTwo;
			}
		}
		System.out.println(numbersTwo);
		System.out.println("X");
		displayMatrix(numbersOne);
		System.out.println("=");
		displayMatrix(result);
	}
	*/
	public static void displayMatrix (int[][]arrayOne){
	
		for (int[] displayResult: arrayOne) {             // Affichage des tableaux avec une boucle for each
		     for (int s: displayResult) {
		         System.out.print(s + "   ");
		     }
		     System.out.println();
		  }
	}
	public static void main(String[] args) {
		int [][] firstMatrix = {{5,2,4},
								{0,1,1},
								{6,3,1}};
		int [][] secondMatrix ={{1,1,3},
								{2,5,6},
								{3,0,5}};		
		int [][] thridMatrix = {{8,7},
								{5,4},
								{2,1}};
		int [][] fourMatrix =  {{0,2},
								{1,2},
								{1,1}};
		
		addMatrix(firstMatrix,secondMatrix);
		System.out.println("-------------");
		addMatrix(thridMatrix,fourMatrix);
		System.out.println("-------------");
		addMatrix(firstMatrix,fourMatrix);
		System.out.println("-------------");
		/*
		subMatrix(thridMatrix,fourMatrix);
		System.out.println("-------------");
		mulScalMatrix(fourMatrix, 2);
		*/
	}

}
