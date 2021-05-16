package projectRin.class18;
/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 18강 상속
 * @author imj10
 *
 */
public class InheritanceMain {
	public static void main(String[] args) {
		// Animal: 부모 클래스
		// Bird: 자식 클래스
		
		Animal animal = new Animal();
		animal.move(); // Animal is moving
		
		/*
		 * 1. IS-A 관계
		 */
		Animal dog1 = new Dog();
		dog1.move(); // Animal is moving
		
		/*
		 * 2. 오버라이딩(Overriding)
		 */
		Bird bird1 = new Bird();
		bird1.move(); // Bird is moving
		
		/*
		 * 5. super
		 */
		Dog dog2 = new Dog("쿠키", "고기"); // 쿠키
		dog2.superTest();
		System.out.println(dog2.name + ", " + dog2.food);
	}
}
