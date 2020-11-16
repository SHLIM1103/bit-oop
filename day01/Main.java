package day01;

import java.util.Scanner;

import day01.Operator;
import day01.Naming;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Operator operator = new Operator();
		Naming naming = new Naming();
		
		System.out.print("이름: ");
		String name = scanner.nextLine();
		naming.setName(name);
		
		System.out.print("myNumber1: ");
		int myNumber1 = scanner.nextInt();
		operator.setMyNumber1(myNumber1);
		
		System.out.print("myNumber2: ");
		int myNumber2 = scanner.nextInt();
		operator.setMyNumber2(myNumber2);
		
		System.out.println("myNumber1 + myNumber2 = " + (operator.getMyNumber1() + operator.getMyNumber2()));
		System.out.println("myNumber1 - myNumber2 = " + (operator.getMyNumber1() - operator.getMyNumber2()));
		System.out.println("myNumber1 * myNumber2 = " + (operator.getMyNumber1() * operator.getMyNumber2()));
		System.out.println("myNumber1 / myNumber2 = " + (operator.getMyNumber1() / operator.getMyNumber2()));
		System.out.println("myNumber1 % myNumber2 = " + (operator.getMyNumber1() % operator.getMyNumber2()));
		System.out.println("by. " + naming.getName());
		
		scanner.close();
	}
}
