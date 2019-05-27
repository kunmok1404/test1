package api.io.single;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		
		// 싱글바이트 출력
		// - 준비물 : 파일 인스턴스, 출력용 스트림
		
		File target = new File("files", "single.txt");
		FileOutputStream out = new FileOutputStream(target);
		
		// 프로그램 -> out -> target -> single.txt
		out.write(65);
		out.write('B');
		out.write(9);
		out.write(104);
		out.write(101);
		out.write(108);
		out.write(108);
		out.write(111);
		out.write('\n');
		
		// byte의 범위를 초과하는 값을 출력
		out.write(30000); //-> 48(자동변환)
		
		out.close();
	}
}
