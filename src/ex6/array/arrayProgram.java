package ex6.array;

import java.util.Random;

public class arrayProgram {

	public static void main(String[] args) {
		/*Random rand = new Random();
		int[] nums = new int[6];

		for (int i = 0; i < 6; i++)
			nums[i] = rand.nextInt(45) + 1;
		
		for(int i = 0; i< 6; i++)
			System.out.printf("%3d", nums[i]);*/
		
		
		// - 중복을 제거 (같은 번호 나오지 않게)
		
		
		//문제1 - 첫번째(index 0)과 두번쨰(index 1)의 값을 서로 바꿔라!
		//-두 위치의 값을 바꾸는 절차
		//1. 임시공간 마련 
		//2. [0] -> 임시에다
		//3. [1] -> [0]에다
		//4. 임시 -> [1] 에다
		/*Random rand = new Random();
		int[] nums = new int[6];
		int box;
		
		for (int i = 0; i < 6; i++) {
			nums[i] = rand.nextInt(45) + 1;
		}
		
		for(int i = 0; i< 6; i++) {
			System.out.printf("%3d", nums[i]);
		}
		
		if(nums[0]>=nums[1]) {
			box = nums[0];
			nums[0] = nums[1];
			nums[1] = box;
		}
		
		System.out.println();
		
		for(int i = 0; i< 6; i++)
			System.out.printf("%3d", nums[i]);*/
		
		
		//숙제1 - 만약 1번째가 2번째보다 크다면 1번째와 2번째 공간의 값을 바꾼다 -> 5번째까지
		/*Random rand = new Random();
		int[] nums = new int[6];
		int box;
		
		for (int i = 0; i < 6; i++) {
			nums[i] = rand.nextInt(45) + 1;
		}
		
		for(int i = 0; i< 6; i++) {
			System.out.printf("%3d", nums[i]);
		}
		
		if(nums[0]>=nums[1]) {
			box = nums[0];
			nums[0] = nums[1];
			nums[1] = box;
		}
		
		if(nums[1]>=nums[2]) {
			box = nums[1];
			nums[1] = nums[2];
			nums[2] = box;
		}
		
		if(nums[2]>=nums[3]) {
			box = nums[2];
			nums[2] = nums[3];
			nums[3] = box;
		}
		
		if(nums[3]>=nums[4]) {
			box = nums[3];
			nums[3] = nums[4];
			nums[4] = box;
		}
		
		if(nums[4]>=nums[5]) {
			box = nums[4];
			nums[4] = nums[5];
			nums[5] = box;
		}
		
		System.out.println();
		
		for(int i = 0; i< 6; i++)
			System.out.printf("%3d", nums[i]);*/
		
		//숙제2 - 제일 큰 왕초 찾기 반복
		/*Random rand = new Random();
		int[] nums = new int[6];
		int box;
		
		for (int i = 0; i < 6; i++) {
			nums[i] = rand.nextInt(45) + 1;
		}
		
		for(int i = 0; i< 6; i++) {
			System.out.printf("%3d", nums[i]);
		}
		
		for(int i = 0; i < 5; i++) {
		if(nums[i]>=nums[i+1]) {
			box = nums[i];
			nums[i] = nums[i+1];
			nums[i+1] = box;
			}
		}
		System.out.println();
		
		for(int i = 0; i< 6; i++)
			System.out.printf("%3d", nums[i]);*/
		
		//숙제3 - 위의 코드를 반복 중첩 -> 내부 for문의 반복 횟수가 반복할 때마다 5->4->3->2 씩 반복횟수가 줄도록 하세요
		//for int i = 0; i <5; i++)
		// for int j = 0; j < 이부분이 내부반복횟수 ; j++)
		/*Random rand = new Random();
		int[] nums = new int[6];
		int box;

		for (int i = 0; i < 6; i++) {
			nums[i] = rand.nextInt(45) + 1;
		}

		for (int i = 0; i < 6; i++) {
			System.out.printf("%3d", nums[i]);
		}

		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 5 - i; j++) {
				if (nums[j] >= nums[j + 1]) {
					box = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = box;
				}
			}
		System.out.println();

		for (int i = 0; i < 6; i++)
			System.out.printf("%3d", nums[i]);*/
		
		
		// 문제4 - 중복을 제거 (같은 번호 나오지 않게)
		Random rand = new Random();
		int[] nums = new int[6];
		//int box;

		//배열에 담기
		for (int i = 0; i < 6; i++) {
			nums[i] = rand.nextInt(45) + 1;
		}
		
		//출력
		for (int i = 0; i < 6; i++) {
			System.out.printf("%3d", nums[i]);
		}
		
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
		for (int i = 0; i < 6; i++) {
			System.out.printf("%3d", nums[i]);
		}
		
	}
	

}
