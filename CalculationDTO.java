package day04;

class CalculationDTO {
	int number1;
	int number2;
	int result;
	String opcode;

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	void setNumber1(int number1) {
		this.number1 = number1;
	}

	int getNumber1() {
		return number1;
	}

	void setNumber2(int number2) {
		this.number2 = number2;
	}

	int getNumber2() {
		return number2;
	}

	public String getOpcode() {
		return opcode;
	}

	public void setOpcode(String opcode) {
		this.opcode = opcode;
	}
}
