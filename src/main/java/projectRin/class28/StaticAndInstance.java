package projectRin.class28;
/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 28강 static과 instance의 차이점
 * @author imj10
 *
 */
public class StaticAndInstance {
	private static String str1 = "static 변수";
	private String str2 = "non-static 변수";
	
	
	public static void main(String[] args) {
		// static
		// class당 하나씩 생성
		Phone.ID = 0;
		System.out.println(Phone.ID);

		Test.changePhoneId();
		System.out.println(Phone.ID);
		
		// instance
		// object당 하나씩 생성
		Laptop laptop = new Laptop();
		laptop.ID = 1;
		System.out.println(laptop.ID);
		
		Laptop laptop2 = new Laptop();
		laptop2.ID = 10;
		System.out.println(laptop2.ID);
		
		Test test = new Test();
		test.changeLaptopId();
		System.out.println(laptop.ID);

		
		// 같은 클래스 변수 호출
		System.out.println(str1);

		StaticAndInstance staticAndInstance1 = new StaticAndInstance();
		System.out.println(staticAndInstance1.str2);
		
		// 같은 클래스 메소드 호출
		staicMehod();

		StaticAndInstance staticAndInstance2 = new StaticAndInstance();
		staticAndInstance2.nonStaicMehod();
		
		// 다른 클래스 메소드 호출
		Phone.number();
		
		Laptop laptop3 = new Laptop();
		laptop3.number();
	}
	
	public static void staicMehod() {
		System.out.println("static 메소드 호출");
	}
	
	public void nonStaicMehod() {
		System.out.println("non-static 메소드 호출");
	}
}
