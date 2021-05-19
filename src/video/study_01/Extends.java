package video.study_01;

/*
 * Extends
 * 1. 자식 클래스가 부모 클래스로부터 상속을 받게되면 부모 클래스의 필드와 메서드를 물려받게된다. private는 상속 불가능
 * 2. 자식클래스는 상속받는건 하나만 가능하다.
 * 3. 부모클랙스는 여러 자식클래스에게 상속이 가능하다.
 * 4. 부모클래스의 메소드를 재정의하여 사용할수있다.
 * 
 */
public class Extends {

	public static void main(String[] args) {
		
		Son son = new Son();
		Mother mother = new Mother();
		
		// 오버라이드 한 메소드값 출력
		son.motherMethod(); 
		
		// 부모클래스의 변수 사용가능
		System.out.println(son.name);
		
		//자식이 오버라이드 해도 부모 메소드는 변하지 않는다.
		mother.motherMethod();
		
	}

}

class Mother{
	String name = "mother";
	void motherMethod() {
		System.out.println("부모 메소드");
	}
}

// 부모 클래스의 모든 메소드를 사용할수있다.
class Son extends Mother{
	
	@Override
	void motherMethod() {
		
		// Super는 상속받은 상위클래스로 접근이 가능하다.
		super.name = "부모클래스 변수 접근가능";
		
		System.out.println("오버라이드 한 메소드");
	}
	
}