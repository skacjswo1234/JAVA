package chapter3;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch 짝수 홀수 문 
		int num = 11;
		
		switch( num % 2  ) {
		case 0:
			System.out.println("짝수");
				break;
		default :
		System.out.println("홀수 ");
		}	
		//2021 년 3월의 특정 날짜에 해당하는 요일을 화면에 출력하세요
		int dayOfMonth = 28;
		int dayOfWeek = dayOfMonth % 7;
		
		switch(dayOfWeek) {
		case 1 :
			System.out.println("월요일");
				break;
		case 2 :
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4 :
			System.out.println("목요일");
			break;
		case 5 :
			System.out.println("금요일");
			break;
				
		case 6 :
			System.out.println("토요일");
			break;
		case 7 :
			System.out.println("일요일");
			break;
		}
		}
	}

