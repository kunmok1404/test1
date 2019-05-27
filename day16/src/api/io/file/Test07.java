package api.io.file;

import java.io.File;

public class Test07 {
	public static void main(String[] args) {
		
		// 디렉토리 위치 이동
		File dir = new File("D:/");
		
		// 하위 폴더로 위치 이동 - 객체 새로 생성(cd)
		dir = new File(dir, "과정평가평 1기");
		System.out.println(dir.getAbsolutePath());
		
		// 상위 폴더로 위치 이동 - getParentFile()(cd..)
		dir = dir.getParentFile();
		System.out.println(dir.getAbsolutePath());
		
		// 루트는 상위폴더가 없음(null)
	}
}
