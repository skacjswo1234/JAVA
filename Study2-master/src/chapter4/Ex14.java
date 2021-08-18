package chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex14 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		// set은 get 메서드가 존재하지 않음
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		// foreach
		// 향샹된 for문
		// set에 있는 데이터들을 인티저로 하나씩 뺴낸다
	
		}
		
		
	}


