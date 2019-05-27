package api.io.file;

import java.io.File;

public class Test05 {
	public static void main(String[] args) {
		
		// 디렉토리의 구성요소를 확인하는 방법
		File dir = new File("D:/");
		
		// 폴더의 구성요소 개수는 알 수 없다.
		// -> 추출 데이터의 예상 자료형은 배열 아니면 리스트
		File[] arr = dir.listFiles();
		System.out.println(arr.length);
		
		for(File f : arr) {
			System.out.println(f.getName());
		}
	}
}
