package projectRin.class29;

public abstract class Animal {
	// 필드
	public String kind = "Animal";
	
	// 생성자
	public Animal() {
		System.out.println(kind);
	}
	
	// 일반 메소드
	public void eat() {
		System.out.println("물을 먹음");
		cry(); // 일반 메소드안에 추상메소드 사용 가능
	}
	
	// 일반 메소드는 내용을 써야함
//	public void eat2();
	
	// 추상메소드
	// abstract 반환타입 메소드이름();
	//자식클래스는 추상메소드를 무조건 오버라이드해야함
	public abstract void cry();
	
	// 추상 메소드는 메소드의 내용을 쓸 수 없음. 구현만 가능. 
	//Abstract methods do not specify a body
//	public abstract void test() {
//		System.out.println("test");
//	};
	
}
