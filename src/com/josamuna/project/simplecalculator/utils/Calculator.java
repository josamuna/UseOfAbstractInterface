package com.josamuna.project.simplecalculator.utils;

import com.josamuna.project.simplecalculator.interfaces.ICalculator;

public class Calculator implements ICalculator {

	private double firstNumber;
	private double secondNumber;
	
	public Calculator() {
	}
	
	public Calculator(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	@Override
	public double sum(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

	@Override
	public double substract(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	@Override
	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

	@Override
	public double divide(double firstNumber, double secondNumber) throws ArithmeticException {
		if(secondNumber == 0) {
			throw new ArithmeticException("No division by zero !");
		} else {
			return firstNumber / secondNumber;
		}
	}

}
