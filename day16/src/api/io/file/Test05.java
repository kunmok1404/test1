package api.io.file;

import java.io.File;

public class Test05 {
	public static void main(String[] args) {
		
		// ���丮�� ������Ҹ� Ȯ���ϴ� ���
		File dir = new File("D:/");
		
		// ������ ������� ������ �� �� ����.
		// -> ���� �������� ���� �ڷ����� �迭 �ƴϸ� ����Ʈ
		File[] arr = dir.listFiles();
		System.out.println(arr.length);
		
		for(File f : arr) {
			System.out.println(f.getName());
		}
	}
}
