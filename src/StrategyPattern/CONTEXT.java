package StrategyPattern;

public class CONTEXT {
	private StrategyInterface strategy;
	
	public CONTEXT(StrategyInterface _strategy) {
		_strategy = strategy; 
	}
	
	public double executeStrategy(double num1, double num2) {
		
		return strategy.Calculate(num1, num2);
	}
}
