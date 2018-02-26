package ex10.oop;

import java.util.Scanner;

public class functionScore {

	public static void main(String[] args) {
		//반복시작
		//1. 메뉴 입력
		//2. 메뉴 1 - 성적입력
		//3. 메뉴 2 - 성적출력
		//4. 메뉴3 - 종료
		//반복끝		
		//국어, 영어, 수학을 3개씩 저장할 수 있는 배열을 생성하시오
	
		int index = 0;
		Exam exam = new Exam(); //공유가 된다
		final int INPUT = 1;
		final int PRINT = 2;
		
		int menu;
		EXIT : 
		while (true) {
			
			menu = 메뉴입력();
			
			switch (menu) {
			case INPUT: //성적입력
				ExamConsole.input(exam);
				index++;
				break;
			case PRINT:
				ExamConsole.print(exam);
				break;
			case 3:
				break EXIT;
			}

		}
	}

	public static int 메뉴입력() {
		Scanner input = new Scanner(System.in);
		//메뉴 프레임
		System.out.println("┌─────────────────────────────┐");
		System.out.println("│          \"메인 메뉴\"           │");
		System.out.println("└─────────────────────────────┘");
		System.out.printf("\t 1.성적 입력 \n");
		System.out.printf("\t 2.성적 출력 \n");
		System.out.printf("\t 3.종료 \n");
		System.out.printf("\t 선택 > ");
		
		//메뉴에 입력값 담기
		int menu = input.nextInt();
		//메뉴값 반환
		return menu;
	}
}
