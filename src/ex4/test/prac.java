package ex4.test;

import java.util.Scanner;

public class prac {
	
	public static void main(String[] args) {
		//문제1 - 키보드 값을 입력 받아 아래와 같이 출력하시오
		
		/*Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.printf("내 이름은 박제욱입니다. 제 나이는 %d입니다.", num);
		
		System.out.println();*/
		
		/*for(int i = 0; i < 10; i++) {
			System.out.printf("%d ", i+1);
		}*/
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>10) {
			System.out.print("제가 입력한 값은 10보다 큽니다");
		}
		
		else
			System.out.print("제가 입력한 값은 10보다 작습니다");
		
		
	}
		/*Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7 - i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

		System.out.println();
		
		//역별
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 6 - i; j++) {
				System.out.print(" ");

			}

			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}

			System.out.println();

		}
		
		System.out.println();
		
		//구구단
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++) {
				System.out.printf("%2d *%2d = %2d ", i+1, j+1, (i+1)*(j+1));
				if(j+1 == 9)
					System.out.println();
				
			}
		}
		
		System.out.println();
		
		//홀수의 합
		int sum = 0;
		for(int i = 0; i < 50; i++) {
			if((i+1)%2!=0) {
				System.out.printf("%d", i+1);
				System.out.println();
				sum += i+1;
			}			
		}
		System.out.printf("홀수의 합은 %d입니다.", sum);
		System.out.println();
		
		// 트리
		for (int l = 0; l < 11; l++) {
			for (int i = 0; i < 11-l; i++) {
				System.out.printf(" ");
			}

			for (int j = 0; j < 2 * l + 1; j++)
				System.out.printf("*");

			for (int k = 0; k < 11-l; k++) {
				System.out.printf(" ");
			}
			System.out.println();
		}
			
			
			for (int r = 0; r < 11; r++) {
					for (int i = 0; i < r+2; i++) {
						System.out.printf(" ");
					}

					for (int j = 0; j < 2 * (11-r)-3 ; j++)
						System.out.printf("*");
						
					for (int k = 0; k < r+2; k++) {
						System.out.printf(" ");
					}
					System.out.println();
					
				}
			
			
			//넓이 둘레 구하기
			Scanner input = new Scanner(System.in);
			int width = 0; int height =0;
			
			System.out.printf("가로 입력하세요 : ");
			width = input.nextInt();
			
			
			System.out.printf("세로 입력하세요 : ");
			height = input.nextInt();
			
			
			int area = area(width, height);
			int per = perimeter(width, height);
			
			
			System.out.printf("넓이 : %d\n", area);
			System.out.printf("둘레 : %d", per);

		}

	public static int perimeter(int width, int height) {
		int per = 2*(width + height);
		return per;
	}

	public static int area(int width, int height) {
		int area = width*height;
		return area;
	}*/
	
	

	}

