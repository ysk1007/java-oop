package ch82;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		Car c = new Car();
		ITire frontRightTire = new HankookTire(); 
		ITire frontLeftTire = new HankookTire();
		ITire backLeftTire = new NexenTire();
		ITire backRightTire = new KumhoTire();
		
		c.list = new ArrayList<ITire>();
		
		c.list.add(frontRightTire);
		c.list.add(frontLeftTire);
		c.list.add(backLeftTire);
		c.list.add(backRightTire);
		
		c.move();
	}

}
