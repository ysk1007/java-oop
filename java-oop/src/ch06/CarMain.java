package ch06;

public class CarMain {

	public static void main(String[] args) {
		Car c = new Car(); 
		System.out.println(c.num); 
		System.out.println(c.is);
		
		
		Car c1 = new Car(11);
		System.out.println(c1.num);
		System.out.println(c1.is);
		
		Car c2 = new Car(true);
		System.out.println(c2.num);
		System.out.println(c2.is);
		
		Car c3 = new Car(1,true);
		System.out.println(c3.num);
		System.out.println(c3.is);
		
		c1.print();
		c2.print();
	}

}
