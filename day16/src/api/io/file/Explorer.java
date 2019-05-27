package api.io.file;

import java.io.File;

public class Explorer {
	public void process(File target) {
		if(target.exists()) {
			if(target.isFile()) {
				System.out.println("파일 이름은 : " + target.getName());
				System.out.println("파일 크기는 : " + target.length());
			} else {
				File[] arr = target.listFiles();
				for(File f : arr) {
					System.out.println("-> " + f.getName());
				}
			}
		} else {
			System.out.println("없는 경로입니다.");
		}
	}
}
