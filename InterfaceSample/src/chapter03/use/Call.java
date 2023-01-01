package chapter03.use;

import chapter03.used.Calculator;
//import chapter03.used.AddCalc;
import chapter03.used.SubCalc;

/**
 * 인터페이스 의존 확인
 * - 의존성 주입으로 인해 AddCalc 클래스에서 SubCalc 클래스 변경이 쉽게 이루어짐
 */
public class Call {
	public static void main(String[] args) {
//		Calculator calculator = new AddCalc();
		Calculator calculator = new SubCalc();
		Integer result = calculator.calc(10, 5);
		System.out.println("계산 결과는 (" + result + ") 입니다.");
	}
}
