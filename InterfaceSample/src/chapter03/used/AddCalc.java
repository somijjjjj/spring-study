package chapter03.used;

/**
 * Calculator 구현 클래스
 * 덧셈 처리
 */
public class AddCalc implements Calculator{
	@Override
	public Integer calc(Integer x, Integer y) {
		return x + y;
	}
}
