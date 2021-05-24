package projectRin.class31;
/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 31강 내부 클래스
 * @author imj10
 *
 */
public class InnerClassMain {
	public static void main(String[] args) {
		
		// 1. 중첩 클래스 객체화
		Outer outer = new Outer(); // Outer 클래스 객체화
		Outer.Inner inner = new Outer().new Inner(); // inner 클래스 객체화
		
		inner.sum();
		outer.minus();
		inner.multi();
		
		// 2. 정적 중첩 클래스 객체화
		Outer.StaticInner staticInner = new Outer.StaticInner();
//		Outer.StaticInner staticInner1 = outer.StaticInner();
		
		staticInner.dis();
		
		
		// 3. 지역 중첩 클래스(Local inner class): 메소드 안에서 생성되는 클래스
		int a = 3;

		class LocalInner {
			int b = 6;
			
			public void sum() {
				System.out.println("a+b: " + (a + b));
			}
		}
		
		LocalInner localInner = new LocalInner();
		System.out.println("b: " + localInner.b);
		localInner.sum();
		

		//4. 익명 중첩 클래스 (Anonymous inner class): 인터페이스나 클래스의 메소드를 오버라이드 할 경우 사용
		AnonymousInner anonymousInner = new AnonymousInner() {
			// 오버라이드 가능
			@Override
			public void getName() { 
				System.out.println("Anonymous Inner Class");
				getNum(); // 익명 중첩 클래스 안에서 생성한 메소드 사용 가능
				
			}
		
			// 사용할 경우 오버라이드 되어 사용됨
//			@Override
//			public void getNum() {
//				System.out.println(num + 100000);
//			}
		};
		
		anonymousInner.getName();
		anonymousInner.getNum();
		
	}
}
