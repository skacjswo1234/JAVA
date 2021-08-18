package chapter4;

import java.util.HashMap;
import java.util.Map;

public class Ex11 {

	public static void main(String[] args) {
				//key, values
		Map<String, Integer> classOneKor = new HashMap<>();
		
		classOneKor.put("홍길동", 95);
		classOneKor.put("김철수", 18);
		classOneKor.put("고영희", 86);
		classOneKor.put("유노윤호", 36);
		classOneKor.put("황광희", 69);
		System.out.println("초기 상태 : " +  classOneKor);
		// put 메서드를 사용할 때 이미 존재하는 키에 데이터를 저장하면
		// 해당 키에 들어있던 데이터가 덮어씌워진다.
		
		classOneKor.put("홍길동",73);
		System.out.println("key = 홍길동, value = 73 추가 : " + classOneKor);
		
		classOneKor.remove("홍길동");
		System.out.println(" key = 홍길동 삭제 : " + classOneKor);
		
		System.out.println("key = 황광희, value = " + classOneKor.get("황광희"));
	}

}
