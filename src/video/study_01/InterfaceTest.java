package video.study_01;

/*
 * Interface -> 모든 기능을 추상화로 정의만 하고 구현은 하지 않은것을 의미한다.
 * 
 * 1. 인터페이스 내부에 존재하는 메소드는 public abstract로 선언된다. 하지만 생략이 가능하다.
 * 2. 인터페이스 내부에 존재하는 변수는 public static final로 선언된다. 하지만 생략이 가능하다.
 * 3. 인터페이스는 다중 상속이 가능하다.
 * 
 * Interface를 사용하는 이유
 * 1. 개발자들끼리 각자의 부분을 만들때까지 기다리지않고 규약만 정해두어
 * 		각자 맡은 부분만 나눠서 작동된 코드를 컴파일 할 수 있다. -> 개발시간단축
 * 2. 다형성을 사용할 수 있다.
 */
public class InterfaceTest {

	public static void main(String[] args) {
		
		Pencil pencil = new Pencil();
		Ballpoint ballpoint = new Ballpoint();

		//연필과 볼펜은 둘다 같은 기능을 구현했지만 서로 다른 결과를 출력한다. 
		pencil.write(); 
		ballpoint.write();
		
	}

}

class Pencil implements Frindle {

	@Override
	public void write() {
		System.out.println("연필로 씁니다.");
	}
	
}

class Ballpoint implements Frindle {

	@Override
	public void write() {
		System.out.println("볼펜으로 씁니다.");
	}
	
}