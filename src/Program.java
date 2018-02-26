class Program{
	public static void main(String[] args){

	int kor; 
	int eng;
	int math;
	int total;
	float avg;
	System.out.println();
	

	kor = 60;
	eng = 70;
	math = 80;

	total = kor + eng + math;
	avg = total/3.0f;
	
	System.out.printf("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
	System.out.printf("성적 출력\n");
	System.out.printf("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");

	
	  

	System.out.printf("국어 : %d\n", kor);
	System.out.printf("영어 : %d\n", eng);
	System.out.printf("수학 : %d\n\n", math);
	
	System.out.printf("총점 : %d\n", total);
	System.out.printf("평균 : %f\n", avg);

	}
}