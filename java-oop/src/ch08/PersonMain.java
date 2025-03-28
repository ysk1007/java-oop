package ch08;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person("admin","1234");
		
		p.m11();	// Hello
		p.hw11();	// Good Morning
		
		p.m12(9);	// AM
		Calendar c = Calendar.getInstance();
		int h = c.get(Calendar.HOUR);
		p.m12(h);
		
		// 1-2
		p.hw12(false);	// flag = false
		// 매개변수로 값이 전달
		boolean x = false;
		p.hw12(x);	// flag = false
		System.out.println(x);	// false
		
		// 1-3
		p.m13a("나이스");	// 홀수
		String name = "야호야호";
		p.m13a(name);	// 짝수
		
		p.m13b("admin","1234");
		p.m13b("guest","1233");
		
		// 1-4
		int[] arr = new int[5];
		
		p.m14a(arr);
		
		// 1-5
		Data data = new Data(5,5);
		p.m15a(data);
		System.out.println("\n"+data.x);
		System.out.println(data.y);
		
		String[] names = new String[2];
		names[0] = "호날두";
		names[1] = "메시";
		p.m15(names);
		
		// 1-6
		Data[] datas = new Data[4];
		datas[0] = new Data(13,100);
		datas[1] = new Data(23,200);
		datas[2] = new Data(20,300);
		datas[3] = new Data(39,400);
		p.m16a(datas);
		p.m16b(datas, 300);
		
		// 1-7
		ArrayList<Integer> year = new ArrayList<Integer>();
		
		int y = 2000;
		for(int i = 0 ; i <= 50 ; i++) {
			year.add(y + i);
		}
		
		p.m17a(year);
	
		// 1-8
		String[] hobbys = new String[2];
		hobbys[0] = "축구";
		hobbys[1] = "농구";
		Data myData = new Data(10,7);
		HashMap<String, Object> map = new HashMap<String,Object>();
		map.put("name", "ysk");
		map.put("age", 25);
		map.put("hobby", hobbys);
		map.put("data", myData);
		p.m18a(map);
	}
}
