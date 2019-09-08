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
	/**Metoden fungerar på så sätt att den flyttar fram den första bokstaven ett steg och sedan sparar den det nya ordet
	 * ,detta gör den tills att bokstaven som var i början hamnar i slutet och då börjar den om tills den har bildar alla anagram.
	 * 
	 * @param ord
	 * Detta är det ord som användaren har valt att skriva ut alla anagram av
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
	/**Metoden fungerar på sätt att den tar emot char-arrayen från förra metoden och bildar ett ord med alla dess bokstäver
	 * 
	 * @param array
	 * Detta är den char-arrayen med alla bokstäver
	 * @return
	 * Metoden returnerar ordet som är ett anagram
	 */
	public static <T> String word(char[] array) { 
		String anagram = "";
		for (int i = 0; i < array.length; i++) {
			anagram = anagram + array[i];
		}
		return anagram;
	}
	/**Metoden fungerar på så sätt att den tar in varje anagram och sparar det i en arraylist
	 * 
	 * @param anagram
	 * Detta är anagramet
	 * @return
	 * Den returnerar en arraylist med anagramen
	 */
	public static <T> ArrayList SaveWord(String anagram) {
		result.add(anagram);
		return result;
		
	}

}
