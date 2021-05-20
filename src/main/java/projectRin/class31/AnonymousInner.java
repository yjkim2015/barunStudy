package projectRin.class31;

//4. 익명 중첩 클래스 (Anonymous inner class)
public class AnonymousInner {
	int num = 11;
	
	public void getName() {
		System.out.println("AnonymousInner");
	}
	
	public void getNum() {
		System.out.println(num);
		secret();
	}
	
	private void secret() {
		System.out.println("Private Method");
	}
	
}
