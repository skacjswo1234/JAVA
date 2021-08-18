package chapter11;

public class SimpleType {
	
	public int num1;
	int num2; // default는 자동으로 접근제어로 되어있는 상태 . 
	private int num3;
	
	public void func1() {
		System.out.println("func1");
	}
	void func2() {
		System.out.println("func2");
	}	
	void func3() {
		System.out.println("func3");
	}
}
