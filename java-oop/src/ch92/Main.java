package ch92;

public class Main {
	public void exe(Parent p) {
		p.work();
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		Parent p = new Parent();
		m.exe(p);
		
		Parent c = new Child();	// 다형성
		m.exe(c);
		
		m.exe(new Child());		// 다형성
		
		Parent p3 = new Parent() {	// 일회성 객체, 익명 객체 --> 클래스를 따로 만들 필요가 없음
			@Override
			void work() {
				System.out.println("밥 먹다");
			}
		};
		
		m.exe(p3);
		
		m.exe(new Parent(){			// 익명 객체의 변수를 만들 필요가 없다
			@Override
			void work() {
				System.out.println("간식 먹다");
			}
		});
	}
}

class Parent{
	void work() {
		System.out.println("일(직업)한다");
	}
}

class Child extends Parent{	// 부모(extends, implements) 자식 관계
	@Override
	void work() {
		System.out.println("공부한다");
	}
}
