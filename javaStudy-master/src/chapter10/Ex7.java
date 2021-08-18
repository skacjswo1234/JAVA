package chapter10;

public class Ex7 {
	// int -> add 메서드가 동작하고 나서 만들어 내는 결과값이 정수 // 매개변수는 없고 변환값은 있다 void 이외에는 리턴값이 필요// () -> 매개변수가 필요 없는 메서드
	//반환타입 
	// 정수 - byte, sort, int, long
	// 실수 - float, double
	// 문자 - char
	// 문자열 - String
	// 인스턴스 - 인스턴스에 맞는 클래스명 
	int add() {
		int result = 1 + 1;
		return result;
	}// 36%5의 결과를 실수값으로 반환하는 div 메서드 선언
	double div() {
		int result = 36 % 5;
		return (double) result;
	}
	// 1~5 까지의 누적 합을 정수로 반환하난 stackAdd 메서드 선언
	int stackAdd() {
		int add = 0;
		for( int i=1; i<=5; i++) {
			add += i;
		}
		return add;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex7 ex7 = new Ex7();
		int result = ex7.add();
		
	}
}
