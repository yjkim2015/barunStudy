package video.study_01;

/*
 * This 는 자기 자신을 나타낸다.
 * 
 *  1. 전역변수와 생성사 및 메소드의 매개변수가 이름이 같을 경우 사용
 *  2. 오버로딩된 다른 생성자 호출
 *  3. 객체 자신의 참조값을 반환할때 사용
 */
public class This {
	public static void main(String[] args) {
		Dog dog = new Dog("HeeSeong");
	}
}

class Dog {
	String name;
	int age;
	
	//다른 생성자 호출 가능
	public Dog(String name) {
		this(name, 15);
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 자기자신 반환
	public Dog getDogInstance() {
		return this;
	}
}