package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test06 {
	public static void main(String[] args) throws IOException {
		
		// �������� byte�� ���ÿ� �Է�
		File target = new File("files", "single2.txt");
		FileInputStream in = new FileInputStream(target);
		
		File dest = new File("files","copy2.txt");
		FileOutputStream out  = new FileOutputStream(dest);
		
		// ���Ͽ� ���ڴ� 19���� �ְ� ũ�Ⱑ 5�� ���۷� �̰��� �д´�.
		byte[] buffer = new byte[5];
		while(true) {
			int size = in.read(buffer);
			if(size==-1) break;
			out.write(buffer, 0, size); // 0���� size�� ��ŭ ���
		}
		in.close();
		out.close();
	}
}
