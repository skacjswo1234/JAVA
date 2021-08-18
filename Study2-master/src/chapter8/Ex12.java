package chapter8;

import java.io.File;

public class Ex12 {

	public static void main(String[] args) {
		//	String path = "src\\chapter8";
			File directory = new File("src\\chapter8");
			String fileName = "Ex12.java";
			File file = new File(directory, fileName);
			
			int position = fileName.lastIndexOf(".");
			
			System.out.println("경로를 제외한 파일이름 -" + fileName);
			// substring -> 문자열을 잘라주는 메서드
			System.out.println("확장자를 제외한 파일 이름 - " + fileName.substring(0,position));
			System.out.println("확장자 -" + fileName.substring(position+1));
			System.out.println();
			
			System.out.println("경로를 포함한 파일이름 -" + file.getPath());
			System.out.println("파일의 절대경로 -" + file.getAbsolutePath());
			System.out.println("파일이 속해 있는 디렉토리 -" + file.getParent());
			System.out.println();
			
			System.out.println("user.dir -" + System.getProperty("user.dir"));
	}

}
