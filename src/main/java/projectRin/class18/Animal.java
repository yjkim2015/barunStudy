package projectRin.class18;

public class Animal {
	String name;
	String species = "animal";
	
	public Animal() {
	}

	public Animal(String name) {
		this.name = name;
		System.out.println("[Animal] name: " + name);
	}
	
	void move() {
		System.out.println("Animal is moving");
	}
	
}
