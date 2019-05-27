package api.io.multi;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		
		// 멀티 바이트 출력
		// - 준비물 : 파일 인스턴스, 출력 스트림, 버퍼 스트림, 분해 스트림
		
		File target = new File("files", "multi.txt");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		DataOutputStream data = new DataOutputStream(buffer);
		
		// 프로그램 -> data -> buffer -> out -> target -> multi.txt
		
		// 서로 다른 방법으로 분해하기 때문에 명령이 여러개가 존재
		data.writeInt(100);
		data.writeChar(100);
		data.writeDouble(100);
		data.writeFloat(100);
		data.writeByte(100);
		data.writeUTF("안녕하세요~");
		
		// 강제로 전송
		data.flush(); // 전송만
		data.close(); //전송하고 종료
		
	}
}
