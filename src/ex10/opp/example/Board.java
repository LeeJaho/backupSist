package ex10.opp.example;

import java.util.Scanner;

public class Board {
	
	private Stone[] stones; // 왜 이렇게 쓰일까? ->
	private int index;
	private int width;
	private int height;
	
	//생성자
	public Board() {
		this(30,20);
		//stones = new Stone[10]; //이름딱지 10개 만든것
	}
	
	//생성자 오버로드
	public Board(int width, int height) {
		this.width = width;
		this.height = height;
		stones = new Stone[10]; //이름딱지 10개 만든것
	}
	
	
	//돌 넣기
	public void putStone(Stone stone) {
		stones[index] = stone;
		index++;
	}
	
	//get Width, Height, Stones
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public Stone[] getStones() {
		return stones;
	}
	
	//set Width, Height, Stones
	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setStones(Stone[] stones) {
		this.stones = stones;
	}
	//돌 몇개 생성됐는지
	public int getStoneSize() {
		return index;
	}
}
