package api.io.file;

import java.io.File;
import java.io.IOException;

public class Test08 {
	public static void main(String[] args) throws IOException {
		
		// ���� �� ������ ����/����
		File f = new File("test");
		//System.out.println(f.exists());
		
		// ������ ����
		//f.mkdirs();
		
		// ���Ϸ� ����
		//f.createNewFile();
		
		// ����
		// - ������ ����ִ� ������ ������ �˴ϴ�.
		f.delete();
	}
}
