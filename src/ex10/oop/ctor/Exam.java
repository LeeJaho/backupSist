package ex10.oop.ctor;

import java.util.Scanner;

//this.를 지워도 컴파일러가 알아서 찾아주니까 생각마시오!
//껍데기에서 사용할 data
public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	//default constructor
	public Exam() {
		this(0,0,0);	
	}
	
	//overload constructor
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//instance total 함수
	public int total() {
		return kor + eng + math;
	}
	
	//instance avg 함수
	public float avg() {
		return total() / 3;
	}
	
	//점수 get
	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}
	
	//점수 set
	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

}
