package ex11.collect;

import java.util.Scanner;

public abstract class Exam {
	
	//추상 클래스 : 개체들의 공통분모 (공통분모 클래스)
	//제품으로 바로 못만들게 하고 틀로만 사용하게 하겠다.

	private int kor;
	private int eng;
	private int math;

	//default 생성자
	public Exam() {
		// TODO Auto-generated method stub 
		this(0,0,0);
	}

	//overload 생성자
	public Exam(int kor, int eng, int math) {
		// TODO Auto-generated method stub 
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public abstract float avg();
	
	public int total() {
		// TODO Auto-generated method stub
		return kor + eng + math;
	}

	public int getKor() {
		// TODO Auto-generated method stub
		return kor;
	}

	public int getEng() {
		// TODO Auto-generated method stub
		return eng;
	}

	public int getMath() {
		// TODO Auto-generated method stub
		return math;
	}

	public void setKor(int kor) {
		// TODO Auto-generated method stub
		this.kor = kor;
	}

	public void setEng(int eng) {
		// TODO Auto-generated method stub
		this.eng = eng;
	}

	public void setMath(int math) {
		// TODO Auto-generated method stub
		this.math = math;
	}

}