package chapter8;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Ex15 {

	public static Map<String, Integer> printFileList(File dir) {
		// listFiles -> 이 객체(dir)이 갖고 있는 디렉토리와 파일의 목록
		File[] files = dir.listFiles();
		
		// 이 객체 내 디렉토리의 수
		int dirNum = 0;
		// 이 객체 내 파일의 수 
		int fileNum = 0;
		
		for(int i=0; i<files.length; i++) {
			File file = files[i];
			String filename = file.getName();
			
			if(file.isDirectory()) {
				filename = "[" + filename  + "]";
				dirNum++;
			} else {
				fileNum++;
			}
			System.out.println(filename);
		}
		
		Map<String, Integer> count = new HashMap<>();
		count.put("fileNum", fileNum);
		count.put("dirNum", dirNum);
		
					return count;
	}
	public static void main(String[] args) {
		
		File dir = new File("C:\\Users\\ITPS\\Desktop");
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			// exit -> 프로그램 종료 / 강제 종료의 느낌은아니고 정상종료 
			System.exit(0);
		} 
		
		System.out.println(dir.getAbsolutePath() + "디렉토리");
		Map<String, Integer> count = printFileList(dir);
		
		System.out.println("총" + count.get("fileNum") +  "개의 파일");
		System.out.println("총" + count.get("dirNum") + " 개의 디렉토리" );
		}
	}



