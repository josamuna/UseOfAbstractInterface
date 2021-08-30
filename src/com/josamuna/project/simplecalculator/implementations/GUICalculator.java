package com.josamuna.project.simplecalculator.implementations;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.josamuna.project.simplecalculator.interfaces.IBehaviorCalculator;
import com.josamuna.project.simplecalculator.model.Calculator;
import com.josamuna.project.simplecalculator.utils.ArithmeticSign;

public class GUICalculator implements IBehaviorCalculator {
	public GUICalculator() {
	}

	private Calculator PrepareCalculation(double firstNumber, double secondNumber) {
		Calculator calculator = new Calculator();
		
		calculator.setFirstNumber(firstNumber);
		calculator.setSecondNumber(secondNumber);
		return calculator;
	}

	@Override
	public void showResultSum(double firstNumber, double secondNumber) {
		Calculator calculator = PrepareCalculation(firstNumber, secondNumber);
		
		JFrame frame = new JFrame();
		frame.setSize(400, 100);
		frame.setTitle("Sum Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel();
		JLabel l5 = new JLabel();
		
		l1.setText(String.valueOf(calculator.getFirstNumber()));
		l2.setText(String.valueOf(ArithmeticSign.SUM));
		l3.setText(String.valueOf(calculator.getSecondNumber()));
		l4.setText("=");
		l5.setText(String.valueOf(calculator.sum(calculator.getFirstNumber(), calculator.getSecondNumber())));

		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
	}

	@Override
	public void showResultSubstract(double firstNumber, double secondNumber) {
		Calculator calculator = PrepareCalculation(firstNumber, secondNumber);
		
		JFrame frame = new JFrame();
		frame.setSize(400, 100);
		frame.setTitle("Substract Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel();
		JLabel l5 = new JLabel();
		
		l1.setText(String.valueOf(calculator.getFirstNumber()));
		l2.setText(String.valueOf(ArithmeticSign.SUBSTRACT));
		l3.setText(String.valueOf(calculator.getSecondNumber()));
		l4.setText("=");
		l5.setText(String.valueOf(calculator.substract(calculator.getFirstNumber(), calculator.getSecondNumber())));

		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
	}

	@Override
	public void showResultMultiplication(double firstNumber, double secondNumber) {
		Calculator calculator = PrepareCalculation(firstNumber, secondNumber);
		
		JFrame frame = new JFrame();
		frame.setSize(400, 100);
		frame.setTitle("Multiplication Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel();
		JLabel l5 = new JLabel();
		
		l1.setText(String.valueOf(calculator.getFirstNumber()));
		l2.setText(String.valueOf(ArithmeticSign.MULTIPLICATION));
		l3.setText(String.valueOf(calculator.getSecondNumber()));
		l4.setText("=");
		l5.setText(String.valueOf(calculator.multiplication(calculator.getFirstNumber(), calculator.getSecondNumber())));

		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
	}

	@Override
	public void showResultDivide(double firstNumber, double secondNumber) {
		Calculator calculator = PrepareCalculation(firstNumber, secondNumber);
		
		JFrame frame = new JFrame();
		frame.setSize(400, 100);
		frame.setTitle("Divide Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel();
		JLabel l5 = new JLabel();
		
		l1.setText(String.valueOf(calculator.getFirstNumber()));
		l2.setText(String.valueOf(ArithmeticSign.DIVIDE));
		l3.setText(String.valueOf(calculator.getSecondNumber()));
		l4.setText("=");
		l5.setText(String.valueOf(calculator.divide(calculator.getFirstNumber(), calculator.getSecondNumber())));

		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);	
		
	}
}
