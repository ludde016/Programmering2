package RepetitionsLäxa;

import java.util.ArrayList;
import java.util.Scanner;

public class Uppgift6PåRiktigt {

	static ArrayList<String> result = new ArrayList<String>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ord = "ord";
		char[] array = ord.toCharArray();
		rekursiv(array);

	}

	public static <T> void rekursiv(char[] array) {
		char save;
		for (int j = 0; j < 2; j++) {
			save = array[j + 1];
			array[j + 1] = array[j];
			array[j] = save;
			SaveWord(word(array));

		}
		if (result.size() < 6) {
			rekursiv(array);
		}
		else {
			System.out.println(result);
		}
	}

	public static <T> String word(char[] array) {
		String anagram = "";
		for (int i = 0; i < array.length; i++) {
			anagram = anagram + array[i];
		}
		return anagram;
	}
	
	public static <T> ArrayList SaveWord(String anagram) {
		if (!result.contains(anagram)) { //denna kodsnutt behövs egentligen inte då inga "kopior" bildas
		result.add(anagram);
		}
		return result;

	}
}
