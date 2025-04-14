package service;

public class CarMain {

	public static void main(String[] args) {
		
		// 서로 통신하는 접전역할은 interface가 아니어도 되는데?
		Car c = null;
		c = new NetflixCar();
		c = new SmartCar();
		c.on();
		
	}

}
