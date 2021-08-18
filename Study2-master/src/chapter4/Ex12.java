package chapter4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex12 {

	public static void main(String[] args) {
		System.out.println("=========[ 승객들의 좌석 정보] =======================");
		Map<String, String> hashMap = new HashMap<>();
		
		hashMap.put("홍길동", "이코노미");
		hashMap.put("김철수", "퍼스트");
		hashMap.put("고영희", "비즈니스");
		hashMap.put("유노윤호", "퍼스트");
		hashMap.put("황광희", "이코노미");
		
		hashMap.put("유노윤호","이코노미");
		System.out.println("key = 유노윤호, value = 이코노미 추가 : " + hashMap);
		
		hashMap.remove("황광희");
		// hashMap의 keySet으로 변환하여 전체 값을 출력할 수 있다.
		Set<String> keySet = hashMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			
			System.out.println(key + "=" + hashMap.get(key));
		}
		System.out.println("key = 남은승객들의, value = " + hashMap.getClass());

		System.out.println(" key = 황광희 삭제 : " + hashMap);
		System.out.println("초기 상태 : " +  hashMap);

		System.out.println("============== ==================================");
		
	}

}
