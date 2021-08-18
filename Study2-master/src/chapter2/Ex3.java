package chapter2;

import java.util.Calendar;

public class Ex3 {
		
	static final int DAY_IN_SECOND = 24 * 60 * 60;
	static final int HOUR_IN_SECOND = 60 * 60;
	static final int MINUTE_IN_SECOND = 60;
	
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		
		// Calendar는 월을 0부터 카운팅을 함 
		cal1.set(2021, Calendar.JANUARY, 1);
		cal1.set(2021, Calendar.JANUARY, 2);
		
		long cal1ToSecond = cal1.getTimeInMillis();
		long cal2ToSecond = cal2.getTimeInMillis();
		
		long difference = cal2ToSecond - cal1ToSecond;
		difference = difference / 1000;
		
		System.out.println(difference + "초가 흘렀습니다.");
		
		// 초단위를 일 단위로 환산
		int period = (int) (difference / (DAY_IN_SECOND));
		System.out.println(period + "일 경과");
		
		//초단위를 시간 단위로 환산 
		int period2 = (int) (difference / HOUR_IN_SECOND);
		System.out.println(period2 + "시간 경과");
		
		
		//분 단위를 시간단위로 환산 
		int period3 = (int) (difference / MINUTE_IN_SECOND);
		System.out.println(period3 + "분 경과");
	}

}
