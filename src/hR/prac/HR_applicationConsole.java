package hR.prac;

import java.util.Scanner;

public class HR_applicationConsole {

	private HR_application apply;
	
	
	public HR_applicationConsole() {
		apply = new HR_application();
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		String name;
		float credit, self;
		int lang;
		
		//input
		System.out.println("<인사점수 등록>\n");
		
		//input name
		System.out.print("이름 : ");
		name = scan.next();
		apply.setName(name);
		
		//input credit
		do {
			System.out.print("학점 : ");
			credit = scan.nextFloat();
			if(credit < 0.0f || credit > 4.5f)
				System.out.print("0 ~ 4.5 사이 값을 입력해주세요\n");
		}while(credit < 0.0f || credit > 4.5f);
		apply.setCredit(credit);
		
		//input lang
		do {
			System.out.print("어학 : ");
			lang = scan.nextInt();
			if(lang < 0 || lang > 990)
				System.out.print("0 ~ 990 사이 값을 입력해주세요\n");
		}while(lang < 0 || lang > 990);
		apply.setLang(lang);
		
		//input self
		do {
			System.out.print("자소서 : ");
			self = scan.nextFloat();
			if(self < 0 || self > 990)
				System.out.print("0 ~ 100 사이 값을 입력해주세요\n");
		}while(self < 0 || self > 100);
		apply.setSelf(self);
		
		System.out.println();
		
	}
	
	
	public void output() {
		System.out.println("<인사 등록 명단 정보>");
		
		String name = apply.getName();
		System.out.printf("이름 : %s\n", name);
		
		float credit = apply.getCredit();
		float creditScore = apply.creditResult();
		System.out.printf("학점 : %.2f / 학점 환산점수 : %.2f\n", credit, creditScore);
		
		int lang = apply.getLang();
		float langScore = apply.langResult();
		System.out.printf("어학 : %d / 어학 환산점수 : %.2f\n", lang, langScore);
		
		float self = apply.getSelf();
		float selfScore = apply.selfResult();
		System.out.printf("자소서 : %.2f / 자소서 환산점수 : %.2f\n", self, selfScore);
		
		float totalScore = apply.totalResult();
		boolean PF = apply.PassFail();
		if(PF == false)
			System.out.printf("총 환산점수 : %.2f /  합격여부 : 불합격", totalScore);
		else
			System.out.printf("총 환산점수 : %.2f /  합격여부 : 합격", totalScore);
		
		
		
	}
}
