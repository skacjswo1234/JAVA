package chapter3;

import java.util.Scanner;

public class Ex6 {
	static final int nowYear = 2021;  //고정 변수는 클래스 멤버 변수로 해주는 것이 좋다 .
	static final int dayOfMonth = 2021-03;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 1990;
		int age = Ex6.nowYear - year;
			
	if(age >= 1 && age <= 7) {
			System.out.println("미취학 유아동입니다");
	} else  if (age >= 8 && age <= 13) {
		System.out.println("초등학생입니다.");		
	} else  if (age >= 14 && age <= 16) {
		System.out.println("중학생입니다.");
	} else  if (age >= 17 && age <= 19) {
		System.out.println("고등학생입니다.");
	} else  if (age >= 20) {
		System.out.println("성인입니다.");

		}
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("2021년 3월의 날짜 : ");
				
				int num = 7;
				int day = Ex6.dayOfMonth / 7;
					
			if(day / 7 == 0) {
					System.out.println("일요일");
			} else  if (day / 7 == 1) {
				System.out.println("월요일.");		
			} else  if (age >= 14 && age <= 16) {
				System.out.println("화요일.");
			} else  if (age >= 17 && age <= 19) {
				System.out.println("수요일.");
			} else  if (age >= 20) {
				System.out.println("목요일.");
			} else  if (age >= 20) {
				System.out.println("목요일.");
					}
			}
}