package projectRin.class15;

public class User {
	String userName;
	String userId;
	
	void setUserId(String userName) {
		userName = userName;
	}
	
	public String getUserId() {
		return userId;
	}
	
	void setUserName(String userName) {
		// this.userName: User 클래스의 userName
		// userName: 매개변수로 가져온 userName
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
