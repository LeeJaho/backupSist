import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		Random ranLotto = new Random();
		int num1, num2, num3, num4, num5, num6, bonus;
		num1 = ranLotto.nextInt(45)+1;
		num2 = ranLotto.nextInt(45)+1;
		num3 = ranLotto.nextInt(45)+1;
		num4 = ranLotto.nextInt(45)+1;
		num5 = ranLotto.nextInt(45)+1;
		num6 = ranLotto.nextInt(45)+1;
		bonus = ranLotto.nextInt(45)+1;
		System.out.println();
		
		
		
		System.out.println("┌──────────────────────────────┐");
		System.out.println("│      \"내 Lotto 번호 출력\"        │");
		System.out.println("└──────────────────────────────┘");
		
		System.out.print("┌──────┐ ┌─────────────────────────────┐\n");
		System.out.print("│ 인덱스  │ │          로또 번호                              │\n");
		System.out.print("├──────┤ ├─────────────────────────────┤\n");
		System.out.print("│      │ │                             │\n");
		System.out.printf("│  1   │ │ %d  %d  %d  %d  %d  %d  %d   │",
								num1 ,num2, num3, num4, num5, num6, bonus);
		System.out.println();
		System.out.print("└──────┘ └─────────────────────────────┘\n");
		
		
	}

}
