import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner score = new Scanner(System.in); 
		int kor; 
		int eng;
		int math;
		int total;
		float avg;
		System.out.println();
		
		
		kor = 60;
		eng = 70;
		math = 80;
		
		System.out.println("┌─────────────────────────────┐");
		System.out.println("│          \"성적 입력\"           │");
		System.out.println("└─────────────────────────────┘");
		System.out.printf("국어 : ");
		kor = score.nextInt();
		
		System.out.printf("영어 : ");
		eng = score.nextInt();
		
		System.out.printf("수학 : ");
		math = score.nextInt();
		
		System.out.println();
		total = kor + eng + math;
		avg = total/3.0f;
		
		System.out.println("┌─────────────────────────────┐");
		System.out.println("│          \"성적 출력\"           │");
		System.out.println("└─────────────────────────────┘");

		

		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);
		
		System.out.println();
		
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %.2f\n", avg);

	}

}
