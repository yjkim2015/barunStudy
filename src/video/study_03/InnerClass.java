package video.study_03;


/*
 * 내부 클래스는 클래스 내에 선언된다는 점을 제외하고는 일반 클래스와 다르지 않다.
 * 
 * AWT, Swing 같은 GUI app의 이벤트 처리 외에는 잘 사용되지 않는다.
 * 
 * 내부 클래스 장점
 * - 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근이 가능하다.
 * - 코드의 복잡성을 줄일 수 있다.

 */

class A {
	int num = 0;
	
	// 멤머 클래스
	// A클래스 내부에 선언
	class B {
		public B() {
			// A 클래스의 변수에 접근이 가능하다.
			num += 1;
		}
	}
	
	void methodA() {
		String str = "str";
		System.out.println(str);
		
		// 로컬 클래스
		class C {
			public C() {
				// 로컬클래스 라도 A클래스의 변수에 접근이 가능하다.
				num += 1;
			}
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		A a = new A();
		a.methodA();
	}

}
