package day04;

public class CalculationService {
	int add(CalculationDTO cal) {
		return cal.getNumber1() + cal.getNumber2();
	}
	
	int minus(CalculationDTO cal) {
		return cal.getNumber1() - cal.getNumber2();
	}
	
	int multi(CalculationDTO cal) {
		return cal.getNumber1() * cal.getNumber2();
	}
	
	int divide(CalculationDTO cal) {
		return cal.getNumber1() / cal.getNumber2();
	}
	
	int module(CalculationDTO cal) {
		return cal.getNumber1() % cal.getNumber2();
	}
}
