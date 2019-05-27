package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// �̱� ����Ʈ �Է�
		// -�غ� : ���� �ν��Ͻ�, �Է¿� ��Ʈ��
		
		File target = new File("files", "single.txt");
		FileInputStream in = new FileInputStream(target);
		
		// ���α׷� <- in <- target <- single.txt
		
		while(true) {
			int n = in.read();
			if(n == -1) break; //EOF(End Of File)
			System.out.println(n);
		}
		in.close();
	}
}
