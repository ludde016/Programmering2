package RepetitionsLäxa;

import java.util.Scanner;

public class Uppgift6 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ord = input.next();
		anagram(ord);
	}
	
	public static <T> String anagram(String ord) {
		double iter = Math.pow(ord.length() - 1, 2); //Antalet iterrationer
		char[] array = ord.toCharArray(); 
		for (double i = 0; i < iter; i++) {
			for (int j = 0; j < ord.length() - 1; j++) {
				
			}
			
		}
		
		return null;
	}

}
