package RepetitionsLäxa;

import java.util.Scanner;

public class Uppgift1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int tal;
		int sum = 0;
		while(true) {
			tal = input.nextInt();
			sum = sum + tal;
			if (tal == 0) {
				break;
			}
		}
		System.out.println(sum);
	}

}
