package chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex10 {

	public static void main(String[] args) {
		Set<Passenger> passengerList = new HashSet<>();
		
		Passenger p1 = new Passenger("홍길동", "010-1473-3698","이코노미");
		Passenger p2 = new Passenger("김철수", "010-1598-7894","퍼스트");
		Passenger p3 = new Passenger("고영희", "010-4569-1236","비즈니스");
		Passenger p4 = new Passenger("유노윤호", "010-2568-2584","퍼스트");
		Passenger p5 = new Passenger("황광희", "010-7418-5296","이코노미");
			
		passengerList.add(p1);
		passengerList.add(p2);
		passengerList.add(p3);
		passengerList.add(p4);
		passengerList.add(p5);
		
		// Iterator를 사용해서 모든 승객의 정보를 출력하세요.
		Iterator<Passenger> iterator = passengerList.iterator();
		while(iterator.hasNext()) {
			Passenger passenger = iterator.next();
			
			System.out.println("이름 : " + passenger.getName());
			System.out.println("연락처 : " + passenger.getTel());
			System.out.println("좌석등급 : " + passenger.getSeat());
		}

	}

}
