package ex7.function;

import java.util.Random;

public class arrayProgram {
	

	
	
	public static void main(String[] args) {
		Random rand = new Random();
		int[] nums = new int[6];
		
		로또번호생성(nums);
		

		로또번호출력(nums);
		
		//같은지 검사
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 6; j++) {
				if ((nums[i] == nums[j])) {
					do {
						nums[i] = rand.nextInt(45) + 1;
					} while ((nums[i] == nums[j]));
				}
			}
		}
		System.out.println();
		로또번호출력(nums);
		
	}
	

	public static void 로또번호출력(int[] nums) {
		for (int i = 0; i < 6; i++) 
			System.out.printf("%3d", nums[i]);
	}
	
	public static void 로또번호생성(int[] nums) {
		Random rand = new Random();
		for (int i = 0; i < 6; i++) {
			nums[i] = rand.nextInt(45) + 1;
		}
		
	}
	

}
