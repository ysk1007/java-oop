package ch07;

public class CalMain {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.power);	// false
		c.setPower();
		System.out.println(c.power);	// true
		
		c.setNum(5);
		System.out.println(c.checkNum());
		
		System.out.println(c.setRateNum(0.4));
		
		System.out.println(Integer.parseInt("4"));
		System.out.println(c.add(1,2));
	}
	
	
}
