package video.study_02;

/*
 * 다형성이란?
 * - 하나의 요소가 다양한 자료형에 속할수있는것을 말한다. 
 * 
 * 장점
 * - 기능을 확장하거나 객체를 변경해야할 때 타입변경없이 객체 주입만으로 수정이 가능하다.
 */

class Animal{
	void sound() {
		System.out.println("Animal sound");
	}
}

class Dog extends Animal {
	public String name = "dogdog";
	void sound() {
		System.out.println("Dog sound");
	}
	void walk() {
		System.out.println("Dog walk");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		
		// Animal 타입.  Dog객체로 구현
		Animal animal = new Dog();
		
		// Dog의 메소드가 출력된다.
		animal.sound();
		
		// Animal객체에 없는 메소드는 사용 불가능
//		animal.walk();
		
		// 변수도 사용 불가능
//		animal.name;
		
		/* --> Animal 타입에 정의된 메소드만 사용이 가능하지만
				구현된 객체가 오버라이딩했을 경우에는 구현된 객체의 메소드가 호출된다. */
		
		
		
		// 강제형변환. 컴파일 에러는 나지않는다.
		Dog dog = (Dog) new Animal();
		
		// 메소드 사용시 에러 발생
		dog.sound();
		
		// 형변환 시에는 instanceof를 사용하여 타입을 확인해 주는것이 좋다.
		
	}

}
