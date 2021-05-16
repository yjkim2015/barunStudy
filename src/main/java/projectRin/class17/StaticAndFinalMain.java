package projectRin.class17;
/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 17강 static과 final
 * @author imj10
 *
 */
public class StaticAndFinalMain {
	public static void main(String[] args) {
		// static 변수는 객체화를 시키지 않아도 사용가능
		System.out.println(Example.name);
		
		// static 메소드 사용
		Example.showName();
		
		
		final int ID = 1;
		// The final local variable ID cannot be assigned. It must be blank and not using a compound assignment
//		ID = 3; 
		
		System.out.println(Math.PI); // Math.PI: static 이면서 final 값
		float i = 0;
		
		i = 3.14f;
	}
}
