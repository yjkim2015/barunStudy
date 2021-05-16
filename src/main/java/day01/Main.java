package day01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import common.BoardVo;

// 게시판 생성 입력(제목, 내용, 글쓴이, ) sysout으로 찍어서 입력 수정 삭제 기능
/*
 * 게시판 객체를 만들어야함 디비 없이 boardVo로 생성
 * list
 * 상세 보기 
 * 입력
 * 수정
 * 삭제
 * 
 * 기능 단위로 메소드생성 junit이용해서 기능 단위 테스트
 * 2021-04-30 금요일 아침 9시
 * 
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("게시판");
	
		BoardService boardService = new BoardService();
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		
		String input = "";
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 목록 2. 입력 3. 수정 4. 삭제 5. 종료"); // 매직넘버로 활용
			input = sc.nextLine();
			
			// input 기능 메소드로 뻬기
			
			if ( input.equals("1") ) {
				// 목록 출력
				boardService.selectList(list);
			}
			else if ( input.equals("2") ) {
				// 입력
				BoardVo vo  = boardService.insertBoard();
				list.add(vo);
			}
			else if ( input.equals("3") ) {
				// 수정
				boardService.selectList(list);

				System.out.println("수정할 인덱스를 선택하세요");
				int index = sc.nextInt() - 1;
				
				BoardVo vo  = boardService.updateBoard();
				
				list.set(index, vo);
			}
			else if ( input.equals("4") ) {
				// 삭제
				boardService.selectList(list);
				
				int index = boardService.deleteBoard();
				list.remove(index);
			}
			else if ( input.equals("5") ) {
				System.out.println("종료 되었습니다.");
				System.exit(0);
			}
			else {
				System.out.println("잘못입력하였습니다.");
			}
		}
		
	}
	
}
