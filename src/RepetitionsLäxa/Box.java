package RepetitionsLäxa;

import java.util.ArrayList;
import java.util.Scanner;

public class Box {
	static ArrayList<Object> Box1 = new ArrayList<Object>();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		while (true) {
			Object x = input.next();
			Storage(x);
		}
	}

	public static <T> ArrayList<Object> Storage(Object x) {
		Box1.add(x);

		return Box1;
	}

}
