package api.io.file;

import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;

public class Test02 {
	public static void main(String[] args) {
		
		// ���� �м�
		File f = new File("files", "sample.txt");
		
		// ���� ����
		System.out.println(f.exists());
		
		// ���� Ȯ��
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		
		// ���� Ȯ�� : �̸� , ���, ũ��...
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.length());
		
		System.out.println(f.lastModified());
		Format fmt = new SimpleDateFormat("y-MM-dd a HH:mm:ss");
		System.out.println(fmt.format(f.lastModified()));
		
	}
}
