package ex2.control;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class LottoHw {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		Random ranLotto = new Random();

		int firstMenu = 0;
		int secondMenu = 0;

		int enter;
		int num1, num2, num3, num4, num5, num6, bonus;

		to_end: while (true) {

			num1 = ranLotto.nextInt(45) + 1;
			num2 = ranLotto.nextInt(45) + 1;
			num3 = ranLotto.nextInt(45) + 1;
			num4 = ranLotto.nextInt(45) + 1;
			num5 = ranLotto.nextInt(45) + 1;
			num6 = ranLotto.nextInt(45) + 1;
			bonus = ranLotto.nextInt(45) + 1;

			System.out.println("┌─────────────────────────────┐");
			System.out.println("│          \"로또 자동 판매기\"       │");
			System.out.println("└─────────────────────────────┘");
			System.out.printf("\t 1.로또 구매하기 \n");
			System.out.printf("\t 2.당첨번호 확인 \n");
			System.out.printf("\t 3.종료 \n");

			System.out.printf("\t 선택 > ");
			firstMenu = input.nextInt(); // 첫번째 메뉴

			to_menu1: switch (firstMenu) {
			case 1:// 메뉴1 - 1
				System.out.println("┌─────────────────────────────┐");
				System.out.println("│          \"로또 자동 판매기\"       │");
				System.out.println("└─────────────────────────────┘");
				System.out.printf("\t 1.수동 \n");
				System.out.printf("\t 2.자동 \n");
				System.out.printf("\t 3.취소 \n");

				System.out.printf("\t 선택 > ");
				secondMenu = input.nextInt();

				to_result: while (true) {
					switch (secondMenu) {
					case 1:
						break to_end;

					case 2:
						System.out.println("┌──────────────────────────────┐");
						System.out.println("│      \"내 Lotto 번호 출력\"        │");
						System.out.println("└──────────────────────────────┘");

						System.out.print("┌──────┐ ┌─────────────────────────────┐\n");
						System.out.print("│ 인덱스  │ │          로또 번호                              │\n");
						System.out.print("├──────┤ ├─────────────────────────────┤\n");
						System.out.print("│      │ │                             │\n");
						System.out.printf("│  1   │ │ %3d %3d %3d %3d %3d %3d %3d │", num1, num2, num3, num4, num5,
								num6, bonus);
						System.out.println();
						System.out.print("└──────┘ └─────────────────────────────┘\n");

						System.out.println();
						System.out.printf("\t메인 메뉴로 가기 : Enter\n");

						enter = System.in.read();

						if (enter == 13) {
							break to_menu1;
						}

					case 3:
						break to_end;

					default:
						System.out.println("\t메뉴의 범위를 벗어났습니다.");
						break to_result;
					}
				}

			case 2:// 메뉴1 - 2
				System.out.println("\t아직 준비 안됐습니다.");
				break;

			case 3:// 메뉴1 - 3
				break to_end; // break 안써도 됨

			default:// 메뉴1 - 4
				System.out.println("\t메뉴의 범위를 벗어났습니다.");
				break;
			}
		}
	}
}
