package projectRin.class27;

import java.util.ArrayList;

/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 27강 와일드 카드
 * @author imj10
 *
 */
public class WildCardMain {
	public static void main(String[] args) {
		Nation nation1 = new Nation();
		Nation nation2 = new Nation();
		Nation nation3 = new Nation();
		
		nation1.setName("Korea");
		nation2.setName("Japan");
		nation3.setName("China");
		
		City city1 = new City();
		City city2 = new City();
		City city3 = new City();
		
		city1.setName("Seoul");
		city2.setName("Tokyo");
		city3.setName("Beijing");
		
		ArrayList<Nation> arrayNation = new ArrayList<Nation>();
		arrayNation.add(nation1);
		arrayNation.add(nation2);
		arrayNation.add(nation3);
		
		
		ArrayList<Nation> arrayCity = new ArrayList<Nation>();
		arrayCity.add(city1);
		arrayCity.add(city2);
		arrayCity.add(city3);
		
		showInfo(arrayNation);
		showInfo(arrayCity);

		showInfo1(arrayNation);
		showInfo1(arrayCity);
		
		showInfo2(arrayNation);
		showInfo2(arrayCity);
	}
	
	// unbounded wildcard
	// 타입 변수에 모든 타입을 사용할 수 있음.
	public static void showInfo(ArrayList<?> array) {
		
		for ( Object one: array ) {
			System.out.println(((Nation) one).getName()); // City가 Nation을 상속받았으므로 둘 다 가능
		}
	}
	
	// bounded wildcard
	// 1.upper bounded wildcard
	// T 타입과 T 타입을 상속받는 자손 클래스 타입만을 사용할 수 있음.
	public static void showInfo1(ArrayList<? extends Nation> array) {
		
		for ( Object one: array ) {
			System.out.println(((Nation) one).getName());
		}
	}
	
	// 2.lower bounded wildcard
	// T 타입과 T 타입이 상속받은 조상 클래스 타입만을 사용할 수 있음.
	public static void showInfo2(ArrayList<? super City> array) {
		
		for ( Object one: array ) {
			System.out.println(((Nation) one).getName());
		}
	}
}
