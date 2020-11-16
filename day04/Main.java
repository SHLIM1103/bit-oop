package day04;

import java.util.Scanner;
import day04.Calculation;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculation cal = new Calculation();

		System.out.print("number1: ");
		int number1 = scanner.nextInt();
		cal.setNumber1(number1);

		System.out.print("number2: ");
		int number2 = scanner.nextInt();
		cal.setNumber2(number2);

		System.out.println("number1 + number2 = " + add(cal.getNumber1(), cal.getNumber2()));
		System.out.println("number1 - number2 = " + subtract(cal.getNumber1(), cal.getNumber2()));
		System.out.println("number1 * number2 = " + multiply(cal.getNumber1(), cal.getNumber2()));
		System.out.println("number1 / number2 = " + divide(cal.getNumber1(), cal.getNumber2()));

		scanner.close();
	}

	static int add(int number1, int number2) {
		return number1 + number2;
	}

	static int subtract(int number1, int number2) {
		return number1 - number2;
	}

	static int multiply(int number1, int number2) {
		return number1 * number2;
	}

	static double divide(int number1, int number2) {
		return number1 / (double) number2;
	}
}
