package api.io.object;

import java.io.Serializable;

// 객체 입출력을 위한 자격을 획득해야 한다. 
public class Student implements Serializable {
	
	private String name;
	private transient int score; // 입출력 제외
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
