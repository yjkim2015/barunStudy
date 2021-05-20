package projectRin.class30;
/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 30강 Enum
 * @author imj10
 *
 */
public class EnumClassMain {
	public static void main(String[] args) {
		// 호출
		// Enum클래스명.상수명
		System.out.println(Fruit.WATERMELON);
		
		
		// values() 메소드
		//해당 열거체의 모든 상수를 저장한 배열을 생성하여 반환
		//자바의 모든 열거체에 컴파일러가 자동으로 추가해주는 메소드
		Fruit[] arr = Fruit.values();
        for (Fruit one : arr) {
            System.out.println(one);
        }
        
        // valueOf() 메소드
        // 전달된 문자열과 일치하는 해당 열거체의 상수 반환
        Fruit fruit = Fruit.valueOf("APPLE");
        System.out.println(fruit);
        
        // ordinal() 메소드
        // 열거체 정의에서 정의된 순서(0부터 시작)를 반환
        int index = Color.RED.ordinal();
        System.out.println(index); // 열거체 상수가 정의된 순서이므로 상숫값 1이 아닌 0이 반환됨.
        System.out.println(Color.RED.getValue()); // 지정해둔 상수값 호출 방법
        
        // name() 메소드
        String name = Fruit.APPLE.name();
        System.out.println(name);
        
	}
}
