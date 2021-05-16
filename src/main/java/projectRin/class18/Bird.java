package projectRin.class18;

public class Bird extends Animal {
	// 상속은 한 부모한테서만 받을 수 있음, 부모가 여러 자식에게 상속 가능
	
	// overrides projectRin.class18.Animal.move
	@Override
	void move() {
		System.out.println("Bird is moving");
	}
}
