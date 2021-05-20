package projectRin.class29;

public class Dog extends Animal {
	public String kind = "개";

	public Dog() {
		System.out.println(kind);
	}
	
	// The type Dog must implement the inherited abstract method Animal.cry()
	// 추상메소드는 무조건 상속 받아야 함
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
}
