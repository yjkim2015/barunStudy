package projectRin.class34;
/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 34강 익명 클래스
 * @author imj10
 *
 */
class Person {
	private int age = 10;
	private String name = "Lee";
	
	public Person() {}
	
	public Person(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

interface AnonymousInterface {
	String str = "hello";
	
	void getStr();
}

public class AnonymousClassMain {
	public static void main(String[] args) {
		/*
		 * 1. 정의
		 * 클래스/인스턴스의 선언과 객체의 생성을 동시에 하기 때문에 단 한번만 사용될 수 있고 오직 하나의 객체만을 생성할 수 있는 일회용 클래스
		 * 2. 형식
		 * 부모클래스 인스턴스 = new 부모클래스() { ... };
		 */
		Person person = new Person() {
			public int age = 100;
			
			// 생성자 작성 불가 > 만들어진 클래스의 생성자와 동일하게 객체 생성
//			public Anonymous(int num) {
//				this.num = num;
//			}
			
			@Override
			public int getAge() {
				display();                                                                        
				getName();
				return this.age;
			}
			
			public void display() {
				System.out.println("hello world");
			}
		};
		
		System.out.println("age: " + person.getAge());
		
		// 익명 클래스에서 생성된 메소드나 필드는 익명클래스 밖에서 접근 불가
//		t1.display();
		
		
		// 인터페이스로도 단일 객체 생성 가능
		AnonymousInterface obj = new AnonymousInterface() {
			@Override
			public void getStr() {
				System.out.println("Override된 str: " + str);
			}
		};
		
		obj.getStr();
	}
}
