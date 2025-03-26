package ch02;

public class EnumTest {
	public static void main(String[] args) {
		char gender = 'F';
		
		if(gender == 'M') {
			System.out.println("남자");
		}
		else if(gender == 'F') {
			System.out.println("여자");
		}
		else{
			System.out.println("잘못된 값입니다");
		}
		
		// Eneum 사용시 잘못된 값이 대입될 수 없다.
		// if보다 switch가 가독성이 높을 수도 있다
		Gender g = null;
		g = Gender.FEMALE;                                                                                                                                                      
		
		switch(g) {
			case Gender.MALE:	System.out.println("남자");	break;
			case Gender.FEMALE:	System.out.println("여자");	break;
		}
		
	}

}
