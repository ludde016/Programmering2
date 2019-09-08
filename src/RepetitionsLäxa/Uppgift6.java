package RepetitionsLäxa;

import java.util.Scanner;

public class Uppgift6 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ord = input.next();
		anagram(ord);
	}
	
	public static <T> String anagram(String ord) {
		// double iter = Math.pow(ord.length() - 1, 2); //Antalet iterrationer
		char[] array = ord.toCharArray(); 
		char save;
		for (double i = 0; i < ord.length(); i++) {
			for (int j = 0; j < ord.length(); j++) {
				save = array[j + 1];
				array[j + 1] = array[j];
				array[j] = save;
			}
			
		}
		
		return null;
	}

}
