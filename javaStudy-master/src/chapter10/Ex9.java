package chapter10;

public class Ex9 {
	// 세 add 메서드는 이름은 같지만 매개변수가 다르므로
	// 오버로딩된 메서드이다.
	//두 정수를 더한 결과를 반환하는 메서드
	int add(int num1, int num2) {
		return  num1 + num2;
	}
	// 두실수를 더한 결과를 반환하는 메서드
	double add(double num1, double num2) {
		return  num1 + num2;
	}
	// 하나의 정수와 하나의 실수를 더한 결과를 반환하는 메서드
	double add(int num1, double num2) {
		return  num1 + num2;
	}
	//인스턴스 멤버 메서드
	int num1;
	
	static int num2;
	
	void instanceMemberMethod() {
		System.out.println("인스턴스 멤버 메서드");
	}
	//클래스 멤버 메서드
	static void classMemberMethod() {
		System.out.println("클래스 멤버 메서드");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex9 ex9 = new Ex9();
		//인스턴스 멤버 메서드 호출
		ex9.instanceMemberMethod();
		//클래스 멤버 메서드 호출
		ex9.classMemberMethod();
	}

}
