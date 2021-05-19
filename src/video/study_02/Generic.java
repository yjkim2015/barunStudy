package video.study_02;

import java.util.ArrayList;
import java.util.List;

/*
 * 제네릭
 * - 데이터 타입을 일반화 하는것을 의미한다.
 * - 클래스나 메소드에서 사용할 내부 데이터타입을 컴파일 시에 미리 지정하는 방법이다.
 * 
 * 장점
 * - 잘못된 타입이 사용될 수 있는 문제를 컴파일 과정에서 제거할 수 있기 때문.
 * - 타입을 정해놓으므로 데이터를 찾아올때 타입 변환을 할 필요가없기 때문에 성능이 향상된다.
 * 
 * 
 * <> 괄호 사이에 파라미터를 넣어 사용하며
 * 일반적으로 대문자 알파벳 한글자로 표현한다.
 * <T> -> Type
 * <E> -> Element
 * <K> -> Key
 * <N> -> Number
 * <V> -> Value
 * <R> -> Result
 * 
 */
class GenericTestClass<T>{
	private T anyType;
	public GenericTestClass() {
		
	}
	public GenericTestClass(T anyType) {
		this.anyType = anyType;
	}
}

public class Generic {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("List Data");
		
		// 제네릭을 사용하지 않을경우 형변환이 필요하다.
		String listData = (String) list.get(0);

		
		List<String> list2 = new ArrayList();
		list2.add("List data");
		
		// 제네릭 사용할경우 형변환이 필요없다.
		String listData2 = list2.get(0);
		
		
		// 제너릭 타입으로 해놓았기때문에 오류가 나지 않는다.
		GenericTestClass genericTest1 = new GenericTestClass("isString");
		GenericTestClass genericTest2 = new GenericTestClass(5000);
		GenericTestClass genericTest3 = new GenericTestClass(new GenericTestClass());
		
		
		/*
		 * 와일드 카드란
		 * - 제네릭 클래스의 객체를 메소드의 파라미터로 받을때, 그 객체의 타입 변수를 제한하는것
		 * 
		 * 제네릭 와일드카드는 3가지가 있다.
		 * <?> -> 타입 파라미터를 대치하는 것으로 모든 클래스나 인터페이스 타입이 올수 있다.
		 * <? extends 상위타입> -> 특정 객체의 하위 클래스만 올 수 있다.
		 * <? super 하위타입> -> 특정 객체의 상위 클래스만 올 수 있다.
		 */
		
		JuiceMachine juiceMachine = new JuiceMachine();
		
		// Fruit를 상속받는 객체들로만 생성가능
		FruitBox appleBox = new FruitBox(new Apple());
		FruitBox bananaBox = new FruitBox(new Banana());
		
		// Fruit를 상속받는 객체만 가능
		juiceMachine.makeJuice(appleBox);
		juiceMachine.makeJuice(bananaBox);
	}
}

class Fruit{}
class Apple extends Fruit{}
class Banana extends Fruit{}

// 과일 박스에는 과일만 담겨야함
class FruitBox<T extends Fruit>{
	private T box;
	public FruitBox(T box) {
		this.box = box;
	}
}

class JuiceMachine{
	void makeJuice(FruitBox<? extends Fruit> box) {
		// 주스만들는 코드
	}
}

