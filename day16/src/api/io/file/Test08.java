package api.io.file;

import java.io.File;
import java.io.IOException;

public class Test08 {
	public static void main(String[] args) throws IOException {
		
		// 파일 및 폴더의 생성/삭제
		File f = new File("test");
		//System.out.println(f.exists());
		
		// 폴더로 생성
		//f.mkdirs();
		
		// 파일로 생성
		//f.createNewFile();
		
		// 삭제
		// - 폴더는 비어있는 폴더만 삭제가 됩니다.
		f.delete();
	}
}
