// exercice 5.1
public class ConcatenateString {
	
	public static String method1 (String x,String y) {
		String result = x + " "+ y;
		return result;
	}
	
	public static String method2 (String x,String y) {
		String result =  x.concat(" "+ y);
		return result;
	}

	public static void main(String[] args) {
		String str1 = "bonjour";
		String str2 = "le monde";
		
		System.out.println(method1(str1,str2));
		System.out.println(method2(str1,str2));

	}

}
