package chapter4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex8 {

	public static void main(String[] args) {
// 저장하는 데이터의 순서를 보장하지는 않음.
		Scanner scanf = new Scanner(System.in);
		
		Set<String> lyricsSet = new HashSet<>();
		
		while(true) {
		System.out.println("노래 가사를 입력하세요.(종료 : -1)");
		
		String lyrics = scanf.next();
		if(lyrics.equals("-1")) {
			break;
		}		
		
		if(lyricsSet.add(lyrics)) {
			
		} else {
			System.out.println("이미 입력된 가사입니다 =>" + lyrics);
		}
		System.out.println();
		}
	}
}

