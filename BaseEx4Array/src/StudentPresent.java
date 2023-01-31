// Exercice 4.3
import java.util.Scanner;

public class StudentPresent {

	public static double  average(double[] notes) {
		double result = 0;
		for(int i = 0; i < notes.length; i++) {
			result += notes[i];
			//System.out.println(result);
		}
			
		result = result/notes.length;
		return result;
		}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] teachList = {
				{"Jean Marc","10","12","15","8","12"},
				{"Jean Paul","12","15","8","7","9"},
				{"Jean Michel","5","12","12","8","14"},
				{"Jean Louis","15","12","10","11","9"},
				{"Jean Yves","10","12","18","15","5"},
		};
		System.out.println("Indiquer le nom de l'élève recherchcer :");
		String findStudent = scan.nextLine();
		double[] notes = new double[5];
		boolean present = false;
		for(int i = 0; i < teachList.length;i++)
			//System.out.println(teachList[i][0]);
			if(findStudent.equalsIgnoreCase(teachList[i][0])) {
				present = true;
				System.out.print(findStudent + " est bien dans la liste avec les notes de ");
				for(int j = 1; j < teachList[i].length;j++) {
					System.out.print(teachList[i][j] + " ");
					notes[j-1] = Integer.parseInt(teachList[i][j]);
				}		
				System.out.print( " pour une moyenne de  " + average(notes));
			}
		if(!present)
			System.out.print(findStudent + " n'est pas dans la liste.");
				
		
		scan.close();
	}
}
