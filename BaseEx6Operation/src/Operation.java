// Exercice 6.1
public class Operation {

	public static double add(double a,double b) {
		return a + b;
	}
	public static double sub(double a,double b) {
		return a - b;
	}
	public static double mul(double a,double b) {
		return a * b;
	}
	public static String div(double a,double b) {
		if(a == 0 || b == 0) {
			String result = "cette opération n'a pas de sens";
			return result;
		}else {
			String value = "" + a / b;
			return value;
		}
			
		
	}
	public static void main(String[] args) {
		System.out.println(add(5,2));
		System.out.println(sub(5,2));
		System.out.println(div(3,0));
	}

}
