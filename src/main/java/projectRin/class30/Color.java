package projectRin.class30;

public enum Color {
	RED(1)
	, BLUE(4)
	, GREEN(3)
	, YELLOW(2)
	, BLACK(5);
	
	private final int value;

	// 생성자 
	// Illegal modifier for the enum constructor; only private is permitted.
	Color(int value) { 
		this.value = value; 
	}

    public int getValue() { 
    	return value; 
    }
}
