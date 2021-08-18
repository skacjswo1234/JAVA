package chapter10;

import java.util.Scanner;

public class Ex4 {
	// simple1 메서드는 정수 1개가 필요한 메서드
	void simple1(int val) {
		System.out.println(val);
	}
	void simple2() {
		System.out.println("Hello World~!");
	}
	void simple3(String messege) {
		System.out.println(messege);
	}
	// simple4 메서드는 정수 두개가 필요한 메서드
	void simple4(int num1, int num2) {
		if(num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	}
	// simple5 메서드는 정수 두개와 문자 하나가 필요한 메서드
void simple5(int var1, int var2, char var3) {
	if(var3 == '+') {
		System.out.println(var1 + var2);
	} else if (var3 == '-') {
		System.out.println(var1 - var2);
	}
}
		void noName() {
			for(int i=1; i<=9; i++) {
			System.out.println("2 * " + i  + 2  *  i);
			}
		}
	//좋은 메서드 - 한번에 하나의 동작만 하는 메서드
			void gugudan() {
				Scanner scanf = new Scanner(System.in);
				
				System.out.println("출력할 구구단 (2~9 : ");
			}
			// 10 더하기 20을 출력하세요
			void operator() {
				System.out.println(10 + 20);
			}
			// 두 정수를 더한 결과를 출력하는 메서드
			void operator1(int var1, int var2) {
				System.out.println(var1 + var2);
			}
			//
			void operator2() {
				int num1 = 11;
				int num2 = 10;
				if(num1 > num2) {
				System.out.println(num1);
			}  else {
				System.out.println(num2);
}
			}
			void operator3(int num1, int num2) {
				if(num1  > num2)
				System.out.println(num2);
			}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		
				Ex4 ex4 = new Ex4();
				//타입의 값이 필요하다는 의미
				ex4.simple1(1);
				ex4.simple2();
				ex4.operator2();
		
		ex4.simple3("Hello World~!");
		
		ex4.simple5(3, 2, '+');
		ex4.simple5(3, 2, '-');
		
		
		int j = 2;
		while( j <=5) {
			int  i  =  1;
		while(i <= 9) {
			System.out.println("출력할 구구단(2~9) : " +   j  + "*"  + i  + "=" + (j*i));
				i += 1;
	}

}
	}
}

