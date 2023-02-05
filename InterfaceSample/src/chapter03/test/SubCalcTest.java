package chapter03.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import chapter03.used.AddCalc;
import chapter03.used.Calculator;
import chapter03.used.SubCalc;

class SubCalcTest {
	
	// assertEquals - 두개의 매개변수가 같은지 확인합니다.
	// assertNull - 매개변수 값이 null인지 확인합니다.
	// assertNotNull - 매개변수 값이 null이 아닌지 확인합니다.
	// assertTrue - 매개변수 상태가 ture 인지 확인합니다.
	// assertFalse - 매개변수 상태가 false 인지 확인합니다.
	// assertArrayEquals - 두개의 배열이 같은지 확인합니다.
	
	Calculator subCalc = new SubCalc();
	Calculator addCalc = new AddCalc();

	@Test
	public void testSub() {
		assertEquals(5, subCalc.calc(10, 5));
	}
	
	@Test
	public void testSum() {
		assertEquals(20, addCalc.calc(10, 10));
	}

}
