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
		this.capacity = 1;
		this.boardList = new BoardVo[capacity];
	}
	
	private void newBoardList() {
		capacity += capacity << 1;
		
		BoardVo[] newBoardList = new BoardVo[capacity];
		
		for ( int i = 0 ; i < boardList.length ; i++ ) {
			if ( boardList[i] == null ) {
				break;
			}
			newBoardList[i] = boardList[i];
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
		boardVo.setSeqNum(boardSeqNum++);
		for ( int i = 0 ; i < capacity ; i++ ) {
			if ( boardList[i] != null ) {
				if ( i == capacity-1 ) {
					newBoardList();
					boardList[i+1] = boardVo;
					break;
				}
				continue;
			}
			else {
				boardList[i] = boardVo;
				break;
			}
		}
	}

	@Override
	public void deleteBoard(BoardVo boardVo) {
		boolean isCopy = false;
		for ( int i = 0 ; i < capacity ; i++ ) {
			if ( boardList[i] != null && boardList[i].getSeqNum() == boardVo.getSeqNum() ) {
				isCopy = true;
			}
			if ( isCopy && i < capacity-1 ) {
				boardList[i] = boardList[i+1];
				if ( boardList[i] == null ) break;
			}
		}
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
