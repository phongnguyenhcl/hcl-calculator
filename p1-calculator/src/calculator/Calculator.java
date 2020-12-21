package calculator;

public class Calculator {
	
	private double num1;
	private double num2;
	private char operator;
	private double result;
	
	public Calculator(double num1, double num2, char operator) {
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
	}
	
	public double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public double subtract(double num1, double num2) {
		return num1 - num2;
	}
	
	public double multiply(double num1, double num2) {
		return num1 * num2;
	}
	
	public double divide(double num1, double num2) {
		return num1 / num2;
	}
	
	public double getResult() {
		switch (this.operator) {
			case '+':
				this.result = add(this.num1, this.num2);
				break;
			case '-':
				this.result = subtract(this.num1, this.num2);
				break;
			case '*':
				this.result = multiply(this.num1, this.num2);
				break;
			case '/':
				this.result = divide(this.num1, this.num2);
				break;
			default:
				System.out.println("Invalid operator");
		}
		
		return this.result;
	}
	
	

}
