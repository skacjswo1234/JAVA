package chapter12;
							// Person에서 상속받음	
public class Student extends Person {
	private int eye;
	private int mouth;
	private int finger;
	private int toe;
	
	//상속의 주의사항
	// - 클래스 내 코드가 중복된다고 해서 무조건 상속을 사용하면 안된다.
	// - Person, Student 클래스처럼 공통된 특징이 있는 상태에서
	// - 코드가 중복될 경우에만 상속을 사용할 수 있다.
	public void study() {
		System.out.println("공부하기");
	}
	
	public void run() {
		System.out.println("달리기");
	}
}
