package chapter3;

import java.util.Scanner;

public class Ex6_1 {
	static final int WEEK = 7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("2021년 3월의 날짜 : ");
		
		int dayOfMonth = scanf.nextInt();
		int dayOfWeek = dayOfMonth % Ex6_1.WEEK;
	
		System.out.println("2021년 3월의 날짜 : " + dayOfMonth + "일은");
		
					
			if(dayOfWeek == 0){
					System.out.println("일요일");
			} else  if (dayOfWeek == 1) {
				System.out.println("월요일.");		
			} else  if (dayOfWeek==2) {
				System.out.println("화요일.");
			} else  if (dayOfWeek == 3) {
				System.out.println("수요일.");
			} else  if (dayOfWeek == 4) {
				System.out.println("목요일.");
			} else  if (dayOfWeek == 5) {
				System.out.println("금요일.");
			} else if (dayOfWeek == 6) {
				System.out.println("토요일.");
			}
			System.out.println("입니다.");
			
			
			
			}

}

