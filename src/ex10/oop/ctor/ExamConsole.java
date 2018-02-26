package ex10.oop.ctor;

import java.util.Scanner;

//껍데기
public class ExamConsole {
	
	private Exam exam; //참조만 하고 있음!!!!널포인터!!!!!! 아래 new 안만들면
	//Has a 관계
	//1.Composition Has a 관계
	//2.Association Has a 관계
	//3.Aggregation Has a 관계
	
	public ExamConsole() {
		exam = new Exam(); // 널포인터 -> 실체를 만들어준다
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		//국, 영, 수 값 담을 변수 선언
		int kor = 0;
		int eng = 0;
		int math = 0;
		//성적입력 프레임		
		System.out.println("┌─────────────────────────────┐");
		System.out.println("│          \"성적 입력\"           │");
		System.out.println("└─────────────────────────────┘");
		
		//국어
		do {
			System.out.printf("%d번째\n", 0 + 1);
			System.out.printf("\t 국어 : ");
			kor = input.nextInt();
			if (kor < 0 || kor > 100)
				System.out.print("성적의 범위(0~100)를 벗어났습니다.\n");
		} while (kor < 0 || kor > 100);

		// 영어
		do {
			System.out.printf("\t 영어 : ");
			eng = input.nextInt();
			if (eng < 0 || eng > 100)
				System.out.print("성적의 범위(0~100)를 벗어났습니다.\n");
		} while (eng < 0 || eng > 100);

		// 수학
		do {
			System.out.printf("\t 수학 : ");
			math = input.nextInt();
			if (math < 0 || math > 100)
				System.out.print("성적의 범위(0~100)를 벗어났습니다.\n");
		} while (math < 0 || math > 100);
		System.out.println();
		
		//배열에 각각 점수 담기
		//Exam.setKor(exam, kor);
		//exam.setKor(kor);
		
		exam.setKor(kor);
		this.exam.setEng(eng);
		this.exam.setMath(math);
		
		/*kors[index] = kor;
		engs[index] = eng;
		maths[index] = math;*/
	}
	
	public void print() {
		//성적 계산에 필요한 변수 선언
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		float avg = 0;
		
		//성적출력 프레임
		System.out.println("┌─────────────────────────────┐");
		System.out.println("│          \"성적 출력\"           │");
		System.out.println("└─────────────────────────────┘");

		for (int i = 0; i < 1; i++) {
			//임시변수
			//값을 뽑아내기 위한 함수
			/*kor = Exam.getKor(exam);
			eng = Exam.getEng(exam);
			math = Exam.getMath(exam);*/ // 각 배열의 값을 임시변수에 담아준다 -> 배열로 계속 계산하면 수행에 별로 좋지 않음
			
			kor = exam.getKor();
			eng = this.exam.getEng();
			math = this.exam.getMath();
			
			//total = Exam.total(exam); // 출력 부분에 두는 게 낫다 -> 출력할때만 계산 필요할테니까
			total = this.exam.total();
			//avg = Exam.avg(exam);
			avg = this.exam.avg();

			System.out.printf("%d번째 학생\n", i + 1);
			System.out.printf("\t 국어 : %d\n", kor);
			System.out.printf("\t 영어 : %d\n", eng);
			System.out.printf("\t 수학 : %d\n", math);

			System.out.println();

			System.out.printf("\t 총점 : %d\n", total);
			System.out.printf("\t 평균 : %.2f\n", avg);

			System.out.println();

		}
	}

}
