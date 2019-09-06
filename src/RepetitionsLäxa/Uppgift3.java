package RepetitionsLäxa;

import java.util.ArrayList;
import java.util.Scanner;

public class Uppgift3 {

	static ArrayList<String> List = new ArrayList<String>();

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		while (true) {
			String name = input.nextLine();
				if (name.equals("")) {
				break;
			}
			Array(name);
		}
		
		System.out.println(List);

	}

	public static <T> ArrayList<String> Array(String name) {
		List.add(name);

		return List;
	}

}
