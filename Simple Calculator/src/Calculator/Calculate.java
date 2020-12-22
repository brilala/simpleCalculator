package Calculator;

import java.util.Scanner;
public class Calculate {

	public static final void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("First Number: ");
		int firstNumber = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Second Number: ");
		int secondNumber = scanner.nextInt();

		System.out.println("Operation? (+ - * /)");
		scanner.nextLine();
		String operator = scanner.nextLine();

		double result = 0;

		if (operator.equals("+")) {
			AddOperation add = new AddOperation();
			add.setA(firstNumber);
			add.setB(secondNumber);
			result = add.getResult();

		} else if (operator.equals("-")) {
			SubtractOperation subtract = new SubtractOperation();
			subtract.setA(firstNumber);
			subtract.setB(secondNumber);
			result = subtract.getResult();

		} else if (operator.equals("*")) {
			MultiplyOperation multiply = new MultiplyOperation();
			multiply.setA(firstNumber);
			multiply.setB(secondNumber);
			result = multiply.getResult();

		} else if (operator.equals("/")) {
			DivideOperation divide = new DivideOperation();
			divide.setA(firstNumber);
			divide.setB(secondNumber);
			result = divide.getResult();
		} else {
				System.out.println("Input not recognized.");
			}
			System.out.println("The result is: ");
			System.out.println(result);
	}

}
