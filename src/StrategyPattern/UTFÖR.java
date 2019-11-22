package StrategyPattern;

public class UTFÖR {
	
	public static void main(String[] args) {
		
		CONTEXT add = new CONTEXT(new CalculateAdd());
		System.out.println("10 + 100 =" + add.executeStrategy(10, 100));
	}

}
