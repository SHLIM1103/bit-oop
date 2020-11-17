package day04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculationDTO cal = new CalculationDTO();
		CalculationController controller = new CalculationController();

		System.out.println("계산기 실행");
		
		System.out.print("number1: ");
		cal.setNumber1(scanner.nextInt());

		System.out.print("연산자 입력(+,-,*,/,%): ");
		scanner.nextLine();
		cal.setOpcode(scanner.nextLine());
		
		System.out.print("number2: ");
		cal.setNumber2(scanner.nextInt());
		
		System.out.println("답: " + controller.execute(cal));		
		
		scanner.close();
	}
}