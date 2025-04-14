package service;

public class Main {

	public static void main(String[] args) {
		ITv tv;
		tv = new SmartTv();
		
		// 부모타입 (클래스, 추상클래스, 인터페이스)
		// 에 자식객체를 대입 -> 다형성, DI
		tv.onOff();
		// ITv를 통해서 SmartTv의 onOff를 호출
		
		// 중간에 통신하는 접점역할(interface)을 없다면
		SmartTv stv = new SmartTv();
		stv.onOff();
	}
}
