package ex3.control;

import java.util.Scanner;

public class whileScore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		int menu = 0;
		float avg = 0;
		System.out.println();

		벗어나고파: while (true) {
			System.out.println("┌─────────────────────────────┐");
			System.out.println("│          \"메인 메뉴\"           │");
			System.out.println("└─────────────────────────────┘");
			System.out.printf("\t 1.성적 입력 \n");
			System.out.printf("\t 2.성적 출력 \n");
			System.out.printf("\t 3.종료 \n");

			System.out.printf("\t 선택 > ");
			menu = input.nextInt();

			switch (menu) {
			case 1:
				System.out.println("┌─────────────────────────────┐");
				System.out.println("│          \"성적 입력\"           │");
				System.out.println("└─────────────────────────────┘");

				// 국어

				do {
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

				break;

			case 2:
				total = kor + eng + math; // 출력 부분에 두는 게 낫다 -> 출력할때만 계산 필요할테니까
				avg = total / 3.0f;

				System.out.println("┌─────────────────────────────┐");
				System.out.println("│          \"성적 출력\"           │");
				System.out.println("└─────────────────────────────┘");

				System.out.printf("\t 국어 : %d\n", kor);
				System.out.printf("\t 영어 : %d\n", eng);
				System.out.printf("\t 수학 : %d\n", math);

				System.out.println();

				System.out.printf("\t 총점 : %d\n", total);
				System.out.printf("\t 평균 : %.2f\n", avg);

				break;

			case 3:
				break 벗어나고파; // break 안써도 됨

			default:
				System.out.println("메뉴의 범위를 벗어났습니다.");

				break;
			}
		}
	}

}
