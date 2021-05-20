package video.study_03;

class Person{
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class PassByValue {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("HeeSeong");
		
		// person의 name 자체가 들어가는게 아니라 name의 값을 복사해서 복사된값만 넘겨준다.
		showName(person.getName());
		
		// 객체의 주소를 넘겨준다.
		showName2(person);
	}
	
	static void showName(String name) {
		// 파라미터로 들어온 값을 변경한다해도 실제 person객체의 이름은 변하지않는다.
		name = "WooSeong";
		System.out.println("Name : " + name);
	}
	
	static void showName2(Person person) {
		// 객체의 주소가 넘어온것이기 때문에 값을 바꾸게되면 person의 이름값도 변하게 된다.
		person.setName("WooSeong");
		System.out.println("Name : " + person.getName());
	}
	
}