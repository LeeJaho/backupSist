package ex5.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class fileProgram {

	public static void main(String[] args) throws IOException {
		//FileInputStream textFile = new FileInputStream("C:\\test.txt");
		FileInputStream textFile = new FileInputStream("res/test.txt");
		

		Scanner fileScanner = new Scanner(textFile);

		
		  //
		/*  System.out.printf("%d %d %d\n " , fileScanner.nextInt(),
		  fileScanner.nextInt(), fileScanner.nextInt()); 
		  int num = 0; 
		  for(int i = 0 ; i < 3; i++) { 
		  num = fileScanner.nextInt();
		  System.out.printf("%d ", num); 
		  
		  }
		  textFile.close(); System.out.println("완료");*/
		 
		
		// 문제 1 - 데이터의 총합을 구해서 출력하는 코드를 작성하세요
		/*int sum = 0;
		for (int i = 0; i < 3; i++) {
			int num = fileScanner.nextInt();
			System.out.printf("%d ", num);
			sum += num;
		}
		System.out.println();
		System.out.printf("%d", sum);
		
		*/
		
		//문제2 - 3번 반복으로 한정하는 것은 유연성을 떨어뜨린다.
		/*int sum = 0;
		while(fileScanner.hasNext()) {
			int num = fileScanner.nextInt();
			System.out.printf("%d ", num);
				sum += num;
		}
		
		System.out.println();
		System.out.printf("%d", sum);
		
		textFile.close();*/
		
		//문제3 - 50이하의 수만 더한다
		/*int sum = 0;
		while(fileScanner.hasNext()) {
			int num = fileScanner.nextInt();
			System.out.printf("%d ", num);
			if(num<=50)
				sum += num;
		}
		
		System.out.println();
		System.out.printf("%d", sum);*/
		
		//문제4 - 70을 만날 때까지 합을 구하시오
		/*int sum = 0;
		while(fileScanner.hasNext()) {
			int num = fileScanner.nextInt();
			System.out.printf("%d ", num);
			if(num==70)
				break;
			//else
				sum += num;
		}
		
		System.out.println();
		System.out.printf("%d", sum);*/
		
		//문제5 - 70을 만나기 전까지는 모두 skip 하도록 하시오
		int sum = 0;
		int check = 0;
		while(fileScanner.hasNext()) {
			int num = fileScanner.nextInt();
			System.out.printf("%d ", num);
			if(check==0 && num!=70)
				//밖으로 나가라 while로 다시 위로
				continue;
			
			check++;
			sum += num;
		}
		
		System.out.println();
		System.out.printf("%d", sum);
		textFile.close();
		
	}

}

