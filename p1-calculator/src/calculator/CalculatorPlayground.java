package calculator;

import java.util.Scanner;

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
	}

}
