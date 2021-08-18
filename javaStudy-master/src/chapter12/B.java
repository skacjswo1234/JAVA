package chapter12;

// 상속을 받으면 부모 클래스에 있는 대부분의 멤버 변수와 멤버 메서드를 사용할 수 있다.
// 부모 클래스에 정의되어있는 생성자는 상속 받을 수 없다.
// private 접근 제어자로 되어있는 멤버 변수, 메서드는 상속을 받기는 하지만
// 자식 클래스가 접근할 수 없는 멤버의 형태로 상속을 받는다.
public class B extends A {
	
	public void showNum1() {
		System.out.println(this.num1);
		System.out.println(this.getNum2());
		
		
	
	}
	
	
	
}
