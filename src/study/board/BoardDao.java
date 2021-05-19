package study.board;

import java.util.List;

public interface BoardDao {
	
	BoardVo selectOneBoard(BoardVo boardVo);

	BoardVo[] selectAllBoard();

	void insertBoard(BoardVo boardVo);

	void deleteBoard(BoardVo boardVo);

	void updateBoard(BoardVo boardVo);

}