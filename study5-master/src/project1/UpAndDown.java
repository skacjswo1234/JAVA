package project1;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		System.out.println("숫자를 고르고있어요");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 컴퓨터가 1 ~ 100 사이의 수 중 하나의 수를 선택한다.
		Random random = new Random();
		// 0 ~ 99 사이의 임의의 수가 만들어짐 
		int pick = random.nextInt(100) + 1;
		
		System.out.println("숫자를 골랐어요");
		System.out.println("맞춰보세요");
		
		boolean correct = false;
		// 사용자는 컴퓨터가 선택한 수를 맞춰야한다.
		// 기회는 5번
		Scanner scanf = new Scanner(System.in);
		for (int i=1; i<=5; i++) {
			System.out.println("숫자 : " );
			int user =scanf.nextInt();
			// 숫자를 근접하게 입력했을때 제가 생각한 숫자와 비슷해요! 라고 출력되게해봐라 
			int diff = pick - user;
			
			if(1 <= diff && diff <= 5) {
				System.out.println("제가 생각한숫자와 비슷해요!");
				System.out.println("큰 숫자를 입력해주세요!");
			} else if(-5 <= diff && diff <= -1) {
				System.out.println("제가 생각했던 숫자와 비슷해요!");
				System.out.println("작은 숫자를 입력해주세요");
			}
			
			if(user > pick) {
				// 사용자가 입력한 수가 컴퓨터가 선택한 수보 크다면
				// 컴퓨터는 "작은 숫자를 입력해주세요 !" 라고 출력하고
				System.out.println("작은수잦를 입력해주세요!");
				// 사용자가 입력한 수가 컴퓨터가 선택한 수보다 작다면
				// 컴퓨터는 " 큰 숫자를 입력해주세요 !" 라고 출력하세요.
			} else if(user < pick) {
				System.out.println("큰 숫자를 입력해주세요!");
				// 사용자가 입력한 수가 컴퓨터가 선택한 수라면
				// 컴퓨터는 "정답입니다!" 라고 출력하세요. 
			} else {
				System.out.println("정답입니다.");
				
				correct = true;
			} // end if
		} // end for
		if(correct) {
			System.out.println("제가 선택한 숫자는~~" + pick + "입니다");
			System.out.println("다음에 다시 도전해주세요 ! ");
		} // end if
	}

}
