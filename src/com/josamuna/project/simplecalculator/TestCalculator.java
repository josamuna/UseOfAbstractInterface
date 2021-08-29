package com.josamuna.project.simplecalculator;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.josamuna.project.simplecalculator.implementations.ConsoleCalculator;
import com.josamuna.project.simplecalculator.implementations.GUICalculator;
import com.josamuna.project.simplecalculator.implementations.WebCalculator;
import com.josamuna.project.simplecalculator.utils.Calculator;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		ConsoleCalculator ConsoleCalculator = new ConsoleCalculator();
		calculator.setFirstNumber(100.3);
		calculator.setSecondNumber(10);
		
		ConsoleCalculator.showResultSum(calculator.getFirstNumber(), 
				calculator.getSecondNumber());
		
		ConsoleCalculator.showResultSubstract(calculator.getFirstNumber(), 
				calculator.getSecondNumber());
		
		ConsoleCalculator.showResultMultiplication(calculator.getFirstNumber(), 
				calculator.getSecondNumber());
		
		try {
			ConsoleCalculator.showResultDivide(calculator.getFirstNumber(), 
					calculator.getSecondNumber());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		GUICalculator gui = new GUICalculator();
		gui.showResultSum(calculator.getFirstNumber(), calculator.getSecondNumber());
		
		gui.showResultSubstract(calculator.getFirstNumber(), calculator.getSecondNumber());
		
		gui.showResultMultiplication(calculator.getFirstNumber(), calculator.getSecondNumber());
		
		try {
			gui.showResultDivide(calculator.getFirstNumber(), calculator.getSecondNumber());
		} catch (ArithmeticException e) {
			JFrame frame = new JFrame();
			frame.setTitle("Division Calculator");
			frame.setSize(300, 100);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JLabel l1 = new JLabel();
			l1.setText(e.getMessage());
			l1.setFont(new Font("Courrier New", Font.BOLD, 25));
			l1.setForeground(Color.RED);
			
			frame.add(l1);
			frame.setLayout(new FlowLayout());
			frame.setVisible(true);
		}
		
		WebCalculator web = new WebCalculator();
		web.showResultSum(calculator.getFirstNumber(), calculator.getSecondNumber());
		
		web.showResultSubstract(calculator.getFirstNumber(), calculator.getSecondNumber());
		
		web.showResultMultiplication(calculator.getFirstNumber(), calculator.getSecondNumber());
		
		try {
			web.showResultDivide(calculator.getFirstNumber(), calculator.getSecondNumber());
		} catch (ArithmeticException e) {
			JFrame frame = new JFrame();
			frame.setSize(500, 100);
			frame.setTitle("Sum Calculator");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			String errorMessage = ""
					+ "<!DOCTYPE html>\r\n" + 
					"<html>\r\n" + 
					"	<head>\r\n" + 
					"		<title>Division Calculator</title>\r\n" + 
					"	</head>\r\n" + 
					"	<body>\r\n" + 
					"		<p style=\"" + "color:red;font-weight:bold;" + "\">" + e.getMessage() + "</p>\r\n" + 
					"	</body>\r\n" + 
					"</html>";
			JEditorPane error = new JEditorPane("text/html", errorMessage);

			frame.add(error);
			
			frame.setLayout(new FlowLayout());
			frame.setVisible(true);
		}
	}

}
