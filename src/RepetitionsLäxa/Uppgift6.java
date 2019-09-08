package RepetitionsLäxa;

import java.util.ArrayList;
import java.util.Scanner;

public class Uppgift6 {
	
	static ArrayList<String> result = new ArrayList<String>();
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ord = input.next();
		SaveWord(ord);
		anagrams(ord);
	}
	
	public static <T> void anagrams(String ord) {
		// double iter = Math.pow(ord.length() - 1, 2); //Antalet iterrationer
		char[] array = ord.toCharArray(); 
		char save;
		for (double i = 0; i < ord.length() - 1; i++) {
			for (int j = 0; j < ord.length() - 1; j++) {
				save = array[j + 1];
				array[j + 1] = array[j];
				array[j] = save;
				SaveWord(word(array));
				
			}
			
		}
		
		System.out.print(result);
	}
	
	public static <T> String word(char[] array) { 
		String anagram = "";
		for (int i = 0; i < array.length; i++) {
			anagram = anagram + array[i];
		}
		return anagram;
	}
	
	public static <T> ArrayList SaveWord(String anagram) {
		result.add(anagram);
		return result;
		
	}

}
