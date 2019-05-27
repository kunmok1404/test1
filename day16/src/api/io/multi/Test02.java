package api.io.multi;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		
		// 멀티 바이트 입력
		// - 준비물 : 파일 인스턴스, 입력 스트림, 버퍼스트림, 조립 스트림
		File desk = new File("files","multi.txt");
		FileInputStream in = new FileInputStream(desk);
		BufferedInputStream buffer = new BufferedInputStream(in);
		DataInputStream data = new DataInputStream(buffer);
		
		int a = data.readInt();
		char b = data.readChar();
		double c = data.readDouble();
		float d = data.readFloat();
		byte e = data.readByte();
		String f = data.readUTF();
		
		data.close();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		
		
	}
}
