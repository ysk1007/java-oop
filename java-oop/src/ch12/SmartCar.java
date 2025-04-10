package ch12;

public class SmartCar extends Car{
	//Object:super > Car : super
	public String display;
	public String color = "파란색";
	public SmartCar() {
		super();	// super.color = null;
		this.display = null;
		
	}
	
	@Override
	public void onOff() {
		System.out.println("버턴 사용");
	}
	
	public void print() {
		System.out.println(super.color);
		System.out.println(this.color);
		System.out.println(color);
	}
	
	
	
	public static void main(String[] args) {
		SmartCar sc = new SmartCar();
		// sc.display = "삼성"; // this
		// sc.oclor = "빨간색"; // super
		System.out.println(sc.display);
		System.out.println(sc.color);
		sc.onOff();	// super
		sc.print();
		
		Car c = (Car)(new SmartCar());
		c.onOff(); // super
		if(c instanceof SmartCar) {
			((SmartCar)c).print();
		}
		
		String s = new String();
		//((SmartCar)s).print();
		
		Car c2 = new Car();
		if(c2 instanceof SmartCar) {
			((SmartCar)c2).print();
		}
		
		sc.onOff();
	}
}
