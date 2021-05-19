package study.board;

public interface BoardService {
	
	void showList();
	
	void showDetail(BoardVo boardVo);
	
	void writeBoard(BoardVo boardVo);
	
	void deleteBoard(BoardVo boardVo);
	
	void updateBoard(BoardVo boardVo);
	
}