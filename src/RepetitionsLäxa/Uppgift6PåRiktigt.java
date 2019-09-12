package RepetitionsL‰xa;

import java.util.ArrayList;
import java.util.Scanner;

public class Uppgift6PÂRiktigt {

	static ArrayList<String> result = new ArrayList<String>();
	static int index = 0;

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

			while (result.size() < 6) {
				rekursiv(array);
			}
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
}
