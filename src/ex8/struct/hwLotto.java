package ex8.struct;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class hwLotto {

	public static void main(String[] args) throws IOException {
		
		Random rand = new Random();
		int[] myNums = new int[7];
		int[] nums = new int[7];
		int enter, menu, secMenu;

		to_end: 
		while (true) {
			menu = 첫번째메뉴입력();
			로또번호생성(nums);
			
			to_menu1: 
			switch (menu) {
				case 1:// 메뉴1 - 1
				secMenu = 두번째메뉴입력();
				
				to_result: 
				while (true) {
					switch (secMenu) {
					case 1:
						로또번호입력(myNums);
						로또번호출력(myNums);
						break to_menu1;
					case 2:
						enter = 로또번호출력(nums);
						if (enter == 13)
							break to_menu1;
						// 엔터누를 시 돌아간다

					case 3:
						break to_menu1;

					default:
						경고사항();
						break to_result;
					}
				}
				

			case 2:// 메뉴1 - 2
				경고사항();
				break;

			case 3:// 메뉴1 - 3
				break to_end; // break 안써도 됨

			default:// 메뉴1 - 4
				경고사항();
				break;

			}
		}

		// 같은지 검사
		/*
		 * for (int i = 0; i < 5; i++) { for (int j = i + 1; j < 6; j++) { if ((nums[i]
		 * == nums[j])) { do { nums[i] = rand.nextInt(45) + 1; } while ((nums[i] ==
		 * nums[j])); } } } System.out.println(); 로또번호출력(nums);
		 */

	}


	public static int 첫번째메뉴입력() {
		Scanner input = new Scanner(System.in);

		System.out.println("┌─────────────────────────────┐");
		System.out.println("│          \"로또 자동 판매기\"       │");
		System.out.println("└─────────────────────────────┘");
		System.out.printf("\t 1.로또 구매하기 \n");
		System.out.printf("\t 2.당첨번호 확인 \n");
		System.out.printf("\t 3.종료 \n");

		System.out.printf("\t 선택 > ");
		int menu = input.nextInt();

		return menu;
	}

	public static int 두번째메뉴입력() {
		Scanner input = new Scanner(System.in);

		System.out.println("┌─────────────────────────────┐");
		System.out.println("│          \"로또 자동 판매기\"       │");
		System.out.println("└─────────────────────────────┘");
		System.out.printf("\t 1.수동 \n");
		System.out.printf("\t 2.자동 \n");
		System.out.printf("\t 3.취소 \n");

		System.out.printf("\t 선택 > ");
		int secMenu = input.nextInt();

		return secMenu;
	}

	public static int 로또번호출력(int[] nums) throws IOException {

		System.out.println("┌──────────────────────────────┐");
		System.out.println("│      \"내 Lotto 번호 출력\"        │");
		System.out.println("└──────────────────────────────┘");

		System.out.print("┌──────┐ ┌─────────────────────────────┐\n");
		System.out.print("│ 인덱스  │ │          로또 번호                              │\n");
		System.out.print("├──────┤ ├─────────────────────────────┤\n");
		System.out.print("│      │ │                             │\n");
		System.out.print("│   1  │ │");
									for (int i = 0; i < 7; i++)
										System.out.printf("%3d", nums[i]);
		System.out.print("         │\n");
		System.out.print("└──────┘ └─────────────────────────────┘\n");

		System.out.println();
		System.out.printf("\t메인 메뉴로 가기 : Enter\n");

		int enter = System.in.read();
		return enter;
	}
	
	public static void 로또번호입력(int[] myNums) {
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 7; i++)
			myNums[i] = input.nextInt();		
	}
	
	public static void 로또번호생성(int[] nums) {
		Random rand = new Random();

		for (int i = 0; i < 6; i++) {
			for (int j = i + 1; j < 7; j++) {
				if ((nums[i] == nums[j])) {
					do {
						nums[i] = rand.nextInt(45) + 1;
					} while ((nums[i] == nums[j]));
				}
			}
		}
	}

	
	public static void 경고사항() {
		System.out.println("\t메뉴의 범위를 벗어났습니다.");
	}

}


