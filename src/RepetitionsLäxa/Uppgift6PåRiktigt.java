package RepetitionsL‰xa;

import java.util.ArrayList;
import java.util.Scanner;

public class Uppgift6PÂRiktigt {
	
	static ArrayList<String> result = new ArrayList<String>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ord = "ord";
		rekursiv(ord);
		
	}
	
	public static <T> void rekursiv(String ord) {
		
		
		while(result.size() < 6) {
			rekursiv(ord);
		}
		System.out.println(result);
	} 
}
