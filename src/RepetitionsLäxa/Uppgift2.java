package RepetitionsLäxa;

import java.util.Scanner;

public class Uppgift2 {
	
	static 	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String ordet = input.nextLine();
		baklanges(ord(ordet));
		
	}
	
	public static char[] ord(String ordet) {
		
		char[] array = ordet.toCharArray();
		
		return array;
	}
	
	public static void baklanges(char[] array) {
		String ny = "";
		for (int i = array.length -1; i >= 0; i--) {
			ny = ny + array[i];
		}
		System.out.print(ny);
		
	}
}
