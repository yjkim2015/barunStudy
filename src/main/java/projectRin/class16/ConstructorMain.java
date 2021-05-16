package projectRin.class16;
/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 16강 생성자
 * @author imj10
 *
 */
public class ConstructorMain {

	// 생성자(constructor)
	public static void main(String[] args) {
		
		System.out.println("[default 생성자]");
		User user1 = new User();
		
		System.out.println("[다른 생성자 호출]");
		User user2 = new User("yoonjung");
		
		System.out.println("[생성자]");
		User user3 = new User("yoonjung", 100);
		
		System.out.println("[생성자를 이용한 인스턴스 복사]");
		User user4 = new User("test1", 10);
		User user5 = new User(user4);
		System.out.println("변경 전 ");
		System.out.println(user4.toString());
		System.out.println(user5.toString());
		
		// 독립적인 메모리 공간에 존재하는 별도의 인스턴스. user4값 변경되어도 영향은 없음
		user4.setName("testtest");
		System.out.println("변경 후 ");
		System.out.println(user4);
		System.out.println(user5);
		System.out.println(user4.equals(user5));
		
		
	}
}
