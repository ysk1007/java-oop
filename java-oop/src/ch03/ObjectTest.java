package ch03;

public class ObjectTest {
	
	public static void main(String[] args) {
		Car car;
		car = new Car();
		
		car.onOff = true;
		car.name = "로기";
		car.color = "초록";
		car.move();
		
		Car car2 = new Car();
		
		car2.onOff = false;
		car2.name = "라니";
		car2.color = "노랑";
		car2.move();
		
		Doctor doctor = new Doctor();
		doctor.person = new Person();
		doctor.person.name = "이국종";
		doctor.person.age = 33;
		doctor.person.phone = "01012435678";
		doctor.major = "내과";
		
		Doctor2 doctor2 = new Doctor2();
		doctor2.name = "마동석";
		doctor2.age = 44;
		doctor2.phone = "01099996666";
		doctor2.major = "물리치료";
	}
}
