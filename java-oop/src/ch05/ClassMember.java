package ch05;

public class ClassMember {
	// 1. static : ClassMember 무관하고 공간과 이름만을 빌려다 쓰는 요소들
	// 1-1) static method
	public static void sFun() {
		System.out.println("sFun()");
	}
	// 1-2) static field
	public static int x = 1+1;
	
	public static int y = (int)Math.random(); // y 값이 랜덤값을

	public static int[] arr = null;
	
	// 1-3) static block
	static {
		for(int i = 0; i < ClassMember.arr.length; i++) {
			int rNum = (int)(Math.random() * 10) + 1;
			ClassMember.arr[i] = rNum;
		}
		
	}
	
	// 2. 생성자
	public ClassMember() {	// 없으면 기본형태로 자동으로 생성됨 (컴파일러)
		// 필드 초기화 코드가 없다면 자동으로 코드가 구현됨 (컴파일러)
		this.name = null;
	}
	
	public class InClass{ }			// 내부 클래스
	public enum InEnum{x,y,z}		// 내부 Enum
	public interface InInterface{}	// 내부 인터페이스
	public @interface InAnnotation{}// 내부 에노테이션
	
	
	// 3. 메서드
	public void fun() {
		System.out.println("fun()");
	}
	// ClassMember cm = new ClassMember(); cm.fun();
	
	// 4. 필드
	public String name;
}
