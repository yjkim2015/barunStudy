package study.board;

import java.util.List;

public class BoardServiceImpl implements BoardService {

	private final BoardDao boardDao;
	
	public BoardServiceImpl() {
		boardDao = new BoardDaoImpl();
	}
	
	@Override
	public void showList() {
		BoardVo[] boardList = boardDao.selectAllBoard();
		for ( BoardVo boardVo : boardList ) {
			if ( boardVo == null ) continue;
			System.out.println("[No." + boardVo.getSeqNum() + "] [제목:" + boardVo.getTitle() + "] [작성자:" + boardVo.getWriter() + "]");
		}
	}

	@Override
	public void showDetail(BoardVo boardVo) {
		BoardVo oneBoard = boardDao.selectOneBoard(boardVo);
		if ( oneBoard == null ) {
			System.out.println("해당 번호에 대한 게시물이 존재하지 않습니다. \n");
		}
		else {
			System.out.println("[제목:" + oneBoard.getTitle() + "]" + "[내용:" + oneBoard.getContents() + "]\n");
		}
	}

	@Override
	public void writeBoard(BoardVo boardVo) {
		boardDao.insertBoard(boardVo);
		System.out.println("작성 되었습니다. \n");
	}

	@Override
	public void deleteBoard(BoardVo boardVo) {
		boardDao.deleteBoard(boardVo);
		System.out.println("삭제되었습니다. \n");
	}

	@Override
	public void updateBoard(BoardVo boardVo) {
		boardDao.updateBoard(boardVo);
		System.out.println("수정되었습니다. \n");
	}

}
