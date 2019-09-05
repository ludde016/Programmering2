package RepetitionsLäxa;

import java.util.Scanner;

public class Uppgift3 {
	
	static Person[] array = new Person[100];
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Object in = input.next();
		ObjectArray(in);
		
	}
	
	public static Object[] ObjectArray(Object in) {
		
		
		return array;
	}
	
	class Person {
		String name;
		int age;
	}

}
