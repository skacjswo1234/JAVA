package chapter2;

import java.util.Calendar;

public class Ex4 {
	// 캘린더 객체가 갖고 있는 날짜 정보를
	// 우리가 원하는 형식으로 반환해주는 메서드
	public static String toString ( Calendar calendar ) {
		// 년-월-일
		// yyyy-MM-dd
		
		String year = calendar.get(Calendar.YEAR) + "-";
		
		// 1 ~ 12 -> 1 ~ 9월 까지는 한자릿수 월 / 10 ~ 12월까지는 두자릿수 월
		int monthOfYear = calendar.get(Calendar.MONTH) + 1;
		// 한자릿수 월일 경우에는 월 앞에 0을 붙이는 연산
		String month = (monthOfYear < 10 ?  "0" : "" ) + monthOfYear + "-";
		
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		String day = (dayOfMonth < 10 ? "0" : "" ) + dayOfMonth;
		
		return year + month  + day;
		
	}
	
	public static void main(String[] args) {
			
		Simple simple = new Simple();
		System.out.println(simple.toString());
		
		Calendar calendar =  Calendar.getInstance();
			
			System.out.println(toString(calendar));
			
			System.out.println("= 1일 후 =");
			calendar.add(Calendar.DATE, 1);
			System.out.println(toString(calendar));
			
			System.out.println("= 2일 후 =");
			calendar.add(Calendar.DATE, 2);
			System.out.println(toString(calendar));
			
			System.out.println("= 30일 후 =");
			calendar.add(Calendar.DATE, 30);
			System.out.println(toString(calendar));
		
			System.out.println("=한달 후 =");
			calendar.add(Calendar.MONTH, 1);
			System.out.println(toString(calendar));
	}

}
