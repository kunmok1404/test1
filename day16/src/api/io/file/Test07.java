package api.io.file;

import java.io.File;

public class Test07 {
	public static void main(String[] args) {
		
		// ���丮 ��ġ �̵�
		File dir = new File("D:/");
		
		// ���� ������ ��ġ �̵� - ��ü ���� ����(cd)
		dir = new File(dir, "�������� 1��");
		System.out.println(dir.getAbsolutePath());
		
		// ���� ������ ��ġ �̵� - getParentFile()(cd..)
		dir = dir.getParentFile();
		System.out.println(dir.getAbsolutePath());
		
		// ��Ʈ�� ���������� ����(null)
	}
}
