package day02;

/*
 * 배열로 for문 돌려 게시판 생성
 * 매직넘버 사용
 * input 기능 따로 메소드로 빼서 생성
 */
public class BoardArrayMain {
	
	public static void main(String[] args) {
		BoardArrayService boardArrayService = new BoardArrayService();
		
		boardArrayService.initBoard();
	}
}
