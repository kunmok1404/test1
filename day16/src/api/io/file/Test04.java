package api.io.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test04 {
	public static void main(String[] args) {
		
		// ���� PC�� ����� ����̺� Ž��
		List<File> list = new ArrayList<>();

		for(char i = 'A';  i <='Z'; i++) {
			File drive = new File(i +":/");
			if(drive.exists()) {
				list.add(drive);
			}
		}
		System.out.println(list);
		for(File drive : list) {
			System.out.println(drive.getPath());
		}
	}
}
