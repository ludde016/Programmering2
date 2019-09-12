package RepetitionsLäxa;

import java.util.ArrayList;
import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		Object[] Box1 = {"Hej"};
		Object[] Box2 = {1};

		System.out.print(Comperator(Box1, Box2));
	}
	
	public static <T> boolean Comperator(Object[] Box1, Object[] Box2) {
		if (Box1[0].getClass() == (Box2[0].getClass())) {
			
			return true;
		}
		else {
			return false;
		}
		
	}

}
