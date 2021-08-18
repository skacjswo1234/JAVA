package chapter1;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
	double fnum = 70.4;
		
		float fnum1 = 1.2345f;  //(f를 붙혀주면 float타입으로 변환되서 인식.)
		
		double d_value = 3.14;
		d_value = 7.81;
		
		int num =704;
		long num1 = 704l; // l을 붙혀주면 long타입으로 변환가능
		
		char monja1 = 'a';
		System.out.println(monja1);
		
		String monja2 = "65";
		System.out.println(monja2);
		
		String var1 = "ABCDEFG";
		String var2 = "안녕하세요";
		
		System.out.println(var1);
		System.out.println(var2);
		 
	/*	char var1= 'A';
		System.out.println(var1);
		
		char var2 = '1';
		System.out.println(var2-1);
*/	
		int var3 =1;
		System.out.println(var3-1);
		
		String var4 = "코리아IT아카데이";
		System.out.println(var4);
	
		String today = "2021-03-16";
		System.out.println(today);
		today = "2021-03-16";
		
		boolean bool = true;				//정수 : byte, short, int, long
		System.out.println(bool);			// 실수 : float, double
													//문자 : char
													//문자열 : String
													//논리값 : boolean
													
		 bool = false;
		System.out.println(bool);
		// 기본 데이터타입과 사용자 정의 데이터타입
		//기본 데이터 타입 - 자바 개발자가 만들어준 데이터의 형태
		// 사용자 저의 데이터타입 - 우리같은 개발자가 필요에 의해서 만든 데이터 타입
		//사용자 정의 데이터타입 - String
		
		//기본 데이터타입은 대입 연산자만을 사용해서 데이터를 저장할수 있다
		//사용자 정의 데이터타입은 대입 연산자와 new연산자를 사용해야 데이터를 저장할수 있다.
	}

}

