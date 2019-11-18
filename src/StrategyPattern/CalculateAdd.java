package StrategyPattern;

public class CalculateAdd implements StrategyInterface{

	@Override
	public double Calculate(double num1, double num2) {
		return num1 + num2;
	}

}
