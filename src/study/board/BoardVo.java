package study.board;

public class BoardVo implements Comparable<BoardVo> {

	private int seqNum;
	private String title;
	private String contents;
	private String writer;
	
	public int getSeqNum() {
		return seqNum;
	}

	public void setSeqNum(int seqNum) {
		this.seqNum = seqNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public int compareTo(BoardVo boardVo) {
		return boardVo.getSeqNum() - getSeqNum();
	}
}
