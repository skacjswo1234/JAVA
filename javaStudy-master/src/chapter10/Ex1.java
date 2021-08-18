package chapter10;

public class Ex1 { // Ex1 클래스는 메서드를 만들고 만든 메서드를 실행할 클래스
						// 메서드를 만든다 - > 메서드를 정의한다/ 선언한다.
	// 메서드 정의 
// 반환타입
	void simple1() {
		System.out.println(" Hello World~!");
	}
	void simple2() {
		System.out.println(" Java Program Start!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//매개변수가없고 반환값이 있는 메서드
		// simple1 메서드 호출 
		Ex1 ex1 = new Ex1();
		// simple1 메서드 호출
		ex1.simple1();
		ex1.simple1();
		ex1.simple1();
		ex1.simple1();
		ex1.simple1();
		ex1.simple1();
		
		Ex2 ex2 = new Ex2();
		ex2.programStartMessege();
		ex2.simple3();
		ex2.foundationDay();
		
	}

}
