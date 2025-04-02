package ch10;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import dto.Actor;

public class JDBCMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 1) 키보드를 통해 매개값 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("firstName을 입력하세요: ");
		String firstName = scanner.nextLine();
		System.out.println("lastName을 입력하세요: ");
		String lastName = scanner.nextLine();
		scanner.close();
		
		// 2)
		ActorDAO actorDao = new ActorDAO();
		Actor actor = new Actor();
		actor.setFirstName(firstName);
		actor.setLastName(lastName);
		
		// 3) 입력 insert 모듈(메서드) 호출
		int row = actorDao.insertActor(actor);
		
		if(row == 1) {
			System.out.println("입력 성공");
		}
		
		// 4) 조회 select 모듈(메서드) 호출
		ArrayList<Actor> list = actorDao.selectActorList(5);
		
		// 5) 출력
		System.out.println("actorId\tfirstName\tlastName\tlastUpdate");
		for(Actor ac : list) {
			System.out.println(ac.getActorId() + "\t" + ac.getFirstName()+ "\t" + ac.getLastName()+ "\t" + ac.getLastUpdate());
		}
	}
	
}
