package projectRin.class19;
/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 19강 인터페이스
 * @author imj10
 *
 */
public class InterfaceMain {
	public static void main(String[] args) {
		Calculator calc1 = new Calculator();
		System.out.println(calc1.name);
		calc1.info();
		calc1.getName();
	}
}
