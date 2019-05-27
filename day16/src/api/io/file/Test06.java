package api.io.file;

import java.io.File;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		//����ڿ��� ���� �Ǵ� ���� ��θ� �Է¹޾� �����̸� �̸��� ũ�⸦ ���, ������ ���빰 ��� ���, ���� ��θ� ���ٰ� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ��θ� �Է��ϼ���.");
		String path = sc.nextLine();
		sc.close();
		
		File file = new File(path);
		if(file.exists()) {
			if(file.isFile()) {
				System.out.println("���� �̸��� : " + file.getName());
				System.out.println("���� ũ��� : " + file.length());
			} else {
				File[] arr = file.listFiles();
				for(File f : arr) {
					System.out.println("-> " + f.getName());
				}
			}
		} else {
			System.out.println("���� ����Դϴ�.");
		}
	}
}
