package api.io.file;

import java.io.File;

public class Test01 {
	public static void main(String[] args) {
		
		// ����(File) : ���ڸ� �����ϴ� ���� ����
		// 				  ���(path) + �̸�(name)
		//					  ���ϰ� ����(���͸�)�� ��� �����̶�� �θ�
		// -�ؽ�Ʈ ���� : ���� ���忡 �ǹ̰� �ִ� ����(.txt, .java, .ini, .prop, .md...)
		// -���̳ʸ� ���� : ���ڸ� �ؼ��ϴ� ���� �߿��� ����(���� ���α׷�)(.jpg, gif, png, avi, mp4, mp3...)
		
		// �ν��Ͻ� ����
		// ����θ� �̿��Ͽ� ���� ����(������Ʈ�� ����)
		File a = new File("files","sample.txt");
		File b = new File("files\\sample.txt");
		File c = new File("files/sample.txt");
		
		// ���� ��θ� �̿��� ���� ����
		File d = new File("D:\\�������� 1��\\JAVA\\workspace\\day16\\files");
		
		// ������ ����� ���� ����
		File dir = new File("files");
		File e = new File(dir, "sample.txt");
	}
}
