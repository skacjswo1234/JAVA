package chapter3;

import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanf = new Scanner(System.in);
			
			String a = "+";
			// next 메서드 -> 사용자가 입력한 값을 문자열로 가져옴
			String b = scanf.next();
			
			System.out.println("a =" + a);
			System.out.println("b =" + b);
			
			
			if(a.equals(b)) {
				System.out.println("a와 b가 같습니다.");
			} else {
				System.out.println("a와b가 다릅니다.");
	}

}
}
