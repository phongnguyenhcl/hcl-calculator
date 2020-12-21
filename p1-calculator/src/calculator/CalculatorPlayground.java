package calculator;

import java.util.Scanner;
import java.io.*; 
import java.lang.*;

public class CalculatorPlayground {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The First Number: ");
		double num1 = scan.nextDouble();
		System.out.println("Enter The Second Number: ");
		double num2 = scan.nextDouble();
		System.out.println("Choose an operator +, -, *, /: ");
		scan.nextLine();
		String operator = scan.nextLine();
		
		Calculator c1 = new Calculator(num1, num2, operator);
		
		if (c1.getResult() % 1 != 0) {
			System.out.println(String.format("%.3f", c1.getResult()));
		} else {
			System.out.println(String.format("%.0f", c1.getResult()));

		}
		System.out.println();
		System.out.println("Number of Calculators: " + Calculator.calculatorCount);
	}

}
