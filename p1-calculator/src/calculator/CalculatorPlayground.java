/**
 * CalculatorPlayground class that displays the result
 * of using the arithmetic operator.
 *
 * @author  Phong Van Nguyen
 */

package calculator;

import java.util.Scanner;
import java.io.*; 
import java.lang.*;

public class CalculatorPlayground {

	public static void main(String[] args) {
		double num1;
		double num2;
		String operator;
		Calculator c1;
		
		Scanner scan = new Scanner(System.in);
		
		String use = "yes";
		while (use.equals("yes")) {
			System.out.println("Enter The First Number: ");
			num1 = scan.nextDouble();
			System.out.println("Enter The Second Number: ");
			num2 = scan.nextDouble();
			System.out.println("Choose an operator +, -, *, /: ");
			scan.nextLine();
			operator = scan.nextLine();
			
			c1 = new Calculator(num1, num2, operator);
			if (num2 == 0 && operator.equals("/")) {
				System.out.println("Cannot divide by 0. Please try again");
			} else {
				if (c1.getResult() % 1 != 0) {
					System.out.println(String.format("%.3f", c1.getResult()));
				} else {
					System.out.println(String.format("%.0f", c1.getResult()));
				}
			}
			System.out.println("type yes to continue: " );
			use = scan.nextLine();
		}
		System.out.println();
		System.out.println("Done!");
		System.out.println("Number of Calculators: " + Calculator.calculatorCount);
	}
}
