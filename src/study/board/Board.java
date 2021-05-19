package study.board;

import java.util.Scanner;

/**
 * 게시판 만들기
 * 
 * 저장소는 ArrayList -> 배열 사용
 * 메뉴타입은 전역변수 -> enum 사용
 * 배열 크기 증가값 고정값 -> 쉬프트연산 사용
 * 
 * @author 박희성 
 */
public class Board {

	private String userName;
	private final BoardServiceImpl boardServiceImpl;
	
	public Board() {
		boardServiceImpl = new BoardServiceImpl();
	}
	
	private String inputString() {
		String inputStr = null;
		try {
			inputStr = new Scanner(System.in).nextLine();
		}
		catch ( java.util.InputMismatchException e ) {
			System.out.println("입력값이 잘못 되었습니다.");
			inputStr = inputString();
		}
		return inputStr;
	}

	private int inputNumber() {
		int inputInt = 0;
		try {
			inputInt = new Scanner(System.in).nextInt();
		}
		catch ( java.util.InputMismatchException e ) {
			System.out.println("입력값이 잘못 되었습니다.");
			inputInt = inputNumber();
		}
		return inputInt;
	}
	
	private void searchAll() {
		boardServiceImpl.showList();
		showMenu();
	}
	
	private void viewDetails() {
		BoardVo boardVo = new BoardVo();
		
		System.out.print("게시글 번호를 선택하세요 : ");
		boardVo.setSeqNum(inputNumber());
		
		boardServiceImpl.showDetail(boardVo);
		showMenu();
	}
	
	private void writeBoard() {
		BoardVo boardVo = new BoardVo();
		
		System.out.print("제목을 입력해주세요 : ");
		boardVo.setTitle(inputString());

		System.out.print("내용을 입력해주세요 : ");
		boardVo.setContents(inputString());

		boardVo.setWriter(userName);

		boardServiceImpl.writeBoard(boardVo);
		showMenu();
	}
	
	private void editBoard() {
		BoardVo boardVo = new BoardVo();

		System.out.print("수정할 게시글 번호를 선택해주세요 : ");
		boardVo.setSeqNum(inputNumber());

		System.out.print("수정할 내용을 입력해주세요 : ");
		boardVo.setContents(inputString());

		boardServiceImpl.updateBoard(boardVo);
		showMenu();
	}
	
	private void removeBoard() {
		BoardVo boardVo = new BoardVo();

		System.out.print("삭제할 게시글 번호를 선택해주세요 : ");
		boardVo.setSeqNum(inputNumber());

		boardServiceImpl.deleteBoard(boardVo);
		showMenu();
	}
	
	private void start() {
		System.out.print("사용자 이름을 입력해주세요 : ");
		userName = inputString();
		showMenu();
	}

	private void showMenu() {
		switch (chooseMenu()) {
			case SEARCH_ALL		: searchAll(); break;
			case VIEW_DETAILS	: viewDetails(); break;
			case WRITE_BOARD	: writeBoard(); break;
			case EDIT_BOARD		: editBoard(); break;
			case REMOVE_BOARD	: removeBoard(); break;
			default: System.out.println("메뉴를 다시 선택해주세요.");
						showMenu(); break;
		}
	}

	private Menu chooseMenu() {
		System.out.println("[1]전체조회  [2]상세보기  [3]게시글작성  [4]게시글수정  [5]게시글삭제");
		return Menu.valueOf(inputNumber());
	}
	
	public static void main(String[] args) {
		Board board = new Board();
		board.start();
	}

}