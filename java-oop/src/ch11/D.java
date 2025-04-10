package ch11;

public class D extends C {	// extends A -> extends C
	public int k;
	
	// A + C
	public D() {
		super();	// 부모 생성자 호출 C() -> A()
		
		// this..
		
		// A() : x, name, m1()
		// C() : z, m3()
		// D() : this.k
	}
	
	
	public static void main(String[] args) {
		D d = new D();
		d.name = "goodee";
		d.m1();
		d.x = 0;	// this.x 없음 -> super.x 없음 -> super.super.x 찾음
		d.z = 1;	// this.z 없음 -> super.z 찾음
		d.k = 2;	// this.k 찾음  

	}

}
