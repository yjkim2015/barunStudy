package projectRin.class38;

/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 38강 가변인자 Varags
 * @author imj10
 *
 */
class Calc {
	// java 1.5 이상
	// varags 메소드: 지정된 자료형의 인자를 0개 이상 받을 수 있음
	public int sum(int... numbers) {
		int result = 0;
		
		for ( int num : numbers ) {
			result += num;
		}
		return result;
	}
	
	// 가변인자는 항상 마지막에 선언
	public void avg(String name, int... numbers) {
		double result = 0;
		
		for ( int num : numbers ) {
			result += num;
		}
		result = result/numbers.length;
		
		System.out.println(name + "의 평균은 " + result + "입니다.");
		
	}
}

public class VaragsMain {
	public static void main(String[] args) {
		Calc calc = new Calc();
		
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println(calc.sum(numbers));
		
		int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(calc.sum(numbers2));
		
		int[] numbers3 = {};
		System.out.println(calc.sum(numbers3));
		
		int[] record = {10, 50, 60};
		calc.avg("이광수", record);
		
		int[] record2 = {100, 90, 88, 85};
		calc.avg("이지은", record2);
	}
}
