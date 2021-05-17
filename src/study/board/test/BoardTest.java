package study.board.test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import study.board.BoardDao;
import study.board.BoardDaoImpl;
import study.board.BoardVo;

import org.junit.After;
import org.junit.Before;

public class BoardTest {

	private BoardDao boardDao;

	@Before
	public void beforeEach() {
		boardDao = new BoardDaoImpl();
	}
	
	@Test
	public void InsertTest() {
		testboardService.InsertBoard();
	}
	
	@Test
	public void selectTest() {
		testboardService.selectBoard();
	}
//	
//	@Test
//	public void sameTest() {
//		BoardVo insertVo = new BoardVo();
//		insertVo.setTitle("This is title");
//		insertVo.setContents("This is contents");
//		boardDao.insertBoard(insertVo);
//			
//		BoardVo vo = new BoardVo();
//		vo.setSeqNum(1);
//		BoardVo selectVo = boardDao.selectOneBoard(vo);
//		
//		// 같은 객체 인지 확인
//		Assertions.assertSame(insertVo, selectVo);
//		
//		// 같은 내용 인지 확인
//		Assertions.assertEquals(insertVo.getTitle(), selectVo.getTitle());
//		Assertions.assertEquals(insertVo.getContents(), selectVo.getContents());
//	}
	
	@After
	public void after() {
		
	}

}
