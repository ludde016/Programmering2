package RepetitionsLäxa;

import java.util.ArrayList;
import java.util.Scanner;

public class Uppgift3 {

	static ArrayList<Object> List = new ArrayList<Object>();

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		while (true) {
			Object x = input.next();
				if (x ==(null)) {
				break;
			}
			Array(x);
		}
		
		System.out.println(List);

	}

	public static <T> ArrayList<Object> Array(Object x) { //Gör så att den kan ta in olika objekt
		List.add(x);

		return List;
	}

}
