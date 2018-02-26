package ex9.capsule;

import java.util.Scanner;

//껍데기에서 사용할 data
public class Exam {
	private static int kor;
	private int eng;
	private int math;
	
	//총합
	public static int total(Exam exam) {
		
		return exam.kor + exam.eng + exam.math;
	}
	
	//평균
	public static float avg(Exam exam) {
		
		return total(exam) / 3;
	}
	
	//점수 get
	public static int getKor(Exam exam) {
		return exam.kor;
	}

	public static int getEng(Exam exam) {
		return exam.eng;
	}

	public static int getMath(Exam exam) {
		return exam.math;
	}
	
	//점수 set
	public static void setKor(int kor2) {
		kor = kor2; //꼭 exam.
	}

	public static void setEng(Exam exam, int eng) {
		exam.eng = eng;
	}

	public static void setMath(Exam exam, int math) {
		exam.math = math;
	}

}
