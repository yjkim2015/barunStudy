package common;

public class BoardVo {
	private String title;
	private String content;
	private String register;
	
	public BoardVo() {
	}
	
	public BoardVo(String title, String content, String register) {
		super();
		this.title = title;
		this.content = content;
		this.register = register;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getRegister() {
		return register;
	}
	
	public void setRegister(String register) {
		this.register = register;
	}
	
	
}
