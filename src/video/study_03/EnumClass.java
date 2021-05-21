package video.study_03;

/*
 * Enum
 * - 상수를 클래스처럼 보이게 할수있다.
 * - 서로 관련 있는 상수들을 모아 대표할수 있는 이름으로 타입으로 정의 한다.
 * 
 * - 선언된 순서에 따라 0부터 index값을 가진다.
 * - 모두 대문자로 선언한다.
 * - 열거형 변수들을 선언한 후에 세미콜론은 적지 않는다.
 * - 상수와 특정 값을 연결시킬경우에는 세미콜론을 적는다.
 */

enum Menu {
	SEARCH
	, WRITE
	, EDIT
	, REMOVE
}

enum Constant {
	Gravity(9.8)
	, PI(3.14);
	
	private final double value;
    
	Constant(double value){
        this.value = value;
    }
	
    // 상수와 특정값을 연결 시켜놓으려면 리턴 할 수 있는 메소드가 선언 되어 있어야한다.
    public double getValue(){
        return value;
    }
}

public class EnumClass {

	public static void main(String[] args) {
		
		// values()를 사용하면 상수값을 전부 가져온다.
		for ( Menu type : Menu.values() ) {
			System.out.println("Menu Type : " + type);
		}
		
		// 상수와 연결되어있는 값을 가져온다.
		System.out.println(Constant.Gravity.getValue());
		System.out.println(Constant.PI.getValue());
		
	}

}
