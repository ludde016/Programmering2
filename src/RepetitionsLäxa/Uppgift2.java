package RepetitionsLäxa;

import java.util.Scanner;

public class Uppgift2 {
	
	static 	Scanner input = new Scanner(System.in);

	public static void main(String[] args) { //Inte rekursiv tyvärr...
		while(true) {
		String ordet = input.nextLine();
		baklanges(ord(ordet));
		}
	}
	
	public static <T> char[] ord(String ordet) { //En generisk metod som endast använder Char[]...
		
		char[] array = ordet.toCharArray();
		
		return array;
	}
	
	public static void baklanges(char[] array) {
		String ny = "";
		for (int i = array.length -1; i >= 0; i--) {
			ny = ny + array[i];
		}
		System.out.println(ny);
		
	}
}
