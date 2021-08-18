package chapter5;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
	
		String birth = "Jan";
		
		// 매개변수로 상수의 이름을 전달해서
		// 매개변수로 전달 받은 이름을 갖고 있는 상수를 찾을 수 있음
	try {
		BirthMonth birthMonth = BirthMonth.valueOf(birth);
		System.out.println(birthMonth);
		System.out.println(birthMonth.getKorMonth());
		
	}  catch(IllegalArgumentException e) {
		System.out.println("존재 하지 않는 상수입니다.");
	

	}	
}
}
