package chapter8;

import java.io.File;

public class Ex14 {

	public static void main(String[] args) {
			File file = new File("src\\test");
			
			if(!file.exists() || file.isDirectory()) {
				System.out.println("존재하지 않거나 디렉토리가 아닙니다.");
				
				System.out.println("해당 경로에 디렉토리를 생성합니다.");
				
				// mkdir - make directory 디렉토리 만들때 
				// createnewFile - 파일을 만들때
				file.mkdir();
				// mkdirs -> 우리가 지정한 마지막 디렉토리만 생성하는 메서드
				// 지정한 경로 내 존재하지 않는 디렉토리까지 다생성을해주는 메서드
				file.mkdirs();
			} else {
				System.out.println("존재합니다.");
			}

	}

}
