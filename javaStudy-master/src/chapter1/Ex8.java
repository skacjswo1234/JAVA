package chapter1;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char monja = 'A';
		int num = 20;
		
		//문자를 정수로 변환(업캐스팅)
		int num2 = monja;
		
		//정수를 실수로 변환 (업캐스팅)
		float fNum =  num;
		
		//다운캐스팅
		char var = (char) num;
		
		// 정수 - > 실수로 형 변환
		// 업캐스팅
		// 없음
		int c = 1;
		double d = (double) c;
		
		// 문자 -> 정수로 형 변환
		// 업캐스팅
		// 없음
		char e ='A';
		int f = (int) e;
		
		// 정수 -> 문자로 형 변환
		// 다운캐스팅
		// 있음
		int g = 100;
		char h =  (char) g;
	}

}
