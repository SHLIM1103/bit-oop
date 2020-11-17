package day04;

public class CalculationController {
	int execute(CalculationDTO param) {
		CalculationService service = new CalculationService();
		
		int res = 0;
		String op = param.getOpcode();
		if(op.equals("+")) {
			res = service.add(param);
		}else if(op.equals("-")) {
			res = service.minus(param);
		}else if(op.equals("*")) {
			res = service.multi(param);
		}else if(op.equals("/")) {
			res = service.divide(param);
		}else if(op.equals("%")) {
			res = service.module(param);
		}
		
		return res;
	}
}
