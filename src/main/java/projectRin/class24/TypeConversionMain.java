package projectRin.class24;
/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 24강 형변환
 * @author imj10
 *
 */
public class TypeConversionMain {
	public static void main(String[] args) {
		// 타입을 다른 타입으로 변경
		// byte -> short -> int -> long -> float -> double
		
		// int <-> double, float, short
		short s1 = 123;
		double d1 = 1.23;
		float f1 = 2.99f;
		int num1 = 1;
		long l1 = 12345678912L;
		
		//Type mismatch: cannot convert from double to int
		int result1 = (int) d1;
		double result2 = (double)num1;
		double result3 = (int)d1;
		double result4 = (int)f1;
		int result5 = s1; // 자동 형변환
		
		// byte가 초과되었을 경우
		System.out.println((int)l1); //-539222976
		
		// String 형변환
		String str1 = "0.123";
		String str2 = "3";
		
		double d2 = Double.parseDouble(str1);
		float f2 = Float.parseFloat(str1);
		int num2 = Integer.parseInt(str2);
		
		String str3 = String.valueOf(num2);
		String str4 = Integer.toString(num2);
		
		
		

	}
}
