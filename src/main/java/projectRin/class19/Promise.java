package projectRin.class19;

public interface Promise {
	// 상수: 인터페이스에서 값을 정해줌(절대적)
	public String name = "promise";
	
	// 추상 메소드: 가이드 > 오버라이딩해서 재구현(강제적)
	public void info();
	
	// default 메소드: 기본적으로 제공 > 각자 구현 가능(선택적)
	default void getName() {
		System.out.println(name);
	}
	
}
