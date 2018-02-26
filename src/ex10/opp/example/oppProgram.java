package ex10.opp.example;

public class oppProgram {

	public static void main(String[] args) {
		
		Console console = new Console();
		
		while(true) {
		console.printBoard();
		console.inputStone();
		
		console.putStoneOnBoard();
		}
	}

}
