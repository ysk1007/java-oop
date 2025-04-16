package ch92;

public class Main2 {

	public static void main(String[] args) {
		Main2 m = new Main2();
		
		// 람다식
		m.exe((String name)->System.out.println(name + "일하다"));	// 기능만 넘길때 사용한느 문법 - 람다(Lambda)
	}

	public void exe(IParent parent) {
		parent.work("구디");
	}
}

@FunctionalInterface	// 함수형 인터페이스(함수는 하나만 가져야 함)
interface IParent{			
	public abstract void work(String name);
	//public abstract void work2();
}