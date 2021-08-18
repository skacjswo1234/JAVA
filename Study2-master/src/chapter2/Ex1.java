package chapter2;

import java.util.Calendar;
import java.util.Date;

public class Ex1 {

	public static void main(String[] args) {
		// 자바1 버전에서 사용했던 날짜와 시간을 핸들링하는 클래스	.
		Date date = new Date();
		// 자바1.1 버전에서 추가된 날짜와 시간을 핸들링하는 클래스.
		// 캘린더 클래스는 추상 클래스이므로 인스턴스를 만들 수 없음
		// 대신 Calendar 클래스에 있는 static 메서드인 getInstance를 사용해서
		// Calendar클래스의 자식 클래스 인서턴스는 만들 수 있음
		// 프로그램이 구동되는 시스템의 국가와 지역설정을 확인해서
		// 해당 시스템에 맞는 날짜를 핸들링 할 수 있는 클래스의 인스턴스가 반환된다.
		// 그레고리력, 불력
		Calendar calendar = Calendar.getInstance();
		
		// Date 클래스의 인스턴스 -> Calendar 클래스의 인스턴스로 변환
		// 1. Calendar 클래스의 인스턴스를 생성한다.
		// 2. 1에서 생성한 Calendar 클래스의 인스턴스의 날짜와 시간을 
		//     Date 클래스의 인스턴스가 갖고 있는 날짜와 시간으로 설정한다.
		calendar.setTime(date);
		
		// Calendar 클래스의 인스턴스 -> Date 클래스의 인스턴스로 변환
		Date d1 = new Date(calendar.getTimeInMillis());
		Date d2 = calendar.getTime();
	}
}
