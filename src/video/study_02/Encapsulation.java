package video.study_02;

/*
 * 캡슐화
 * - 객체의 정보들을 외부에서 직접적으로 볼 수 없도록 감추는것을 의미한다.
 * - 외부에 영향을 주지않고 객체 내부의 구현을 변경할 수 있다.
 * 
 * - 캡슐화 하는 이유는 외부의 잘못된 사용으로 인해 객체가 손상되지 않기위함이다.
 */
class Brid{
	// private로 외부에서 접근 불가능
	private String name;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		Brid brid = new Brid();
		// 변수로 직접 접근이 불가능
//		brid.name = "BridName";
		
		// 메소드를 통하여 간접적으로 접근
		brid.setName("BridName");
		System.out.println(brid.getName());
	}

}
