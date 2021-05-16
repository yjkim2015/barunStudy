package projectRin.class16;

public class User {
	String name;
	int level;
	
	// default 생성자
	public User() {
	}
	
	// 생성자 오버로딩
	public User(String name) {
		this(name, 9999);
		System.out.println("다른 생성자 호출");
		// Constructor call must be the first statement in a constructor
		//this("유저이름");
	}
	
	public User(String name, int level) {
		this.name = name;
		this.level = level;
		System.out.println("이름: " + this.name);
		System.out.println("레벨: " + this.level);
	}
	
	public User(User user) {
		this.name = user.name;
		this.level = user.level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	public String toString() {
//		return "User [name=" + name + ", level=" + level + "]";
//	}

	
}
