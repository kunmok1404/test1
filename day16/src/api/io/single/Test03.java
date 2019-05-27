package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.Format;

public class Test03 {
	public static void main(String[] args) throws IOException {
		
		File read = new File("files", "single.txt");
		File write = new File("files", "copy.txt");
		
		FileInputStream in = new FileInputStream(read);
		FileOutputStream out = new FileOutputStream(write);
		
		// 입력받은 글자를 출력
		long size = read.length();
		long count = 0;
		Format f = new DecimalFormat("#.00");
		while(true) {
			int n = in.read();
			if(n == -1) break;
			out.write(n);
			
			count++;
			String percent = f.format(count*100.0/ size);
			System.out.println("복사 현황 : " + count + " / " + size + " (" + percent + "%)");
		}
		in.close();
		out.close();
	}
}
