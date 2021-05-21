package video.study_03;

/*
 *	익명클래스
 *	- 한번만 사용하기 위해 사용한다.
 * 
 */

abstract class Cat {
	abstract void sound();
}

public class AnonymousClass {

	public static void main(String[] args) {
		
		// 추상클래스는 객체 생성이 불가능하지만 익명클래스를 사용하면 생성이 가능하다.
		
		// Cat타입의 변수에 Cat의 자식클래스가 들어간것이다.
		Cat cat = new Cat() {
			// Override 했다는건 자식클래스이기 때문.
			// 자식클래스를 구현했지만 이름이 없기에 1번만 사용가능하다.
			@Override
			void sound() {
				System.out.println("ccccccc");
			}
		};
		
	}

}
