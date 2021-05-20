package study.board;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BoardDaoImpl implements BoardDao {

	private int boardSeqNum = 1;
	private int capacity;
	private BoardVo[] boardList;
	
	public BoardDaoImpl() {
		this.capacity = 0;
		this.boardList = new BoardVo[capacity];
	}
	
	private void increaseCapacity() {
		capacity += 1;
		BoardVo[] newBoardList = new BoardVo[capacity];
		
		for ( int i = 0 ; i < boardList.length ; i++ ) {
			newBoardList[i] = boardList[i];
		}
		
		boardList = newBoardList;
	}
	
	private void decreaseCapacity(int removeNum) {
		capacity -= 1;
		BoardVo[] newBoardList = new BoardVo[capacity];

		int j = 0;
		for ( int i = 0 ; i < boardList.length ; i++ ) {
			if (boardList[i].getSeqNum() == removeNum) {
				j = 1;
				continue;
			}
			newBoardList[i-j] = boardList[i];
		}
		
		boardList = newBoardList;
	}
	
	@Override
	public BoardVo selectOneBoard(BoardVo boardVo) {
		BoardVo returnVo = null;
		for ( BoardVo vo : boardList ) {
			if ( vo != null && vo.getSeqNum() == boardVo.getSeqNum() ) {
				returnVo = vo;
				break;
			}
		}
		return returnVo;
	}

	@Override
	public BoardVo[] selectAllBoard() {
		return boardList;
//		return boardList.values().stream().collect(Collectors.toCollection(ArrayList::new));
	}

	@Override
	public void insertBoard(BoardVo boardVo) {
		increaseCapacity();
		boardVo.setSeqNum(boardSeqNum++);
		boardList[capacity-1] = boardVo;
	}

	@Override
	public void deleteBoard(BoardVo boardVo) {
		decreaseCapacity(boardVo.getSeqNum());
	}

	@Override
	public void updateBoard(BoardVo boardVo) {
		for (int i = 0; i<capacity ; i++) {
			if ( boardList[i] != null && boardList[i].getSeqNum() == boardVo.getSeqNum() ) {
				boardList[i].setContents(boardVo.getContents());
				break;
			}
		}
	}
	
}