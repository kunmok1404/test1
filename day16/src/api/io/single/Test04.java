package api.io.single;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {
	public static void main(String[] args) throws IOException {
		
		// �������� byte�� ���ÿ� �����ϴ� ���
		byte[] data = new byte[] {104,101,108,108,111};
		
		File target = new File("files", "single2.txt");
		FileOutputStream out = new FileOutputStream(target);
		
		// �迭 ���۽�, "��ü"�� ���� ������ "�Ϻ�"�� ���� �������� ���� ��� ����
		out.write(data); // ��ü ����
		out.write(data); // ��ü ����
		out.write(data); // ��ü ����
		out.write(data, 0, 4); // data�� 0���� 4��
		
		out.close();
		
	}
}
