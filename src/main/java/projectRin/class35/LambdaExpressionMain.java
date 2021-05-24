package projectRin.class35;

/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 35강 람다식
 * @author imj10
 *
 */
// @FunctionalInterface: 하나의 메소드만 생성 가능. 람다식으로 구현하기 위한 인터페이스는 하나의 추상메소드만 가지고 있어야 함
@FunctionalInterface
interface Math {
    public int calc(int first, int second);
    
//    public int calc2(int first, int second); // 메소드가 2개이상일 경우 컴파일 에러 발생
}

public class LambdaExpressionMain {
	static String str1 = "";

	public static void main(String[] args) {
		/*
		 * 1. 형식
		 * (타입 매개변수, ...) -> { 실행문;... }
		 */
		Math anonymous = new Math() {
			@Override
			public int calc(int first, int second) {
				return first + second;
			}
		};
		System.out.println(anonymous);
		
		// 함수형 인터페이스 람다
		Math plusLambda = (first, second) -> first + second;
		System.out.println(plusLambda.calc(1, 2));
		
		Math minusLambda = (first, second) -> first - second;
		System.out.println(minusLambda.calc(1, 2));
		
		String str = "";
		
		Math sum1 = (int first, int second) -> {return first+second;}; // return을 사용할 경우 중괄호 생략 불가능
		Math sum2 = (first, second) -> first+second; // 타입생략 가능(오버로딩해서 여러 메소드가 있을 경우 생략 불가능), 실행문이 한개일 경우 중괄호 생략 가능, type이 하나일 경우 타입의 괄호도 생략 가능
//		Math sum3 = (int first, second) -> first+second; // 타입을 한쪽만 생략할 수는 없음
		Math sum4 = (first, second) -> {
//			str = "hello";
			str1 = "hello"; // static은 가능
			
			System.out.println("first: " + first);
			System.out.println("second: " + second);
			
			return first+second;
		};
	}
}
