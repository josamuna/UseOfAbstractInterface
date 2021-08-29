package com.josamuna.project.simplecalculator;

public interface ICalculator {

	public double sum(double firstNumber, double secondNumber);
	public double substract(double firstNumber, double secondNumber);
	public double multiplication(double firstNumber, double secondNumber);
	public double divide(double firstNumber, double secondNumber) throws ArithmeticException;
}
