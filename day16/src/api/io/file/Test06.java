package api.io.file;

import java.io.File;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		//사용자에게 파일 또는 폴더 경로를 입력받아 파일이면 이름과 크기를 출력, 폴더면 내용물 목록 출력, 없는 경로면 없다고 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("파일 경로를 입력하세요.");
		String path = sc.nextLine();
		sc.close();
		
		File file = new File(path);
		if(file.exists()) {
			if(file.isFile()) {
				System.out.println("파일 이름은 : " + file.getName());
				System.out.println("파일 크기는 : " + file.length());
			} else {
				File[] arr = file.listFiles();
				for(File f : arr) {
					System.out.println("-> " + f.getName());
				}
			}
		} else {
			System.out.println("없는 경로입니다.");
		}
	}
}
