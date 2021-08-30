package com.josamuna.project.simplecalculator.implementations;

import java.awt.FlowLayout;

import javax.swing.JEditorPane;
import javax.swing.JFrame;

import com.josamuna.project.simplecalculator.interfaces.IBehaviorCalculator;
import com.josamuna.project.simplecalculator.model.Calculator;
import com.josamuna.project.simplecalculator.utils.ArithmeticSign;

public class WebCalculator implements IBehaviorCalculator {

	@Override
	public void showResultSum(double firstNumber, double secondNumber) {
		Calculator calculator = PrepareCalculation(firstNumber, secondNumber);
		
		JFrame frame = new JFrame();
		frame.setSize(500, 100);
		frame.setTitle("Sum Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String dataToShow = ""
				+ "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"	<head>\r\n" + 
				"		<title>Sun Calculator</title>\r\n" + 
				"	</head>\r\n" + 
				"	<body>\r\n" + 
				"		<p>" + String.valueOf(calculator.getFirstNumber()) + " " + ArithmeticSign.SUM + " " + String.valueOf(calculator.getSecondNumber()) + " = " + String.valueOf(calculator.sum(calculator.getFirstNumber(), calculator.getSecondNumber())) + " </p>\r\n" + 
				"	</body>\r\n" + 
				"</html>";
		JEditorPane result = new JEditorPane("text/html", dataToShow);

		frame.add(result);
		
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}

	@Override
	public void showResultSubstract(double firstNumber, double secondNumber) {
		
		Calculator calculator = PrepareCalculation(firstNumber, secondNumber);
		
		JFrame frame = new JFrame();
		frame.setSize(500, 100);
		frame.setTitle("Substract Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String dataToShow = ""
				+ "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"	<head>\r\n" + 
				"		<title>Substract Calculator</title>\r\n" + 
				"	</head>\r\n" + 
				"	<body>\r\n" + 
				"		<p>" + String.valueOf(calculator.getFirstNumber()) + " " + ArithmeticSign.SUBSTRACT + " " + String.valueOf(calculator.getSecondNumber()) + " = " + String.valueOf(calculator.substract(calculator.getFirstNumber(), calculator.getSecondNumber())) + " </p>\r\n" + 
				"	</body>\r\n" + 
				"</html>";
		JEditorPane result = new JEditorPane("text/html", dataToShow);

		frame.add(result);
		
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}

	@Override
	public void showResultMultiplication(double firstNumber, double secondNumber) {
		Calculator calculator = PrepareCalculation(firstNumber, secondNumber);
		
		JFrame frame = new JFrame();
		frame.setSize(500, 100);
		frame.setTitle("Multiplication Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String dataToShow = ""
				+ "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"	<head>\r\n" + 
				"		<title>Multiplication Calculator</title>\r\n" + 
				"	</head>\r\n" + 
				"	<body>\r\n" + 
				"		<p>" + String.valueOf(calculator.getFirstNumber()) + " " + ArithmeticSign.MULTIPLICATION + " " + String.valueOf(calculator.getSecondNumber()) + " = " + String.valueOf(calculator.multiplication(calculator.getFirstNumber(), calculator.getSecondNumber())) + " </p>\r\n" + 
				"	</body>\r\n" + 
				"</html>";
		JEditorPane result = new JEditorPane("text/html", dataToShow);

		frame.add(result);
		
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}

	@Override
	public void showResultDivide(double firstNumber, double secondNumber) {
		Calculator calculator = PrepareCalculation(firstNumber, secondNumber);
		
		JFrame frame = new JFrame();
		frame.setSize(500, 100);
		frame.setTitle("Divide Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String dataToShow = ""
				+ "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"	<head>\r\n" + 
				"		<title>Divide Calculator</title>\r\n" + 
				"	</head>\r\n" + 
				"	<body>\r\n" + 
				"		<p>" + String.valueOf(calculator.getFirstNumber()) + " " + ArithmeticSign.DIVIDE + " " + String.valueOf(calculator.getSecondNumber()) + " = " + String.valueOf(calculator.divide(calculator.getFirstNumber(), calculator.getSecondNumber())) + " </p>\r\n" + 
				"	</body>\r\n" + 
				"</html>";
		JEditorPane result = new JEditorPane("text/html", dataToShow);

		frame.add(result);
		
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	private Calculator PrepareCalculation(double firstNumber, double secondNumber) {
		Calculator calculator = new Calculator();
		
		calculator.setFirstNumber(firstNumber);
		calculator.setSecondNumber(secondNumber);
		return calculator;
	}

}
