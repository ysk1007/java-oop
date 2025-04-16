package ch101;

public class Main {

	public static void main(String[] args) {
		
		try {
			System.out.println("hello");	// 모든 코드는 예외를 발생 시킬 수 있다.
			System.out.println(1/0);
			System.out.println("bye");
		} catch (Exception e) {
			System.out.println("예외 발생");
			return;
			// e.printStackTrace();
			// 예외가 발생했을때 조치해야할 내용
		} finally {
			
		}
		
		try{ System.out.println(5/0);}
		catch(Exception e){ System.out.println("0으로 나눌 수 없다");}
	}

}
