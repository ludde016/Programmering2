package RepetitionsLäxa;

import java.util.Scanner;

public class Uppgift2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] ord;
		
		while(true) {
			ord = new String[3];
			for (int i = 0; i < 3; i++) {
				ord[i] = input.nextLine(); 
			}
			for (int i = 2; i > -1; i--) {
				System.out.println(ord[i]);
				
			}
		}
	}
}
