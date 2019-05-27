package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Test05 {
	public static void main(String[] args) throws IOException {
		
		// �������� byte�� ���ÿ� �Է�
		File target = new File("files", "single2.txt");
		FileInputStream in = new FileInputStream(target);
		
		// ���Ͽ� ���ڴ� 19���� �ְ� ũ�Ⱑ 5�� ���۷� �̰��� �д´�.
		byte[] buffer = new byte[5];
		while(true) {
			int size = in.read(buffer);
			if(size==-1)break;
			System.out.println(size + "," + Arrays.toString(buffer));
		}
		in.close();
	}
}
