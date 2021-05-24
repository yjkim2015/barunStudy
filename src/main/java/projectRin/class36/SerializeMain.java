package projectRin.class36;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

/**
 * Youtube 깜따긔야 자바 프로그래밍 기초 
 * [깜따긔야] 자바 기초 36강 직렬화
 * @author imj10
 *
 */
public class SerializeMain {
	// 직렬화: 객체의 상태를 바이트 스트림(2진법)으로 변환하는데 사용되는 프로세스
	// 역직렬화: 바이트 스트림을 다시 객체형태로 변환하는 작업
	
	// serialVersionUID: 객체의 해시코드로 직렬화될 때 객체에 표시되는 식별자
	
	public static void main(String[] args) throws Exception {
		Member member = new Member("imj1017", "이윤정", "imj1017@naver.com");
		System.out.println(member);
		
		// 이진 직렬화
		byte[] serializedMember;
		
		try ( ByteArrayOutputStream baos = new ByteArrayOutputStream() ) {
			try ( ObjectOutputStream oos = new ObjectOutputStream(baos) ) {
			    oos.writeObject(member);
			    
			    // member 직렬화
			    serializedMember = baos.toByteArray();
			}
		}
		
		String str = Base64.getEncoder().encodeToString(serializedMember);
		
		System.out.println(str);
		
		try ( ByteArrayInputStream bais = new ByteArrayInputStream(serializedMember) ) {
			try ( ObjectInputStream ois = new ObjectInputStream(bais) ) {
			        
			    // 역직렬화
			    Object objectContent = ois.readObject();
			    Member memberObject = (Member) objectContent;
			    
			    System.out.println(memberObject);
			}
		}
		
		// 문자열 형태의 직렬화
		// 1) CSV 직렬화
		String csv = String.format("%s, %s, %s", member.getId(), member.getName(), member.getEmail());
		System.out.println(csv);
		
		// 2) JSON 직렬화
		String json = String.format("{\"id\":\"%s\",\"name\":\"%s\",\"email\":\"%s\"}", member.getId(), member.getName(), member.getEmail());
		System.out.println(json);  
	}
}
