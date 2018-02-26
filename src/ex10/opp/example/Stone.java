package ex10.opp.example;

public class Stone {
	private int x;
	private int y;
	private char type;
	
	
	
	public Stone() {
		//this(0,0,'●');
	}
	
	public Stone(int x, int y, char type) {
		this.x = x;
		this.y = y;
		this.type = type;
		System.out.print("Stone 생성자\n");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}
	
	
}

