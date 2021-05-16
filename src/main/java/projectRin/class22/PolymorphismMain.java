package projectRin.class22;

public class PolymorphismMain {
	public static void main(String[] args) {
		
		// 참조 변수의 다형성
		Parent parent1 = new Parent();
		Child child1 = new Child();
		Parent child2 = new Child(); // 부모 클래스 타입의 참조 변수로도 자식 클래스 타입의 인스턴스를 참조
		
//		Child cp = new Parent();
		
		// 참조 변수의 타입 변환
		Parent parent02 = null;
		Child child02 = new Child();
		Parent parent03 = new Parent();
		Child child03 = null;
		Child child04 = null;
		
		parent02 = (Parent)child02;
		parent02 = child02; // 타입 변환 생략 가능
		
		child04 = (Child) child2; // 타입 변환을 생략할 수 없음.
		
		// instanceof 연산자
		Parent p3 = new Parent();
		Child c3 = new Child();
		
		System.out.println(p3 instanceof Object); // true
		System.out.println(p3 instanceof Parent); // true
		System.out.println(p3 instanceof Child); // false
		
		System.out.println(c3 instanceof Parent); // true
		System.out.println(c3 instanceof Child); // true
		
	}
}
