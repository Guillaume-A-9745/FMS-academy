//Exercice 6.3
public class LargestInArray {

	public static void main(String[] args) {
		int[] numbers = {78,6,-250,2,12,9};
		int biggest = 0;
		int secondBiggest = 0;
		for(int i = 0; i < numbers.length; i++){
			if(biggest < numbers[i]) {
				biggest = numbers[i];
			}else if(secondBiggest < numbers[i]) {
				secondBiggest = numbers[i];
			}
		}
		System.out.println(biggest + " + " + secondBiggest + " = " + (biggest+secondBiggest));
	}

}
