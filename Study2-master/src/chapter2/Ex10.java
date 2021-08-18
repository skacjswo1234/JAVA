package chapter2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Ex10 {

	public static void main(String[] args) {
		ZonedDateTime zdt = ZonedDateTime.now();
		
		System.out.println(zdt);
		
		//시간대의 차이 -> offset
		ZoneOffset krOffset = zdt.getOffset();
		System.out.println(krOffset);
		
		
		ZoneId nyId = ZoneId.of("America/New_York");
		zdt = ZonedDateTime.now().withZoneSameInstant(nyId);
		
		System.out.println(zdt);
		
		ZoneOffset nyOffset = zdt.getOffset();
		System.out.println(nyOffset);
		
		
		
		
		
		// 현재 시스템의 날짜와 시간을 갖는 객체
//			LocalDateTime dateTime = LocalDateTime.now();
			// 한국의 시간대
			// Asia/Seoul -> 서울
			// Asia/Japan -> 일본
			// 타임존, 시간대, zone id 
	//		ZoneId zoneId = ZoneId.of("Asia/Seoul");
			
			// dateTime 객체가 갖고 있는 날짜와 시간을 Asia/Seoul의 날짜와 시간이라고 표시 지정.
			// 2021-03-30 16:49:12 뉴욕의 시간이다.
	//		ZonedDateTime zdt = dateTime.atZone(zoneId);
			
	//		System.out.println(dateTime);
	//		System.out.println(zdt);
	}

}
