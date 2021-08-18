package chapter3;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanf = new Scanner(System.in);
		
		System.out.println("코리아  IT 자판기");
		System.out.println("1. 콜라");
		System.out.println("2. 환타");
		System.out.println("2. 사이다");
		System.out.println("4. 마운티 듀 ");
		System.out.println("자판기의 버튼을 누르세요");
		
		int button = scanf.nextInt();
		
		switch(button) {
		case 1 : System.out.println("콜라"); break;
		case 2 : System.out.println("환타"); break;
		case 3 : System.out.println("사이다"); break;
		case 4 : System.out.println("마운티듀"); break;
		default : System.out.println("1~4번만 누를수 있습니다.");
		}
		
		Scanner scanf1 = new Scanner(System.in);
		
		System.out.println("1,2,3번 버튼을 누르면 콜라");
		System.out.println("4번 버튼을 누르면 환타");
		System.out.println("5,6번 버튼을 누르면 사이다");
		System.out.println("7번 버튼을 누르면 사이다");
		System.out.println("4. 마운티 듀 ");
		System.out.println("자판기의 버튼을 누르세요");
		
		int button1 = scanf1.nextInt();
		
		switch(button1) {
		case 1 :  
		case 2 : 
		case 3 : 
			System.out.println("콜라"); break;
		case 4 : 
			System.out.println("환타"); break;
		case 5 : 
		case 6 :
			System.out.println("사이다"); break;
		case 7 : 
			System.out.println("마운티듀"); break;
		default : 
			System.out.println("1~7번만 누를수 있습니다.");
		}
	}

}
