package projectRin.class26;

import java.util.ArrayList;
import java.util.List;

/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 26강 제네릭
 * @author imj10
 *
 */
public class GenericMain {
	public static void main(String[] args) {
		Gen<String> gen = new Gen<String>();
		gen.setSomething("Generic");
		System.out.println(gen.getSomething());
		
		
		Gen<Integer> gen2 = new Gen<Integer>();
		gen2.setSomething(5);
		System.out.println(gen2.getSomething());
		
//		ArrayList<String> array = new ArrayList<String>();
		ArrayList<String> array = new ArrayList<>(); //java7부터 생략 가능
		array.add("string1");
		array.add("string2");
		array.add("string3");
		
		for ( int i=0; i < array.size(); i++ ) {
			System.out.println(array.get(i));
		}
		
	}
}
