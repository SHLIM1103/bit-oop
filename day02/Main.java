package day02;

import java.util.Scanner;
import day02.BMI;

class Main {
	static final int SIZE = 3 ;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeBook grade = new GradeBook();
		BMI bmi = new BMI();
		
		System.out.println("-----GradeBook-----");
		
		System.out.print("학번: ");
		int id = scanner.nextInt();
		grade.setId(id);
		
		System.out.print("이름: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		grade.setName(name);
		
		System.out.print("국어점수: ");
		int korean = scanner.nextInt();
		grade.setKorean(korean);
		
		System.out.print("영어점수: ");
		int english = scanner.nextInt();
		grade.setEnglish(english);
		
		System.out.print("수학점수: ");
		int math = scanner.nextInt();
		grade.setMath(math);
		
		int sum = grade.getKorean() + grade.getEnglish() + grade.getMath() ;
		double ave = sum / (double)SIZE ;
		
		System.out.printf("학번: %d 이름: %s%n", grade.getId(), grade.getName());
		System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점%n", grade.getKorean(), grade.getEnglish(), grade.getMath());
		System.out.printf("총점: %03d점 평균: %.2f점%n", sum, ave);
		
		System.out.println();
		System.out.println("-----BMI-----");
		
		System.out.print("몸무게(kg): ");
		double weight = scanner.nextDouble();
		bmi.setWeight(weight);
		
		System.out.print("키(m): ");
		double height = scanner.nextDouble();
		bmi.setHeight(height);
		
		double result = bmi.getWeight() / bmi.getHeight() / bmi.getHeight() ;
		System.out.printf("당신의 BMI는 %.2f 입니다.%n", result);
		
		scanner.close();
	}
}
