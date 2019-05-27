package api.io.object;

import java.io.Serializable;

// ��ü ������� ���� �ڰ��� ȹ���ؾ� �Ѵ�. 
public class Student implements Serializable {
	
	private String name;
	private transient int score; // ����� ����
	
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
