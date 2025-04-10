package ch14;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		
		Dog d = new Dog();
		p.withWork(d);
		
		Snake s = new Snake();
		p.withWork(s);
		
		Kangaroo k = new Kangaroo();
		p.withWork(k);
	}

}
