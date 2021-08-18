package chapter3;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while문은 주로 조건 반복문 (끝이 명확하지 않은 )에 적합 
		Scanner scanf = new Scanner(System.in);
		// 음악을 다 듣고 다시 재생할지 여부 
		char repeat;
		while(true) {
			System.out.println("음악을 재생합니다.");
			
			int number = 1;
			while(number <=10) {
			System.out.println(number +"번 트랙 재생");
			System.out.println("다시 처음부터 재생하시겠습니까");
			repeat = scanf.next().charAt(0);
			if(repeat == 'y') {
				// 다시 처음부터 재생
				
				number = 1;
				continue;
			}
			number = number + 1;
			}
			System.out.println("다시 처음부터 재생하시겠습니까");
			repeat = scanf.next().charAt(0);
			if(repeat != 'y') {
			break;
			}
		} //end while 
	}
}

