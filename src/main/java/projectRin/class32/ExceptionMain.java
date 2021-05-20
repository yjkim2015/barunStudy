package projectRin.class32;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 32강 예외처리
 * @author imj10
 *
 */
public class ExceptionMain {
	public static void main(String[] args) {
		
		/**
		 *  unchecked exception
		 *  런타임 시점에 체크된 exception. runtime exception 상속함
		 *  NullPointerException, ArrayOutOfBound. IllegalArgumentException, illegalStateException
		 */
		String[] array = null;
//		System.out.println(array.length); // java.lang.NullPointerException
		
		 /**
		  * checked exception
		  * 컴파일 시점에 체크된 exception
		  * IOException, SQLException, DataAccessException, InvocationTargetException, MalformedURLException
		  */
		try {
			//Unhandled exception type FileNotFoundException
			BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		
		
		/**
		 * 1. try-catch finally 직접처리
		 */
		// 실제 코드가 들어가는 곳. 예외가 발생할 가능성이 있는 코드
		try {
			String[] list = null;
			
			for ( int i=0; i < list.length; i++ ) {
				System.out.println(list[i]);
			}
			
		}
		// Try에서 Exception이 발생시 처리 코드
		catch (NullPointerException npe) { // 실제 참조할 대상이 null인데 참조할 경우 발생되는 예외
			System.out.println(npe.getMessage());
		}
		catch (Exception ex) { // 모든 Exception의 부모 클래스
			System.out.println(ex.getMessage());
		}
		// Try에서 Exception과 상관없이 무조건 수행되는 코드 (생략가능)
		finally {
			System.out.println("finally - 예외 상관없이 실행");
		}
		
		/**
		 * 2. throws 간접 처리
		 * 
		 */
//		throwsExceptionTest();

		/**
		 *  3. throw 예외생성 > 컴파일 오류 발생
		 */
		try {
			throwExceptionTest();
		} 
		catch (IOException ioe) {
			System.out.println("IOException 발셍");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	private static void throwsExceptionTest() throws NullPointerException {
		System.out.println("throwsExceptionTest() Start");
		String[] list = null;
		
		for ( int i=0; i < list.length; i++ ) {
			System.out.println(list[i]);
		}
		
		System.out.println("throwsExceptionTest() End"); // exception이 발생하므로 출력되지 않음.
	}
	
	private static void throwExceptionTest() throws Exception {
		System.out.println("throwExceptionTest() Start");
		
		// throw: 예외를 밖으로 던짐
		throw new IOException();
//		throw new Exception("exception 발생");
	}
}
