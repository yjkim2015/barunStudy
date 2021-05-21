package video.study_03;

/*
 * 예외는 error의 일종이며 프로그램이 수행시 또는 컴파일시에 불능상태를 만들어버린다.
 * 
 * 예외처리는 예외가 발생할 것을 대비하여 미리 예측해 이를 소스에서 제어하고 처리하도록 만드는것.
 */

class Calculator{
	int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	double division(int a, int b) {
		double result;
		// 나누기 연산을  하다가 예외가 발생하면 0.0을 반환하도록 설정
		try {
			result = a / b;
		}
		catch ( java.lang.ArithmeticException e ) {
			return 0.0;
		}
		return result;
	}
}
public class Exception {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		// 예외가 나지 않는다.
		int result = calculator.plus(1, 1);
		System.out.println(result);
		
		// 2를 0으로 나누면 예외가 발생한다.
		double result2 = calculator.division(2, 0);
		// 하지만 예외처리를 해놓았음으로 0.0이 출력된다.
		System.out.println(result2);
		
	}

}
