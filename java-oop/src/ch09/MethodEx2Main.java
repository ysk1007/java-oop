package ch09;

import java.util.ArrayList;
import java.util.HashMap;

public class MethodEx2Main {

	public static void main(String[] args) {
		MethodEx2 m2 = new MethodEx2();
		int[] x = new int[7];
		System.out.println(m2.m24(x));
		System.out.println(m2.m24b(x));
		
		Student s = new Student();
		s.num = 2;
		s.name = "손흥민";
		
		Student s2 = new Student();
		s2.num = 3;
		s2.name = "봉준호";
		
		Student s3 = new Student();
		s3.num = 3;
		s3.name = "봉준호";
		
		// s변수를 디버깅 < 로깅
		System.out.println(m2.m25a(s));
		System.out.println(m2.m25a(s2));
		
		// Student 변수를 비교하는 메소드
		System.out.println(s2==s3);				// false
		System.out.println(s2.equals(s3));		// false
		
		System.out.println(m2.m24c(s2, s3));	// true
		System.out.println(m2.m24c(s2, s));		// false
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("101");
		list.add("200");
		list.add("999");
		int[] result = m2.m4a(list);
		for(int n : result) {
			System.out.println(n);
		}
		
		String[] rs = m2.m5b(1004);
		for(String str : rs) {
			System.out.println(str);
		}
		
		Student s4 = m2.m6a(3, "제이팍");
		
		ArrayList<HashMap<String,Object>> hashList = new ArrayList<HashMap<String,Object>>();
		HashMap<String,Object> m1 = new HashMap<String,Object>();
		m1.put("name", "김연아");
		m1.put("num", 4);
		
		HashMap<String,Object> m3 = new HashMap<String,Object>();
		m3.put("name", "BTS");
		m3.put("num", 5);
		
		hashList.addFirst(m1);
		hashList.addFirst(m3);
		Student[] arr = m2.m7a(hashList);
		for(Student st : arr) {
			System.out.println(m2.m25a(st));
		}
		
		ArrayList<String> strList = m2.m8a("박지성","차두리","조현우");
		for(String str : strList) {
			System.out.println(str);
		}
		
		Student s9 = new Student();
		s9.num = 99;
		s9.name = "구구";
		HashMap<String, Object> map9 = m2.m9a(s9);
		System.out.println(map9.get("num"));
		System.out.println(map9.get("name"));
		
		int[] numArr = m2.m5a(1577);
		for(int i : numArr) {
			System.out.print(i + " ");
		}
	}

}
