package projectRin.class39;

/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 39강 super 키워드
 * @author imj10
 *
 */

// Super Class 
class Parent {
	String name = "Lee";
	
	public Parent() {
		System.out.println("부모 생성자 호출");
		System.out.println("name: " + name);
	}
	
	public void home() {
		System.out.println("주소: 서울시 강동구");
	}
}

// Sub Class
class Child extends Parent {
	String name = "Lee YoonJung";
	int age = 28;
	
	void display() {
		System.out.println("display()");
		System.out.println("name: " + name);
		System.out.println("this.name: " + this.name);
		System.out.println("super.name: " + super.name);
		
		super.home();
		home(); // super 생략 가능
	}
	
	public Child() {
		// super 메소드: 부모 클래스의 생성자 호출. 생성자의 가장 위에 위치
		super(); // 부모를 상속 받았으므로 생략해도 자동 호출됨
		System.out.println("자식 생성자 호출");
	}
}

public class SuperMain {
	public static void main(String[] args) {
		// super 키워드: 부모 클래스로부터 상속받은 필드나 메소드를 자식 클래스에서 참조하는데 사용하는 참조 변수
		
		Child child = new Child();
		child.display();
		
	}

}
