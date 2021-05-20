package projectRin.class29;
/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 29강 추상클래스
 * @author imj10
 *
 */
public class AbstractClassMain {
	public static void main(String[] args) {
		// 추상클래스는 객체화 할 수 없음
//		Animal animal = new Animal(); // 오류 메세지: Cannot instantiate the type Animal
		
		Animal dog = new Dog(); // Animal의 생성자 실행 후 > Dog의 생성자 실행
		dog.eat();
		
		Animal cat = new Cat(3);
		cat.eat(); // Override

		Cat cat1 = new Cat(2);
		
		animalSound(cat); //자동 타입변환
		animalSound(cat1); //자동 타입변환
		
	}
	
	private static void animalSound(Animal animal) {
        animal.cry();
    }

}
