package ex10.opp.example;

import java.util.Scanner;

public class Console {

	private Board board;
	private Stone stone;

	private char[][] buf;

	// 생성자
	public Console() {
		System.out.print("Console 생성자\n");
		board = new Board(); //왜 생성자 안에 넣어줬나? -> 판을 바로 만들어줘야하기 때문에? 
		
		int height = board.getHeight();
		int width = board.getWidth();
		buf = new char[height][width]; //생성자로 height, width 크기의 buf 만들어주고 대기
	}

	// Print Board
	public void printBoard() {
		
		int height = board.getHeight();
		int width = board.getWidth();
		Stone[] stones = board.getStones(); //왜 불러왔을까? -> Stone 배열로 만든건가? -> stones? 각각 한개 stone에 속성들이니까..? // int[] num = new int[30]
		
		//판 그려주기
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				buf[y][x] = '┼';
			}
			System.out.println();
		}
		
		//바둑알 찍어주기
		for (int i = 0; i < board.getStoneSize(); i++) {
			int sx = stones[i].getX();
			int sy = stones[i].getY();
			char stype = stones[i].getType();

			buf[sy][sx] = stype;
		}

		// buf[3][2] = '○';
		
		//buf값 출력
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				System.out.printf("%c", buf[y][x]);
			}
			System.out.println();
		}

		// 출력버퍼를 사용하지 않고 절차로만 출력하기
		/*
		 * for(int y = 0; y < height; y++) for(int x = 0; x < width; x++) { if(?)
		 * System.out.printf("%c", stone); else System.out.printf("%c", '┼'); }
		 */
	}

	// Input Stone //알 어디 찍을지 입력 받는다
	public void inputStone() {
		Scanner scan = new Scanner(System.in);
		System.out.print("(x sp y) : ");

		int x, y;
		char type = '○';

		x = scan.nextInt();
		y = scan.nextInt();

		stone = new Stone(x, y, type);

		// stone = new Stone();
	}

	//Put Stone On Board
	public void putStoneOnBoard() {
		board.putStone(stone);
	}
}
