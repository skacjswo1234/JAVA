package chapter5;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		int genderValue = 1;
		
		Gender gender = Gender.getGender(genderValue);
		switch(gender) {
		case MALE :
			System.out.println("남성을 위한 쿠폰 지급");
			break;
		case FEMALE:
			System.out.println("여성을 위한 쿠폰지급");
			break;
		}
		
		
		
		
	
	}
	}


