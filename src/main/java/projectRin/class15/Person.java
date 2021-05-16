package projectRin.class15;

public class Person {
	public String name;
	public int age;
	public String bloodType;
	private static Person person;
	
	public Person() {
		this(null,0,"O");
	}
	public Person(String name, int age) {
		this(name, age, "O");
	}
	
	public Person(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}

	public Person getPerSonInstance() {
		if ( person == null ) {
			person = new Person();
		}
		return person;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", bloodType=" + bloodType + "]";
	}
	
	
//	public static Person staticPerson(String name) {
//		//Cannot use this in a static context
//		return this.name = name;
//	}
}
