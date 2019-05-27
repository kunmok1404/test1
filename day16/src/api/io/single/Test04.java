package api.io.single;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {
	public static void main(String[] args) throws IOException {
		
		// 여러개의 byte를 동시에 전송하는 방법
		byte[] data = new byte[] {104,101,108,108,111};
		
		File target = new File("files", "single2.txt");
		FileOutputStream out = new FileOutputStream(target);
		
		// 배열 전송시, "전체"를 보낼 것인지 "일부"를 보낼 것인지에 따라 명령 선택
		out.write(data); // 전체 전송
		out.write(data); // 전체 전송
		out.write(data); // 전체 전송
		out.write(data, 0, 4); // data를 0부터 4개
		
		out.close();
		
	}
}
