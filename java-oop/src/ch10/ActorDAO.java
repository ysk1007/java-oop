package ch10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import dto.Actor;

public class ActorDAO {
	
	// Actor 테이블 데이터를 조회 - SELECT
	public ArrayList<Actor> selectActorList(int num) throws ClassNotFoundException, SQLException{
		ArrayList<Actor> list = new ArrayList<Actor>();
		
		// 라이브러리를 추가 : projcet 우클릭 -> build-path 항목에서 추가
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT "
						+ "actor_id actorId,"
						+ "first_name firstName,"
						+ "last_name lastName,"
						+ "last_update lastUpdate "
					+ "FROM actor "
					+ "ORDER BY actor_id "
					+ "DESC LIMIT ?";
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","java1234");
		
		// 쿼리 실행
		stmt = conn.prepareStatement(sql);
		stmt.setInt(1, num);
		
		rs = stmt.executeQuery();
		
		while(rs.next()) {
			Actor ac = new Actor();
			ac.setActorId(rs.getInt("actorId"));
			ac.setFirstName(rs.getString("firstName"));
			ac.setLastName(rs.getString("lastName"));
			ac.setLastUpdate(rs.getString("lastUpdate"));
			list.add(ac);
		}
		
		conn.close();
		
		return list; 
	}
	
	// Actor 테이블 데이터를 입력 - INSERT
	public int insertActor(Actor actor) throws ClassNotFoundException, SQLException {
		int row = 0;
		
		// 라이브러리를 추가 : projcet 우클릭 -> build-path 항목에서 추가
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		PreparedStatement stmt = null;
		
		String sql = "INSERT INTO actor(first_name, last_name) VALUES(?,?)";
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","java1234");
		
		// 쿼리 실행
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, actor.getFirstName());
		stmt.setString(2, actor.getLastName());
		System.out.println(stmt);
		
		row = stmt.executeUpdate();
		
		conn.close();
		
		return row;
	}
}
