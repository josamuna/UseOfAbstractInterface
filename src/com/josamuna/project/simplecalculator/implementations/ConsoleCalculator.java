package com.josamuna.project.simplecalculator.implementations;

import com.josamuna.project.simplecalculator.interfaces.IBehaviorCalculator;
import com.josamuna.project.simplecalculator.utils.ArithmeticSign;
import com.josamuna.project.simplecalculator.utils.Calculator;

public class ConsoleCalculator implements IBehaviorCalculator{
	
	public ConsoleCalculator() {
	}
	
	@Override
	public void showResultSum(double firstNumber, double secondNumber) {
		Calculator calculator = PrepareCalculation(firstNumber, secondNumber);
		
		System.out.println(String.format("SUM : %s %s %s = %s",
				calculator.getFirstNumber(), ArithmeticSign.SUM, calculator.getSecondNumber(), 
				calculator.sum(calculator.getFirstNumber(), calculator.getSecondNumber())));
	}

	private Calculator PrepareCalculation(double firstNumber, double secondNumber) {
		Calculator calculator = new Calculator();
		
		calculator.setFirstNumber(firstNumber);
		calculator.setSecondNumber(secondNumber);
		return calculator;
	}
	
	@Override
	public void showResultSubstract(double firstNumber, double secondNumber) {
		Calculator calculator = PrepareCalculation(firstNumber, secondNumber);
		
		System.out.println(String.format("SUNSTRACT : %s %s %s = %s",
				calculator.getFirstNumber(), ArithmeticSign.SUBSTRACT, calculator.getSecondNumber(), 
				calculator.substract(calculator.getFirstNumber(), calculator.getSecondNumber())));
	}
	
	@Override
	public void showResultMultiplication(double firstNumber, double secondNumber) {
		Calculator calculator = PrepareCalculation(firstNumber, secondNumber);
		
		System.out.println(String.format("MULTIPLICATION : %s %s %s = %s",
				calculator.getFirstNumber(), ArithmeticSign.MULTIPLICATION, calculator.getSecondNumber(), 
				calculator.multiplication(calculator.getFirstNumber(), calculator.getSecondNumber())));
	}
	
	@Override
	public void showResultDivide(double firstNumber, double secondNumber) {
		Calculator calculator = PrepareCalculation(firstNumber, secondNumber);
		
		System.out.println(String.format("DIVIDE : %s %s %s = %s",
				calculator.getFirstNumber(), ArithmeticSign.DIVIDE, calculator.getSecondNumber(), 
				calculator.divide(calculator.getFirstNumber(), calculator.getSecondNumber())));
	}

}
