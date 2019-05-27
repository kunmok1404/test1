package api.io.file;

import java.io.File;

public class Test01 {
	public static void main(String[] args) {
		
		// 파일(File) : 글자를 보관하는 저장 단위
		// 				  경로(path) + 이름(name)
		//					  파일과 폴더(디렉터리)를 모두 파일이라고 부름
		// -텍스트 파일 : 글자 저장에 의미가 있는 파일(.txt, .java, .ini, .prop, .md...)
		// -바이너리 파일 : 글자를 해석하는 것이 중요한 파일(전용 프로그램)(.jpg, gif, png, avi, mp4, mp3...)
		
		// 인스턴스 생성
		// 상대경로를 이용하여 파일 생성(프로젝트를 기준)
		File a = new File("files","sample.txt");
		File b = new File("files\\sample.txt");
		File c = new File("files/sample.txt");
		
		// 절대 경로를 이용한 파일 생성
		File d = new File("D:\\과정평가평 1기\\JAVA\\workspace\\day16\\files");
		
		// 폴더를 만들고 파일 생성
		File dir = new File("files");
		File e = new File(dir, "sample.txt");
	}
}
