package video.study_03;

/*
 * 추상클래스
 * - 추상메소드를 선언하여서 자식클래스가 상속받아 메소드의 완성을 유도하는 클래스이다.
 * - 미 구현 되어있기 때문에 인스턴스화 시킬수 없다.
 * - abstract 예약어를 사용하여 구현한다.
 * - is a 관계에서 사용한다.
 */

abstract class Animal{
	abstract void move();
	
	public Animal() {
		
	}
	//abstract를 생략하면 오류 발생
//	void moveSound();

}

class Dog extends Animal{
	@Override
	void move() {
		System.out.println("run");
	}
}
class Bird extends Animal{
	@Override
	void move() {
		System.out.println("fly");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.move();
		
		Bird bird = new Bird();
		bird.move();
		
		// 미구현 되어 있기 때문에 생성 불가능
//		Animal animal1 = new Animal();
		
		// 익명 클래스로 Animal의 자식클래스로 만들면 생성이 가능하다.
		Animal animal2 = new Animal() {
			void move() {
				System.out.println("Abstract Class");
			}
		};
		animal2.move();
		
	}

}
