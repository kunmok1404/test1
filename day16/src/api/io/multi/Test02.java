package api.io.multi;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		
		// ��Ƽ ����Ʈ �Է�
		// - �غ� : ���� �ν��Ͻ�, �Է� ��Ʈ��, ���۽�Ʈ��, ���� ��Ʈ��
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
