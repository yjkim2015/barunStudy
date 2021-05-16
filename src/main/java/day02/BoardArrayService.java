package day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import common.BoardVo;
import common.Constants;

public class BoardArrayService {
	// final 변수 따로 뺴서 사용, 전역변수들 접근제어자 사용, default 쓰기, 종료만 입력부분도 함수로 뺴기, 
	
	BoardVo[] boardArray;
	
	Scanner sc = new Scanner(System.in);

	public void initBoard() {
		int input = choose();
		
		switch (input) {
		case Constants.LIST:
			selectList();
			break;
		case Constants.CREATE:
			insertBoard();
			break;
		case Constants.UPDATE:
			updateBoard();
			break;
		case Constants.DELETE:
			deleteBoard();
			break;
		case Constants.QUIT:
			exit();
			break;
		default:
			break;
		}
		
	}
	
	public int choose() {
		System.out.println("1. 목록 2. 입력 3. 수정 4. 삭제 5. 종료");
		int input = sc.nextInt();
		
		return input;
	}
	
	public void selectList() {
		if ( boardArray == null ) {
			System.out.println("조회 목록이 없습니다.");
			return;
		}
		
		System.out.println("===============================================");
		System.out.println("index\ttitle\tcontent\tregister");
		System.out.println("-----------------------------------------------");
		for ( int i = 0; i < boardArray.length; i++ ) {
			
			System.out.println( (i+1) + "\t" + boardArray[i].getTitle() + "\t" + boardArray[i].getContent()  + "\t" +  boardArray[i].getRegister());
		}
		System.out.println("===============================================");
		
		initBoard();
	}
	
	public void insertBoard() {
		if ( boardArray == null ) {
			boardArray = new BoardVo[1];
		}
		else {
			BoardVo[] tmpBoardArray = new BoardVo[boardArray.length+1];
			
			for ( int i = 0; i < boardArray.length; i ++ ) {
				tmpBoardArray[i] = boardArray[i];
			}
			
			boardArray = tmpBoardArray;
		}
		
		inputBoard(boardArray.length - 1);

		initBoard();
	}
	
	public void updateBoard() {
		System.out.println("수정할 인덱스를 선택하세요");
		int updateIndex = sc.nextInt() - 1;

		if ( checkIndex(updateIndex) ) {
			inputBoard(updateIndex);
		
			System.out.println("수정되었습니다.");
		}

		initBoard();
	}
	
	public void deleteBoard() {
		System.out.println("삭제할 인덱스를 선택하세요");
		int deleteIndex = sc.nextInt() -1;

		if ( checkIndex(deleteIndex) ) {
			BoardVo[] tmpBoardArray = new BoardVo[boardArray.length-1];
			
			for ( int i = 0; i < deleteIndex; i ++ ) {
				tmpBoardArray[i] = boardArray[i];
			}
			
			for ( int i = deleteIndex; i < tmpBoardArray.length; i ++ ) {
				tmpBoardArray[i] = boardArray[i+1];
			}
			boardArray = null;
			boardArray = tmpBoardArray;
			System.out.println("삭제되었습니다.");
		}

		initBoard();
	}
	
	public void exit() {
		System.out.println("종료 되었습니다.");
		System.exit(0);
	}
	
	public void inputBoard(int index) {
		System.out.print("title : ");
		String title = sc.next();
		System.out.print("content : ");
		String content = sc.next();
		System.out.print("register : ");
		String register = sc.next();
		
		boardArray[index] = new BoardVo(title, content, register);
		
	}
	
	public boolean checkIndex(int index) {
		boolean result = true;
		
		if ( boardArray == null || index > boardArray.length ) {
			System.out.println("잘못된 값입니다.");
			result = false;
		}

		return result;
	}
}
