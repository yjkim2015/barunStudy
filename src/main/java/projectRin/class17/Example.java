package projectRin.class17;

public class Example {
	// 객체화 시키지 않아도 사용 가능
	static String name  = "yoonjung";
	int age;

	// static 메소드
	static void showName() {
//		System.out.println(age);
		System.out.println(name);
	}
	
	// non-static 메소드
	void getName() {
		System.out.println(name);
	}
}
