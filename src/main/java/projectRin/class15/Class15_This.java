package projectRin.class15;
/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 15강 this
 * @author imj10
 *
 */
public class Class15_This {
	public static void main(String[] args) {
		/*
		 * 1. 클래스의 속성과 생성자/메소드의 매개변수의 이름이 같은 경우
		 *  this를 붙이지 않을 경우 User 객체 속성 안에는 값이 입력되지 않음
		 */
		
		User user1 = new User();
		user1.setUserId("id");
		user1.setUserName("YoonJung");
		
		System.out.println("this 사용안함 id: " + user1.getUserId());
		System.out.println("this 사용함 name: " + user1.getUserName());
		
		/*
		 * 2. 클래스에 오버로딩된 다른 생성자 호출
		 *  - 같은 클래스에 오버로딩된 다른 생성자 호출시 사용
		 */
		Person person1 = new Person("yoonjung", 28);
		Person person2 = new Person("hyejung", 31, "A");
		
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		
		/*
		 * 3. 객체 자신의 참조값을 전달할 경우
		 */
		System.out.println(person2.getPerSonInstance());
	}
}
