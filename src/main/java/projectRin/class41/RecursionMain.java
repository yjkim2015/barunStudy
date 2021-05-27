package projectRin.class41;

/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 41강 재귀호출 Recursion
 * @author imj10
 *
 */
class Factorial {
	public long factorial(int n) {
		long result = 0;
		
		if ( n <= 1 ) {
			result = 1;
		}
		else {
			result = n * factorial(n-1);
		}
		
		return result;
	}
}
public class RecursionMain {
	public static void main(String[] args) {
		// 재귀호출 Recursion
		// 1) 매소드내에서 자기 자신을 반복적으로 호출
		// 2) 반복문으로 변경 가능 (반복문보다 성능 떨어짐)
		
		Factorial f = new Factorial();
		int n = 10;
		System.out.println(n + "! = "  + f.factorial(n));
		
	}
}
