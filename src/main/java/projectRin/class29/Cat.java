package projectRin.class29;

public class Cat extends Animal {
	public int age;

	public Cat(int age) {
		super();
		this.age = age;
		System.out.println(this.age + "살");
	}
	
	@Override
	public void eat() {
		System.out.println("생선을 먹음");
	}
	
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	
}
