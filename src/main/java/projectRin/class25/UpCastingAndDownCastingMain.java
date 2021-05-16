package projectRin.class25;
/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 25강 Up Casting과 Down Casting
 * @author imj10
 *
 */
public class UpCastingAndDownCastingMain {
	public static void main(String[] args) {
		Person person = new Person();
		Child child = new Child();
		
		// UpCasting
		Person person1 = (Person) child;
		Person person2 = child; // 자동 형변환. () 생략가능
		person1.info();
		
		// DownCasting
		Child child1 = (Child) person;
		//Type mismatch: cannot convert from Person to Child
//		Child child2 = person; // ()생략 불가능
		
		child1.info();
		child1.childInfo();
		
	}
}
