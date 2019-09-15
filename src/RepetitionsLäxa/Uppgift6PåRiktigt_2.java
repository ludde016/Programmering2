package RepetitionsL‰xa;

import java.util.ArrayList;
import java.util.Scanner;

public class Uppgift6PÂRiktigt_2 {

	static ArrayList<String> result = new ArrayList<String>();
	static int index = 0;
	static boolean stop = false;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ord = input.nextLine();
		char[] array = ord.toCharArray();
		rekursiv(array);

	}

	public static <T> void rekursiv(char[] array) {
		char save;
		for (int i = 0; i < array.length + index; i++) {
			for (int j = index; j < array.length - 1; j++) {
				save = array[j + 1];
				array[j + 1] = array[j];
				array[j] = save;
				SaveWord(word1(array));
				SaveWord(word2(array));

			} 
		}
		if (index == array.length - 1) {
			stop = true;
			index = 0;
			rekursiv(array);
			System.out.println(result);
		}
		while (stop == false) {
			index++;
			rekursiv(array);
			
		}
	}

	public static <T> String word1(char[] array) {
		String anagram = "";
		for (int i = 0; i < array.length; i++) {
			anagram = anagram + array[i];
		}
		return anagram;
	}
	
	public static <T> String word2(char[] array) {
		String anagram = "";
		for (int i = array.length - 1; i >= 0; i--) {
			anagram = anagram + array[i];
		}
		return anagram;
	}
	
	public static <T> ArrayList SaveWord(String anagram) {
		if (!result.contains(anagram)) { 
		result.add(anagram);
		}
		return result;

	}
}

