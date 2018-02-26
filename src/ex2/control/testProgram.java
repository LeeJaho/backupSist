package ex2.control;

import java.io.IOException;
import java.util.Scanner;

public class testProgram {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int num = 0;

		System.out.println("┌─────────────────────────────┐");
		System.out.println("│          \"홀/짝\" 확인프로그램       │");
		System.out.println("└─────────────────────────────┘");
		System.out.printf("\t 숫자를 입력하세요 > ");
		num = input.nextInt();
		
		System.out.print("┌──────┐ ┌─────────────────────────────┐\n");
		System.out.print("│ 입력값  │ │          결과                              │\n");
		System.out.print("├──────┤ ├─────────────────────────────┤\n");
		// 짝수이면
		if (num % 2 == 0) {

		
			System.out.printf("│  %d    │ │          짝수                  │\n", num);

		}

		// 홀수이면
		else {
			
			System.out.printf("│  %d    │ │          홀수                  │\n", num);

		}

	}
}
