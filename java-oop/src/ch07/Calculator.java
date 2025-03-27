package ch07;

public class Calculator {
	public boolean power;
	public int num;

	// this.num * (0.5 ~ 1.5)
	public double setRateNum(double rate) {
		if(!powerCheck()) return this.num;
		if(rate < 0.5 || rate > 1.5) {System.out.println("입력값 ERROR"); return this.num;}
		
		this.num *= rate;
		return this.num;
	}
	
	public Calculator() {
		this.power = false;
	}
	
	public void setPower() {
		this.power = !this.power;
	}
	
	public boolean powerCheck() {
		if(!this.power) System.out.println("계산기 OFF 상태");
		return this.power;
	}
	
	public void setNum(int num) {
		if(!powerCheck()) return;
		
		this.num = num;
	}
	
	// this.num이 짝수인지 홀수 인지 알고싶은 메서드
	public String checkNum() {
		if(!powerCheck()) return "ERROR";
		
		return num % 2 == 0 ? "짝수" : "홀수";
	}
	
	public int add(int a, int b) {
		if(!this.power) return 0;
		return a + b;
	}
	
	
}
