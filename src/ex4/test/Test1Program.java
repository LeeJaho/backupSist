package ex4.test;

public class Test1Program {

	public static void main(String[] args) {

		// 문제1
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d", 1);
			System.out.println();
		}

		// 문제2
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d", i + 1);
			System.out.println();
		}
		// 문제3
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d", 10 - i);
			System.out.println();
		}

		// 문제4
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++)
				System.out.printf("%d", j + 1);

		}

		// 숙제1
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%d", j + 1);
			}

			System.out.println();
		}

		// 숙제2
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%3d ", (10 * i) + (j + 1));
			}
			System.out.println();
		}

		// 0102 문제1 - 1 홀수 위치에 [] 출력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				//(10*i) + (j+1) -> j로 뒷자리만 검사해도 된다
				if (((10 * i) + (j + 1)) % 2 != 0)
					System.out.printf("[]");
				else
					System.out.printf("%3d ", (10 * i) + (j + 1));
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 문제2 - 홀수이면 3배수 위치에 별(*) 위치 // 순서 기억하기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if (((10 * i) + (j + 1)) % 2 != 0 && ((10 * i) + (j + 1)) % 3 ==0)
					System.out.printf("*");
				else if (((10 * i) + (j + 1)) % 2 !=0 )
					System.out.printf("[]");
				else
					System.out.printf("%3d ", (10 * i) + (j + 1));
			}
			System.out.println();
		}
		
		

	}

}
