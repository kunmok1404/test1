package api.io.file;

import java.io.File;

public class Explorer {
	public void process(File target) {
		if(target.exists()) {
			if(target.isFile()) {
				System.out.println("���� �̸��� : " + target.getName());
				System.out.println("���� ũ��� : " + target.length());
			} else {
				File[] arr = target.listFiles();
				for(File f : arr) {
					System.out.println("-> " + f.getName());
				}
			}
		} else {
			System.out.println("���� ����Դϴ�.");
		}
	}
}
