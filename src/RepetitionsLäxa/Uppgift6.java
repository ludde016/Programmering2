package RepetitionsL�xa;

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
	/**Metoden fungerar p� s� s�tt att den flyttar fram den f�rsta bokstaven ett steg och sedan sparar den det nya ordet
	 * ,detta g�r den tills att bokstaven som var i b�rjan hamnar i slutet och d� b�rjar den om tills den har bildar alla anagram.
	 * 
	 * @param ord
	 * Detta �r det ord som anv�ndaren har valt att skriva ut alla anagram av
	 */
	public static <T> void anagrams(String ord) {
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
	/**Metoden fungerar p� s�tt att den tar emot char-arrayen fr�n f�rra metoden och bildar ett ord med alla dess bokst�ver
	 * 
	 * @param array
	 * Detta �r den char-arrayen med alla bokst�ver
	 * @return
	 * Metoden returnerar ordet som �r ett anagram
	 */
	public static <T> String word(char[] array) { 
		String anagram = "";
		for (int i = 0; i < array.length; i++) {
			anagram = anagram + array[i];
		}
		return anagram;
	}
	/**Metoden fungerar p� s� s�tt att den tar in varje anagram och sparar det i en arraylist
	 * 
	 * @param anagram
	 * Detta �r anagramet
	 * @return
	 * Den returnerar en arraylist med anagramen
	 */
	public static <T> ArrayList SaveWord(String anagram) {
		result.add(anagram);
		return result;
		
	}

}
