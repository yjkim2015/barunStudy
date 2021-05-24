package projectRin.class37;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 37강 텍스트 파일 읽고 쓰기
 * @author imj10
 *
 */
public class FileIOMain {
	public static void main(String[] args) {
		// 파일이 없을 경우 생성 있을 경우 수정
		// 경로
		// 절대경로: "c:/file.txt"
		// 상대경로: "[Project파일]/file.txt"
		Path file2 = Paths.get("file2.txt");
		
		
		// BufferedWriter, BufferedReader
		// 키보드의 입력이 있을 때마다 한문자씩 버퍼로 전송되고, 버퍼가 가득차거나 개행문자가 나타날 경우 버퍼의 내용을 한번에 전송
		// Buffer: 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 임시 메모리 영역. 입출력 속도 향상을 위해 버퍼 사용
		try {
			BufferedWriter writer = Files.newBufferedWriter(file2, StandardCharsets.UTF_8);
			
			writer.write("hello");
			writer.newLine(); // 개행역할(\n)
			writer.write("I'm YoonJung ^^");
			writer.flush(); // 스트림을 비움
			
			writer.close(); // 스트림 닫음
			
		} 
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		Path file = Paths.get("file.txt");
		
		try {
			BufferedReader reader = Files.newBufferedReader(file);
			String line = reader.readLine();
			while ( line != null ) {
				System.out.println(line);
				line = reader.readLine(); // 한줄씩 String으로 반환
			}
			reader.close(); // 스트림 닫음
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
