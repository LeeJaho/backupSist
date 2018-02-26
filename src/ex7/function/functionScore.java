package ex7.function;

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
		int[] kors = new int[3];
		int[] engs = new int[3];
		int[] maths = new int[3];
		int index = 0;

		int menu;
		끝내기 : 
		while (true) {
			menu = 메뉴입력();
			switch (menu) {
			case 1:
				성적입력(kors, engs, maths, index);
				index++;
				break;
			case 2:
				성적출력(kors, engs, maths, index);
				break;
			case 3:
				int close = 종료();
				if(close == 0)
					break 끝내기;
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

	public static void 성적입력(int[] kors, int[] engs, int[] maths, int index) {
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
			System.out.printf("%d번째\n", index + 1);
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
		kors[index] = kor;
		engs[index] = eng;
		maths[index] = math;
	}

	public static void 성적출력(int[] kors, int[] engs, int[] maths, int index) {
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

		for (int i = 0; i < index; i++) {
			kor = kors[i];
			eng = engs[i];
			math = maths[i]; // 각 배열의 값을 임시변수에 담아준다 -> 배열로 계속 계산하면 수행에 별로 좋지 않음
			total = kor + eng + math; // 출력 부분에 두는 게 낫다 -> 출력할때만 계산 필요할테니까
			avg = total / 3.0f;

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
	
	private static int 종료() {
		return 0;
	}

}
