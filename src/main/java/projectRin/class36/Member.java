package projectRin.class36;

import java.io.Serializable;

public class Member implements Serializable {
	/**
	 * Add generated serial version ID
	 * The serializable class Member does not declare a static final serialVersionUID field of type long
	 */
	// 자바 직렬화 대상 객체는 동일한 serialVersionUID를 가지고 있어야 함
	private static final long serialVersionUID = -8920309821429893577L;
	
	private String id;
	private String name;
	private transient String email; // 직렬화 제외
	
	public Member(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
}