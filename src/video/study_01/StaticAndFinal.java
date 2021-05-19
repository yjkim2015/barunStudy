package video.study_01;

/*
 * 
 * Static의 특징
 * 1. 주로 클래스들이 할당한다.
 * 2. 가비지 콜렉터가 관여하지않는다.
 * 3. 모든 객체가 메모리를 공유한다.
 * 4. static으로 생성된 정적멤버들은 Heap영역이 아니고 static영역에 할당된다.
 * 5. 가비지콜렉터각 관여하지 않으므로, 무분별하게 남발하면 시스템 성능에 악영향을 줄 수 있다.
 *  
 *  
 *  Final
 *  1. final이 붙으면 오로지 한 번만 할당될수 있음을 의미한다.
 *		- final변수    -> 값을 한번만 할당 가능하며 그 이후로는 값의 변경이 불가능하다.
 *		- final메소드 -> 해당 메소드를 오버라이딩은 불가능하며, 숨길수도없다.
 *		- final클래스 -> 해당 클래스는 상속할 수 없다. 상속 계층구조에서 마지막이라는 의미.
 *	2. final 멤버 변수는 무조건 상수가 아니다.
 *		- final은 상수라기 보다는 '한번만 초기화 가능하다'는 뜻이기 때문
 *
 */
public class StaticAndFinal {

	public static void main(String[] args) {
		
		// 객체를 생성하지 않아도 호출이 가능하다. 메모리에 이미 올라가 있기 때문
		User.showName();
		
		User user1 = new User();
		User user2 = new User();
		
		user1.age++;
		user1.age++;
		user1.age++;
		
		// 다른 객체 이지만 3이 출력된다.
		// static으로 선언된 변수는 같은 객체끼리 공유 하기 때문
		System.out.println(user2.age);
		
	}

}

class User {
	
	// static 변수
	static String name = "HEESEONG";
	
	static int age = 0;
	
	// static 메소드
	static void showName() {
		System.out.println(name);
	}
	
}