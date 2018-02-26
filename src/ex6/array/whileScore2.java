package ex6.array;

import java.util.Scanner;

public class whileScore2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		
		//국어, 영어, 수학을 3개씩 저장할 수 있는 배열을 생성하시오
		int[] kors = new int[3];
		int[] engs = new int[3]; 
		int[] maths = new int[3];
		int index = 0; //데이터 관리를 위한 변수
		
		
		
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
					kors[index] = kor;
					engs[index] = eng;
					maths[index] = math; 
					index++;
					//배열로 비교하지 말고 수행성능을 위해서 
	
				System.out.println();

				break;

			case 2:

				System.out.println("┌─────────────────────────────┐");
				System.out.println("│          \"성적 출력\"           │");
				System.out.println("└─────────────────────────────┘");
				
				for(int i = 0; i < index; i++) {
					kor = kors[i]; eng = engs[i]; math = maths[i]; //각 배열의 값을 임시변수에 담아준다 -> 배열로 계속 계산하면 수행에 별로 좋지 않음 
					total = kor + eng + math; // 출력 부분에 두는 게 낫다 -> 출력할때만 계산 필요할테니까
					avg = total / 3.0f;
					
					System.out.printf("%d번째 학생\n", i+1);
					System.out.printf("\t 국어 : %d\n", kor);
					System.out.printf("\t 영어 : %d\n", eng);
					System.out.printf("\t 수학 : %d\n", math);
	
					System.out.println();
	
					System.out.printf("\t 총점 : %d\n", total);
					System.out.printf("\t 평균 : %.2f\n", avg);
					
					System.out.println();
				}
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
