package api.io.single;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		
		// �̱۹���Ʈ ���
		// - �غ� : ���� �ν��Ͻ�, ��¿� ��Ʈ��
		
		File target = new File("files", "single.txt");
		FileOutputStream out = new FileOutputStream(target);
		
		// ���α׷� -> out -> target -> single.txt
		out.write(65);
		out.write('B');
		out.write(9);
		out.write(104);
		out.write(101);
		out.write(108);
		out.write(108);
		out.write(111);
		out.write('\n');
		
		// byte�� ������ �ʰ��ϴ� ���� ���
		out.write(30000); //-> 48(�ڵ���ȯ)
		
		out.close();
	}
}
