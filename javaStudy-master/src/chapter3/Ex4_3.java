package chapter3;

import java.util.Scanner;

public class Ex4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("첫 번쨰 수를 입력하세요  :" );
		int num1 = scanf.nextInt();
	
		System.out.println("두 번째 수를 입력하세요 :");
		int num2 = scanf.nextInt();
		
		System.out.println("연산자를 입력하세요 :");
		String operator = scanf.next();
		
		if(operator.equals("+")) {
			System.out.println(num1 + num2);
		} else if(operator.equals("-")) {
			System.out.println(num1 - num2);
		} else if(operator.equals("*")) {
			System.out.println(num1 * num2);
		} else if(operator.equals("/")) {
			System.out.println(num1 / num2);
		} else  System.out.println("잘못되었습니다.");
		
		
	}

}

