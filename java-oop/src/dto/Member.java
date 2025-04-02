package dto;

public class Member {
	private String id;
	private String pw;
	private int age;
	
	// 캡슐화
	// 세터
	public void setId(String id) {
		this.id = id;
	}
	
	// 게터
	public String getId() {
		return this.id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
