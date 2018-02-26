package ex11.collect;

import java.util.Scanner;

public class ExamConsole {
	//제품
	
	//Interface 준비
	private ConsoleListener consoleListener;
	
	public void setConsoleListener(ConsoleListener consoleListener) {
		this.consoleListener = consoleListener;
	}
	
	private Exam[] exams;
	private int index;
	
	private Exam exam;
	
	public ExamConsole() {
		//exam = newExam();
		exams = new Exam[3];
		index = 0;
	}
	
	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	

	public static int menuInput() {
		
		Scanner a = new Scanner(System.in);
		int out=0;
		
		System.out.println("┌─────────────────┐");
		System.out.println("│              메인 메뉴           │");
		System.out.println("└─────────────────┘");
		System.out.println("               1. 성적 입력");
		System.out.println("               2. 성적 출력");
		System.out.println("               3. 종료\n");
		System.out.print("               선택 > ");
		
		out = a.nextInt();
		return out;
		
	}
	
	public void output() {
		
		int kor;
		int eng;
		int math;
		int total=0;
		float avg=0.0f;
		
		// TODO Auto-generated method stub
		System.out.println("┌─────────────────┐");
		System.out.println("│              성적 출력           │");
		System.out.println("└─────────────────┘");
		
		for(int i=0;i<1;i++)
		{
			kor = exam.getKor();
			eng = exam.getEng();
			math = exam.getMath();
			
			total = exam.total();
			avg = exam.avg();
			
			System.out.println("");
			System.out.printf("                국어 : %d \n", kor); 
			System.out.printf("                영어 : %d \n", eng);
			System.out.printf("                수학 : %d \n", math);
			
			//Interface
			if(consoleListener != null)
				consoleListener.onPrint(exam);
			
			System.out.printf("                총점 : %d \n", total);
			System.out.printf("                평균 : %.2f \n", avg);
			System.out.println();
			System.out.println(" ──────────────────");
		}
		
	}
	
	protected void onOutput(Exam exam) {
		
	}

	public void input() {
		
		Scanner a = new Scanner(System.in);
		
		int kor;
		int eng;
		int math;
		
		System.out.println("┌─────────────────┐");
		System.out.println("│              성적 입력           │");
		System.out.println("└─────────────────┘");
		System.out.println("");
		
		do {
			System.out.printf("            %d번째 국어 > ",0+1);
			kor = a.nextInt();
			exam.setKor(kor);
			if(kor < 0 || kor > 100)
				System.out.println("\n   성적의 범위(0~100)를 벗어났습니다.");
		}
		while(kor < 0 || kor > 100);
			
		do {
			System.out.printf("            %d번째 영어 > ",0+1);
			eng = a.nextInt();
			exam.setEng(eng);
			if(eng < 0 || eng > 100)
				System.out.println("\n   성적의 범위(0~100)를 벗어났습니다.");
		}while(eng < 0 || eng > 100);
		
	
		do {
			System.out.printf("            %d번째 수학 > ",0+1);
			math = a.nextInt();
			exam.setMath(math);
			if(math < 0 || math > 100)
				System.out.println("\n   성적의 범위(0~100)를 벗어났습니다.");
		}while(math < 0 || math > 100);
		
		//Interface
		if(consoleListener != null)
			consoleListener.onInput(exam);
		
		exams[index] = exam;
		index++;
		
	}


	public void onInput(Exam exam) {
		
	}

}