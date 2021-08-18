package chapter4;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		
		List<Passenger> passengerList = new ArrayList<>();
		
		Passenger passenger0 = new Passenger("메튜", "010-7591-1534","이코노미");
		Passenger passenger1 = new Passenger("홍길동", "010-1234-5678", "이코노미");
		Passenger passenger2 = new Passenger("유노윤호", "010-1598-7894", "퍼스트");
		Passenger passenger3 = new Passenger("고영희", "010-4568-1236", "비즈니스");
		
		
	

		
		passengerList.add(passenger1);
		passengerList.add(passenger2);
		passengerList.add(passenger3);

		//메튜 추가
		passengerList.add(0, passenger0);
		// 홍길동 삭제 
		passengerList.remove(1);
		
		Passenger passenger =passengerList.get(1);
		System.out.println(passenger.getName());
		System.out.println(passenger.getTel());
		System.out.println(passenger.getSeat());
		
		passenger = passengerList.get(2);
		System.out.println(passenger.getName());
		System.out.println(passenger.getTel());
		System.out.println(passenger.getSeat());
		
		// 비어있나요? -> true / 그렇지 않으면 false
		System.out.println(passengerList.isEmpty());
		
		//컬렉션 프레임워크에 들어있는 데이터의 개수를 반환
		System.out.println(passengerList.size());
		
		// i가 0로 시작해서 2로 끝난다.
		for(int i=0; i<passengerList.size(); i++) {
			System.out.println(passengerList.get(i));
			
		}
		
		// 향상된 for문 / foreach 문 오른쪽에서 왼쪽 객체에 코드를 하나씩 주어서 실행 ! 
		for(Passenger p : passengerList) {
			System.out.println();
		} // end for
		
		int[] arr = {1, 2, 3, 4, 5};
		for(int i : arr) {
			System.out.println(i);
		} // end for
	}

}
