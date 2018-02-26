package ex6.array;

public class starProgram {

	public static void main(String[] args) {
		//board라는 이름으로 정수 30개의 배열을 마련해주세연
		//int[] board = new int[30];
		//board라는 이름으로 문자형식 30개짜리 배열을 마련해라!
		//char[] board = new char[30];
		char [][] board = new char[10][10];
		
		//board의 모든 공간에 ┼ 문자를 입력하시오
		/*for(int i = 0; i < 30; i++)
			board[i] = '┼';*/
		for(int y = 0; y < 10; y++)
			for(int x = 0; x < 10; x++)
				board[y][x] = '┼';
		
		
		
		//5개씩 끊어서 내려쓰기를 포함하시오
		/*for(int i = 0; i < 6; i++) {
			for(int j = i*5; j < (i+1)*5; j++) {
				System.out.printf("%c", board[j]);	
			}
			System.out.println();
		}*/
		
		//문제의도 -> if를 통해서 for문 하나만 돌리기
		/*for(int i = 0; i < 30; i++) {
			int num = i + 1;
			System.out.printf("%c", board[i]);
			
			if(num%5==0)
				System.out.println();
		}
		
		System.out.println();*/
		
		//문제의도 -> if를 통해서 for문 하나만 돌리기
		/*for(int i = 0; i < 30; i++) {
			int num = i + 1;
			
			if(num%6==1) {
				board[num-1] = '○';
			}
			
			System.out.printf("%c", board[i]);
			
			if(num%5==0)
				System.out.println();
		}*/
		
		/*for(int i = 0, n = 1; i < 30; i++) {
			int num = i + 1;
			int an = 1+(n-1)*6;
			if(an == num) {
				System.out.printf("○");
				n++;
			}
			else
			System.out.printf("%c", board[i]);
			
			if(num%5==0)
				System.out.println();
		}*/
		
		//문제의도 -> if를 통해서 for문 하나만 돌리기
		
		/*for(int i = 0, n = 1; i < 30; i++) {
			int num = i + 1;
			int an = 1+(n-1)*6;
			if(an == num) {
				board[num-1] = '○';
				n++;
			}
		}*/
		
		//배열 안에 값을 넣는다 바꾼다
		/*for(int i = 0; i < 5; i++) {
			board[6*i] = '○';
		}*/
		//int x = 3;
		//int y = 4;
		//board[4][3] = '○';
		//board[(x-1) + (y-1)*5] = '○';
		
		//역삼각형
		/*for(int y = 1; y <= 6; y++){
			for(int x = 1; x <= 5; x++)
				if((x<=3) && (y == x || y == -x+6))
					board[y-1][x-1] ='○';
		}*/
		
		//원만들기 숙제
		for(int y = 0; y < 10; y++){
			for(int x = 0; x < 10; x++)
				if(((x-4)*(x-4) == y) || -((x-4)*(x-4))+10 == y)
					board[y][x] ='○';
		}
		
//------------------출력코드--------------------------------------------------------------------------------------
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
				System.out.printf("%c", board[y][x]);
			}
			System.out.println();
		}
	}

}
