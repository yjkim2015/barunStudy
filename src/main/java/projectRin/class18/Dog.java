package projectRin.class18;

public class Dog extends Animal {
	private String species = "dog";
	public String food;

	public Dog() {
	}
	
	public Dog(String name, String food) {
		super(name);
		//this.name = name;
		this.food = food;
	}
	
	void superTest() {
		System.out.println("this: " + this.species);
		System.out.println("super: " + super.species);
	}
}
