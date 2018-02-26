package ex2.control;
import java.util.Scanner;

public class SwitchScore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int kor; 
		int eng;
		int math;
		int total = 0;
		int menu = 0;
		float avg = 0;
		System.out.println();
		
		
		kor = 60;
		eng = 70;
		math = 80;
		
		벗어나고파 : 
		while(true)
		{
			System.out.println("┌─────────────────────────────┐");
			System.out.println("│          \"메인 메뉴\"           │");
			System.out.println("└─────────────────────────────┘");
			System.out.printf("\t 1.성적 입력 \n");
			System.out.printf("\t 2.성적 출력 \n");
			System.out.printf("\t 3.종료 \n");
			
			System.out.printf("\t 선택 > ");
			menu = input.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("┌─────────────────────────────┐");
				System.out.println("│          \"성적 입력\"           │");
				System.out.println("└─────────────────────────────┘");
				System.out.printf("\t 국어 : ");
				kor = input.nextInt();
				
				System.out.printf("\t 영어 : ");
				eng = input.nextInt();
				
				System.out.printf("\t 수학 : ");
				math = input.nextInt();
				
				System.out.println();
				
				break;
						
			case 2:
				total = kor + eng + math; //출력 부분에 두는 게 낫다 -> 출력할때만 계산 필요할테니까
				avg = total/3.0f;
				
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
				break 벗어나고파; //break 안써도 됨
				
			default:
				System.out.println("메뉴의 범위를 벗어났습니다.");
				
				break;
			}
		}
	}

}
