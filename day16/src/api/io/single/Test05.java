package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Test05 {
	public static void main(String[] args) throws IOException {
		
		// 여러개의 byte를 동시에 입력
		File target = new File("files", "single2.txt");
		FileInputStream in = new FileInputStream(target);
		
		// 파일에 글자는 19개가 있고 크기가 5인 버퍼로 이것을 읽는다.
		byte[] buffer = new byte[5];
		while(true) {
			int size = in.read(buffer);
			if(size==-1)break;
			System.out.println(size + "," + Arrays.toString(buffer));
		}
		in.close();
	}
}
