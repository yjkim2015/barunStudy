package video.study_02;

class NumberClass{
	static int intNum = 5;
	static int intNum2 = ++intNum;
	int intNum3;
	
	// static 메소드 이지만 intNum3이 instance변수 이기때문에 에러발생
	static void showNumber() {
//		System.out.println(intNum3);
	}
}

public class StaticAndInstance {

	public static void main(String[] args) {
		
		// 둘다 6 출력
		// static변수라서 컴파일하는순간 메모리에 올라간다.
		System.out.println(NumberClass.intNum);
		System.out.println(NumberClass.intNum2);
		
		
		// 값이 없다고 0이 출력되는것이 아닌 할당된 공간자체가 없기때문에 intNum3는 사용할수없다.
		// 사용하려면 객체화(new) 시켜서 사용해야함.
//		System.out.println(NumberClass.intNum3);
		
		
		/*
		 * static -> 컴파일시 메모리에 올라감
		 * instance -> 객체화 시켜야 메모리에 올라감
		 * 
		 * static은 instance와 달리 Heap영역에 존재 하지 않기때문에 가비지컬렉터가 관여하지않는다.
		 * static을 많이 사용하는건 안좋으니 instance로 선언해서 사용하는것이 좋다.
		 */
		
	}
	

}
