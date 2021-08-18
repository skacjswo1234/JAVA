package chapter3;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//1번
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("첫 번쨰 수 입력 ( 0 <= x <= 100) :");
		int num1 = scanf.nextInt();
		
		System.out.print("두 번쨰 수 입력 ( 0 <= x <= 100) :");
		int num2 = scanf.nextInt();
		
		if((0 <= num1 && num1 <= 100) && (0 <= num1 && num1 <= 100)) {
			if(num1 >= num2) {
				System.out.println(num1);
			} else {
				System.out.println(num2);
			}
		}
		
		
		
		
		
		
		//2번
			Scanner scanf1 = new Scanner(System.in);
		
		System.out.print("성적 입력 ( 0 <= x <= 100) :");
		int grade = scanf1.nextInt();
		
		if(grade >=90 && grade <=100){
			System.out.println("A");
	} else  if (grade >=80 && grade <=89) {
		System.out.println("B");		
	} else  if (grade >=70 && grade <=70) {
		System.out.println("C");
	} else  if (grade >=60 && grade <=69) {
		System.out.println("D");
	} else {
		System.out.println("F");

	System.out.println("입니다.");
}
	}
}