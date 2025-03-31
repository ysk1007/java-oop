package ch09;

import java.util.ArrayList;
import java.util.HashMap;

public class MethodEx2 {
	
	// 반환타입 : Map
	// 매개타입 : Student
	public HashMap<String, Object> m9a(Student s){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("name", s.name);
		map.put("num", s.num);
		return map;
	}
	
	// 반환타입 : List<String>
	// 매개타입 : 임의의 개수의 문자열
	public ArrayList<String> m8a(String ...name){
		ArrayList<String> result = new ArrayList<String>();
		
		for(String s : name) {
			result.add(s);
		}
		
		return result;
	}
	
	// 반환타입 : Student[]
	// 매개타입 : List<Map>
	public Student[] m7a(ArrayList<HashMap<String,Object>> list) {
		Student[] arr = new Student[list.size()];
		int i = 0;
		for(HashMap<String, Object> m : list) {
			arr[i] = new Student();
			arr[i].num = (Integer)m.get("num");
			arr[i].name = (String)m.get("name");
			i++;
		}
		return arr;
	}
	
	
	// 반환타입 : 클래스
	// 매개타입 : int, String
	public Student m6a(int num, String name) {
		Student s = new Student();
		s.name = name;
		s.num = num;
		return s;
	}
	
	// 반환타입 : 배열
	// 매개타입 : int
	// 252 -> {2, 5, 2}
	public int[] m5a(int num) {	// 나누기 연산
		int[] arr = new int[(int)Math.log10(num) + 1];

		int i = arr.length - 1;
		while(num>0) {
			arr[i] = num % 10;
			num /= 10;
			i--;
		}
		
		return arr;
	}

	// 252 -> {"2", "5", "2"}
	public String[] m5b(int num) {	// substring() 메서드
		String str = Integer.toString(num);
		String[] arr = new String[str.length()];

		for(int i = 0 ; i < str.length(); i++) {
			if(i == str.length()) break;
			arr[i] = str.substring(i,i+1);
		}
		
		return arr;
	}
	
	
	// 반환타입 : 배열
	// 매개타입 : List
	// List를 입력 받아서 배열로 변경하여 반환
	public int[] m4a(ArrayList<String> list) {
		int[] result = new int[list.size()];
		int i = 0;
		
		for(String s : list) {
			result[i] = Integer.parseInt(s);
			i++;
		}
		
		return result;
	}

	// 반환타입 : boolean
	// 매개타입 : 클래스 두개
	public boolean m24c(Student s1, Student s2) {
		boolean result = false;
		
		// s1, s2를 비교하는 코드
		if(s1.name == s2.name && s1.num == s2.num) {
			result = true;
		}
		
		return result;
	}
	
	// Student타입을 디버깅한 문자열을 반환하는 메서드
	// 반환타입 : String
	// 매개변수 : 클래스 하나
	public String m25a(Student s){
		String result = "";
		
		// s변수를 디버깅 < 로깅
		result = "s : " + s.num +", "+ s.name;
		
		return result;	// 번호는 ?이고 이름은 ? 입니다.
	}
	
	
	// 반환타입 숫자
	// 매개타입 배열 : 배열
	// 배열.length API 금지!
	// 배열을 입력하면 반환값으로 배열의 길이 반환
	public int m24b(int[] arr) {
		int result = 0;
		
		while(true) {
			try {
				int temp = arr[result];
			}
			catch(Exception e) {
				break;
			}
			result++;
		}
		
		
		
		
		return result;
	}
	
	// 반환타입 숫자
	// 매개타입 배열 : 배열
	// 배열.length API 금지!
	// 배열을 입력하면 반환값으로 배열의 길이 반환
	public int m24(int[] arr) { // ex) int x = new int[7]
		int result = 0;
		
		for(var v : arr) {
			result++;
		}

		return result;
	}
	
}
