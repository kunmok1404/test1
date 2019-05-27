package api.io.file;

import java.io.File;

public class Test03 {
	public static void main(String[] args) {
		
		// 디렉터리 분석
		//File drive = new File("D:");
		//File drive = new File("D:\\");
		File drive = new File("D:/");
		System.out.println(drive.exists());
		System.out.println(drive.isDirectory());
		System.out.println(drive.isFile());
		
		System.out.println(drive.getName());
		System.out.println(drive.getAbsolutePath());
		System.out.println(drive.getPath());
		System.out.println(drive.length());
		
	}
}
