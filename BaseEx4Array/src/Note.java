// exercice 4.1
public class Note {

	public static double smaller(double[] x) {
		double result = x[0];
		for(int i = 0; i < x.length; i++)
			if(result> x[i])
				result=x[i];
		return result ;
	}
	public static double bigger(double[] x) {
		double result = x[0];
		for(int i = 0; i < x.length; i++)
			if(result < x[i])
				result=x[i];
		return result;
	}
	public static double  average(double[] x) {
		double result = 0;
		for(int i = 0; i < x.length; i++)
			result += x[i];
		result = result/x.length;
		return result;
	}
	public static void main(String[] args) {
		double [] myArray = {1, 2 ,3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("La valeur la plus petite du tableau est " + smaller(myArray)+ ".");
		System.out.println("La valeur la plus grande du tableau est " + bigger(myArray) + ".");
		System.out.println("La moyenne du tableau est " + average(myArray) + ".");
	}

}
