package video.study_02;

public class Casting {

	public static void main(String[] args) {
		
		short shortNum = 32767; 			// 2Byte
		int intNum = 2147483647;			// 4Byte
		long longNum = 9223372036854775807L; // 8Byte
		
		// 상위타입으로 형변환 (괄호생략가능)
		int intNum2 = (int)shortNum;
		
		// 하위타입으로 형변환할때는 값이 짤리거나 변경될수 있으므로 조심해야한다.
		short shortNum2 = (short)intNum;
		short shortNum3 = (short)longNum;
		
		// 2의보수로 인해 이상한값이 출력 된다.
		System.out.println("shortNum2 : " + shortNum2);
		System.out.println("shortNum3 : " + shortNum3);
		
		
		
		// int -> String 형변환 2가지 방법
		String str  = String.valueOf(intNum);
		String str2 = Integer.toString(intNum);
		
		System.out.println("str : " + str);
		System.out.println("str2 : " + str2);
		
		// String -> int 형변환
		String str3 = "10";
		String str4 = "one";
		
		// 형변환 가능
		int intNum3 = Integer.valueOf(str3);
		intNum3 = Integer.parseInt(str3);
		
		// 형변환 에러
		int intNum4 = Integer.valueOf(str4);
		
		// 기본적으로 서로 관련없는 데이터 끼리는 형변환이 되지않는다.
		// ex) int a = (int)true
		
	}

}
