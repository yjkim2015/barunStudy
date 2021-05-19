package video.study_02;


/*
 * 업캐스팅 다운캐스팅을 하기 위해서는 선언된 데이터 타입의 정보를, 구현되는 실제데이터가 정보를 다들고 있어야한다.
 * ex) Parent parent = new Parent();
 * Parent타입으로 선언된 변수 parent에 오른쪽에 구현된 인스턴스가 Parent타입의 정보를 모두 가지고 있기에 오류가 나지않음.
 */

class Parent{

}
class Child extends Parent{
	
}

public class UpDownCasting {

	public static void main(String[] args) {
		
		// 구현되는 인스턴스가 Parent타입의 정보를 다들고 있기에 오류가 나지않음
		Parent parent = new Parent();
		
		// 구현되는 인스턴스가 Parent를 상속받아 정보를 다들고 있기에 오류가 나지않음
		// 앞부분에 (Parent)형변환 생략이 가능하다. 
		Parent parent2 = new Child(); 	// -> 업캐스팅
		
		
		// 구현되는 인스턴스가 Child타입의 정보를 다들고 있지 않기에 컴파일 오류발생
//		Child child = new Parent();
		
		// 형변환을 시켜준다면 컴파일 오류는 사라지지만 런타임 오류가 발생한다.
		Child child2 = (Child)new Parent();
		
		/* 실행 후 JVM이 인스턴스를 Child로 형변환을 하려고 하지만 Child의 데이터가 무엇인지 모르기 때문에 에러가 발생한다.
		 	속성, 성질이 정해져있지않은 데이터는 JVM이 알수가없다.*/
		
		
		// 다운 캐스팅
		// parent2는 월래 Child타입이였기 때문에 형변환에 문제가없다.
		Child child3 = (Child)parent2;
		
	}

}
