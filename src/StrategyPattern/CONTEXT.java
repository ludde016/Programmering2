package StrategyPattern;

public class CONTEXT {
	private StrategyInterface _strategy;
	
	public CONTEXT(StrategyInterface strategy) {
		_strategy = strategy; 
	}
	
	public double executeStrategy(double num1, double num2) {
		
		return _strategy.Calculate(num1, num2);
	}
}
