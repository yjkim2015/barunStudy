package projectRin.class40;

/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 40강 toString
 * @author imj10
 *
 */
class Person extends Object {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Object의 toString
//    public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }
	
	@Override
	public String toString() {
		return super.toString();
	}

}

class PersonA {
	private String name;
	private int age;
	
	public PersonA(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// alt + shift + s + s
	@Override
	public String toString() {
		return "PersonA [name=" + name + ", age=" + age + "]";
	}
}

// Sub Class
class PersonB extends PersonA {
	public PersonB(String name, int age) {
		super(name, age);
	}
}

public class ToStringMain {
	public static void main(String[] args) {
		// toString: 객체를 문자로 표현하는 메소드. 
		
		Person person = new Person("이윤정", 28);
		
		System.out.println(person.toString());
		System.out.println(person); // toString() 생략가능
		// projectRin.class40.Person@2a139a55
		
		PersonA personA= new PersonA("이윤정", 28);
		
		System.out.println(personA);
		System.out.println(personA.toString());
		//PersonA [name=이윤정, age=28]
		
		// 부모 클래스는 toString을 사용하고 상속 받은 클래스는 toString을 사용하지 않았을 경우 부모클래스의 toString 사용
		PersonB personB = new PersonB("이윤정", 28);
		System.out.println(personB);
		//PersonA [name=이윤정, age=28]
	}
}
