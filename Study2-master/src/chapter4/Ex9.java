package chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex9 {

	public static void main(String[] args) {
		
		Set<Passenger> passengerList = new HashSet<>();
		
		Passenger p1 = new Passenger("홍길동","010-1473-3698", "이코노미");
		Passenger p2 = new Passenger("홍길동","010-1473-3698", "이코노미");
		
		passengerList.add(p1);
		
		p1.equals(p2.hashCode());
		// add 를 하면은 기존에 들어있는 데이터들의 equals 메서드를 호출
		// 매개변수는 추가하려는 데이터의 해시값으로 전달
		passengerList.add(p2);
		
		System.out.println(passengerList);
		
		passengerList.remove(p1);
		
		System.out.println(passengerList);
		// Iterator 해시셋 해놓은걸 꺼내 쓸수 있는 코드 
		Iterator<Passenger> iterator = passengerList.iterator();
	}

}
