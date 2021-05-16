package day01;

import java.util.ArrayList;
import java.util.Scanner;

import common.BoardVo;

public class BoardService {
	Scanner sc = new Scanner(System.in);
	
	public void selectList(ArrayList<BoardVo> list) {
		int index = 0;
		if ( list.size() == 0 ) {
			System.out.println("조회할 목록이 없습니다.");
			return;
		}
		
		System.out.println("===============================================");
		System.out.println("index\ttitle\tcontent\tregister");
		System.out.println("-----------------------------------------------");
		for (BoardVo one : list ) {
			index++;
			System.out.println(index + "\t" + one.getTitle() + "\t" + one.getContent()  + "\t" +  one.getRegister());
		}
		System.out.println("===============================================");
	}
	
	public BoardVo insertBoard() {
		System.out.print("title : ");
		String title = sc.next();
		System.out.print("content : ");
		String content = sc.next();
		System.out.print("register : ");
		String register = sc.next();
		
		BoardVo boardVo = new BoardVo();
		boardVo.setTitle(title);
		boardVo.setContent(content);
		boardVo.setRegister(register);
		
//		System.out.println(boardVo.getTitle() + "\t" + boardVo.getContent()  + "\t" +  boardVo.getRegister());
		
		return boardVo;
	}
	
	public BoardVo updateBoard() {
		System.out.print("title : ");
		String title = sc.next();
		System.out.print("content : ");
		String content = sc.next();
		System.out.print("register : ");
		String register = sc.next();
		
		BoardVo boardVo = new BoardVo();
		boardVo.setTitle(title);
		boardVo.setContent(content);
		boardVo.setRegister(register);
		
//		System.out.println(boardVo.getTitle() + "\t" + boardVo.getContent()  + "\t" +  boardVo.getRegister());
		
		return boardVo;
	}
	
	public int deleteBoard() {
		System.out.println("삭제할 인덱스를 선택하세요");
		int index = sc.nextInt() -1;
		
		return index;
	}
	
}
