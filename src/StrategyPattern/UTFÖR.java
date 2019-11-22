package StrategyPattern;

public class UTFÖR {
	
	public static void main(String[] args) {
		
		CONTEXT add = new CONTEXT(new CalculateAdd());
		System.out.println("10 + 100 = " + add.executeStrategy(10, 100));
		
		CONTEXT subtract = new CONTEXT(new CalculateSubtract());
		System.out.println("100 - 10 = " + subtract.executeStrategy(100, 10));
		
		CONTEXT multiply = new CONTEXT(new CalculateMultiply());
		System.out.println("10 * 10 = " + multiply.executeStrategy(10, 10));
		
		CONTEXT division = new CONTEXT(new CalculateDivision());
		System.out.println("100 / 10 = " + division.executeStrategy(100, 10));
	}

}
