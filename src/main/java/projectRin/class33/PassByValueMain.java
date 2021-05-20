package projectRin.class33;

/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 33강 pass by value
 * @author imj10
 *
 */
class Dog {
	private String name;

	public Dog(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class PassByValueMain {
	
	public static void main(String[] args) {
		int x = 3;
		String[] arr = new String[1];
		arr[0] = "a";
		
		Dog dog1 = new Dog("멍짱");
		Dog dog2 = new Dog("쿠키");
		
		System.out.println(arr.hashCode()); 
		System.out.println(dog1.hashCode());
		System.out.println(dog2.hashCode()); 
		
		System.out.println("\nvalueChange");
		valueChange(x, arr, dog2, dog2);
		
		System.out.println("x: " + x); //3 > 원시타입이므로 값을 복사
		System.out.println("arr: " + arr[0]); // A > 헤시코드를 복사
		System.out.println("dog1" + dog1.getName()); // 멍짱
		System.out.println("dog2" + dog2.getName()); // 쿠키쿠키
	}

	private static void valueChange(int n, String[] array, Dog dog1, Dog dog2) {
		System.out.println("변경 메소드 실행");
		n++;
		array[0] = "A";
		dog1 = new Dog("멍짱멍짱"); // 새로운 hashcode에 생성. 새로생겻다가 메소드 종료될때 삭제됨.
		dog2.setName("쿠키쿠키");

		System.out.println(array.hashCode()); // 동일
		System.out.println(dog1.hashCode()); // Java가 Pass By Reference 방식으로 동작하였다면 process 함수가 종료된 후에도 멍짱멍짱이라는 값으로 유지
		System.out.println(dog2.hashCode()); //동일

		System.out.println("n: " + n);
	}
}
