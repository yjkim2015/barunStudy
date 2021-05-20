package projectRin.class31;

public class Outer {
	private int x = 1;
	private static int t = 50;
	
	public void minus() {
		Outer.Inner innerClass = this.new Inner();
		
		// 내부 클래스 변수 호출 > 내부클래스.변수명
		System.out.println("x-y: " + (x-innerClass.y));
//		System.out.println(y);
		
	}
	
	// 1. 중첩 클래스(Inner class / Nested class)
	class Inner {
		private int y = 2;
		
		public void sum() {
			// 외부 클래스의 일반 변수는 그냥 호출 가능
			System.out.println("x+y: " + (x+y));
//			System.out.println(OuterClass.x);
		}
		
		public void multi() {
			//클래스명.스테틱변수명
			System.out.println("t*y: " +Outer.t * this.y);
			System.out.println("t*y: " + t * y);
		}
	}
	
	// 2. 정적 중첩 클래스(Static inner class)
	static class StaticInner {
		private int y = 20;
		private static int s = 200;
		
		public void dis() {
			// 정적 중첩 클래스에서는 Outer클래스의 static 변수만 사용 가능
//			System.out.println(x); // 에러 메세지: Cannot make a static reference to the non-static field x
			System.out.println("t: " + t);
			System.out.println("y: " + y);
			System.out.println("s: " + s);
		}
	}
}
