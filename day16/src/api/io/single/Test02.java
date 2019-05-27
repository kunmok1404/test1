package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// 싱글 바이트 입력
		// -준비물 : 파일 인스턴스, 입력용 스트림
		
		File target = new File("files", "single.txt");
		FileInputStream in = new FileInputStream(target);
		
		// 프로그램 <- in <- target <- single.txt
		
		while(true) {
			int n = in.read();
			if(n == -1) break; //EOF(End Of File)
			System.out.println(n);
		}
		in.close();
	}
}
