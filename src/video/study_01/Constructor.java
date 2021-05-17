package video.study_01;

/*
 * 생성자
 * 1. 생성자는 객체를 생성할 때 객체의 초기화를 담당한다.
 * 2. 지역변수의 초기화 작업에 주로 사용되고, 인스턴스 생성시에 실행되어야할 작업을 위해서도 사용된다.
 * 3. 생성자는 클래스 이름과 같아야한다.
 * 4. 오버로딩이 가능하다.
 * 5. 반환값이 없다.
 * 6. 반환값이 없으므로 void는 생략한다.
 * 7. 생성자를 선언하지않아도 기본생성자가 생성된다.
 */
public class Constructor {

	public static void main(String[] args) {
		Cat cat = new Cat("HEHE");
		Cat cat2 = new Cat("HEHE", 12);
	}

}

class Cat {
	String name;
	int age;
	
	// 여러개 생성자 가능
	public Cat(String name) {
		this.name = name;
	}
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
