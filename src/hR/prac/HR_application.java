package hR.prac;

public class HR_application {
	String name;
	float credit, self;
	int lang;
	float creditWeight, langWeight, selfWeight;
	float PFcheck;
	
	public HR_application() {
		this.name = null;
		
		this.credit = 0.0f;
		this.lang = 0;
		this.self = 0.0f;
		
		this.creditWeight = 0.33f;
		this.langWeight = 0.33f;
		this.selfWeight = 0.33f;
		
		this.PFcheck = 80.0f;
	}

	//학점 점수 계산
	public float creditResult() {
		float credit = this.credit;
		float creditChange = 0;
		
		if(0 < credit && credit < 2.5f)
			creditChange = 60;
		else if(2.5f <= credit && credit < 3.2f)
			creditChange = 70;
		else if(3.2f <= credit && credit < 3.7f)
			creditChange = 80;
		else if(3.7f <= credit && credit < 4.3f)
			creditChange = 90;
		else if(4.3f <= credit && credit <= 4.5f)
			creditChange = 100;
		
		float creditWeight = this.creditWeight;
		float result = creditChange * creditWeight;
		
		return result;
	}
	
	//어학 점수 계산
	public float langResult() {
		int lang = this.lang;
		float langChange = 0;
		if(0 < lang && lang < 500)
			langChange = 60;
		else if(500 <= lang && lang < 700)
			langChange = 70;
		else if(700 <= lang && lang < 800)
			langChange = 80;
		else if(800 <= lang && lang < 900)
			langChange = 90;
		else if(900 <= lang && lang <= 990)
			langChange = 100;
		
		float langWeight = this.langWeight;
		float result = langChange * langWeight;
		
		return result;
	}
	
	//자소서 점수 계산
	public float selfResult() {
		float self = this.self;
		float selfWeight = this.selfWeight;
		float result = self * selfWeight;
		
		return result;
	}
	
	//총합
	public float totalResult() {
		float creditScore = creditResult();
		float langScore = langResult();
		float selfScore = selfResult();
		float total = creditScore + langScore + selfScore;
		
		return total;
	}
	
	//합격 불합격 여부
	public boolean PassFail() {
		boolean PF = true;
		float PFcheck = this.PFcheck;
		float total = totalResult();
		
		if(total < PFcheck)
			PF = false;
		
		return PF;
	}
	
	//Getter Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}

	public int getLang() {
		return lang;
	}

	public void setLang(int lang) {
		this.lang = lang;
	}

	public float getSelf() {
		return self;
	}

	public void setSelf(float self) {
		this.self = self;
	}

	public float getCreditWeight() {
		return creditWeight;
	}

	public void setCreditWeight(float creditWeight) {
		this.creditWeight = creditWeight;
	}

	public float getLangWeight() {
		return langWeight;
	}

	public void setLangWeight(float langWeight) {
		this.langWeight = langWeight;
	}

	public float getSelfWeight() {
		return selfWeight;
	}

	public void setSelfWeight(float selfWeight) {
		this.selfWeight = selfWeight;
	}
	
	
}
