package ex7.function;

public class Program1 {
	
	
	//정의영역
	public static void 메뉴입력(){
		//함수를 구현하는 몸통
		System.out.println("┌─────────────────────────────┐");
		
		System.out.println("│          \"메인 메뉴\"           │");
		System.out.println("└─────────────────────────────┘");
		System.out.printf("\t 1.성적 입력 \n");
		System.out.printf("\t 2.성적 출력 \n");
		System.out.printf("\t 3.종료 \n");
		
		System.out.printf("\t 선택 > ");
	}
	
	/*public static void 로또번호출력(int[] nums) {
		for (int i = 0; i < 6; i++) 
			System.out.printf("%3d", nums[i]);
		
	}*/
	
	
	
	public static void main(String[] args) {
		//반복시작
		//1. 메뉴 입력
		//2. 메뉴 1 - 성적입력
		//3. 메뉴 2 - 성적출력
		//4. 메뉴3 - 종료
		//반복끝
		
		//프로그램을 만들어본적이 있는 사람은 위와 같은 흐름을 자연어로 만들 수 있다!
		//위와 같은 거시적인 단위의 흐름을 만들게 되면 그 단위가 업무단위가 된다.
		//그 단위는 각 단위별로 나누어져서 만들어지거나
		//다음에도 다시 사용할 수 있는 단위가 되어야 할 것이다.
		//그런 것을 가능하게 하기 위해서는 여기서도 함수가 업무단위를 나누는 도구로 사용된다.

		//반복시작
		//1. 메뉴 입력
			메뉴입력();
			//로또번호출력();
		//위의 코드는 "메뉴입력()"이라는 함수가 있다고 가정하고 함수를 호출하고 있다.
		//하지만 우리는 이 함수가 없음을 안다. 우리가 이제 알아야 할 것은 업무단위를 함수로 정의하는 방법을 학습하는 것이다.
		//함수의 의미는 수학에서와 같다, 다만 수학에서 함수를 정의하는 방법과 
		//자바에서 함수 정의하는 방법이 다를 수 있다
			
		//2. 메뉴 1 - 성적입력
		//3. 메뉴 2 - 성적출력
		//4. 메뉴3 - 종료
		//반복끝
		
		//
				
	}

}
