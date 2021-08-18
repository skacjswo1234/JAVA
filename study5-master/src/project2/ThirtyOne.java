package project2;

import java.util.Random;
import java.util.Scanner;

public class ThirtyOne {

	public static void main(String[] args) {
		// 사용자와 컴퓨터가 서로 숫자를 부른다.
		// 숫자는 한번에 최소1개 최대 3개까지 부를수있다.
		// 1 ~ 31까지 증가하면서 불러야한다.
		// 마지막 31을 부른사람이 게임에서 진다.
		// 3. 숫자는 한번에 입력해야한다.
		// 입력 예시) 숫자 : 1 2 3
		// 1. 사용자가 먼저 할지 컴퓨터가 먼저 할 지 결정
		Scanner scanf = new Scanner(System.in);
		// turn - > true : 사용자의 차례 / false : 컴퓨터의 차례
		boolean turn = false;
		while (true) {
			System.out.println("숫자를 골라 주세요");
			System.out.println("1.사용자");
			System.out.println("2. 컴퓨터");

			int select = scanf.nextInt();
			if (select == 1) {
				System.out.println("사용자가 먼저시작합니다.");
				// 사용자가 먼저 시작하도록 설정
				turn = true;
				break;
			} else if (select == 2) {
				System.out.println(" 컴퓨터가 먼저 시작합니다.");
				// 컴퓨터가 먼저 시작하도록 설정
				turn = false;
				break;
			} else {
				System.out.println("선택지는 두가지 뿐입니다.");
			}
		}

		System.out.println("Game Start ! ");

		scanf.nextLine();

		int lastNumber = 0;

		// 2. 먼저 시작하는 쪽이 숫자를 부른다.
		while (true) {
			if (turn) {
				// 사용자 차례
				// 3. 숫자는 한번에 입력해야한다.
				while (true) {
					System.out.println("사용자 차례입니다.");
					System.out.println("최대 3개의 숫자를 외쳐주세요");

					String user = scanf.nextLine();
					String[] users = user.split(" ");

					if (users.length == 0 || users.length > 3) {
						System.out.println("숫자는 최대 3개까지만 외칠수 있습니다!");
					} else {
						lastNumber = Integer.parseInt(users[users.length - 1]);

						break;
					}
				}
			} else {
				// 컴퓨터 차례
				System.out.println("컴퓨터의 차례입니다!");

				Random random = new Random();
				int roof = random.nextInt(3) + 1;

				for (int i = 1; i <= roof; i++) {
					lastNumber = lastNumber + 1;
					
					if(lastNumber <= 31) {
						System.out.print(lastNumber + " ");
					}
					
				}

				System.out.println();
			}

			if (lastNumber >= 31) {
				if (turn) {
					System.out.println("사용자가 졌습니다!");
				} else {
					System.out.println("사용자가 이겼습니다!");
				}
				 
				break;
			}

			turn = !turn;
		}
	}
}
