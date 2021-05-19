package study.board;

public enum Menu {
	SEARCH_ALL
	, VIEW_DETAILS
	, WRITE_BOARD
	, EDIT_BOARD
	, REMOVE_BOARD
	, SELECT_ERROR;

	public static Menu valueOf(int number) {
		switch (number) {
			case 1: return SEARCH_ALL;
			case 2: return VIEW_DETAILS;
			case 3: return WRITE_BOARD;
			case 4: return EDIT_BOARD;
			case 5: return REMOVE_BOARD;
			default : return SELECT_ERROR;
		}
	}
	
}