package chapter11;

public class Car {
	private int color;
	private int wheel;
	private float speed;
	private double fuel;
	
	public void setColor(int color) {
		this.color = color;
	}
	
	// 생성자 -> 인스턴스가 만들어질 때마다 자동으로 호출되는 메서드
	// 일반적인 메서드가 아니므로 이름이 정해져있음
	// 생성자 메서드의 이름은 클래스의 이름과 같아야한다.
	// 생성자 메서드는 반환타입이 없다.
	// 생성자의 접근 제어자는 public, private으로 중 하나를 쓸 수 있다.
	public Car() {
		// 인스턴스를 만들 때
		// 해당 인스턴스가 우리가 원하는 값을 갖고 있도록
		// 설정할 수 있음
		this(1, 4, 0, 0);
		
		System.out.println("매개변수 없이 인스턴스를 만들었을 때");
		System.out.println("이 생성자가 처리할 고유의 코드들");
		// 자동차의 색을 첫 번째 색으로 지정
	//	color = 1;
		// 바퀴의 개수를 4개로 지정
	//	wheel = 4;
		// 속력은 0
	//	speed = 0;
		// 연료량은 0
	//	fuel = 0;
	}
	// 오버로딩 매개변수 유무 차이 
	// 갯수 차이 	
	public Car( int color) {
		//생성자 안에서 다른 생성자를 호출하는 방법
		// this(매개변수) 는 생성자를 호출하는 방법
		// this( )를 사용하면 생성자를 호출할 수 있는데
		// 생성자만이 생성자를 호출할 수 있다.
		// 일반적인 메서드가 생성자를 호출 할 순 없다.
		//다른 생성자를 호출하는 이 코드는 생성자의 맨 위에 위치해야 한다.
		this(color, 0, 0.0f, 0.0);	
	}
	
	public Car( int color, int wheel) {
		this(color, wheel, 0.0f, 0.0);
	}
	
	public Car( int color, int wheel, float speed) {
		this(color, wheel, speed, 0.0);
	}
	
	public Car( int color, int wheel, float speed, double fuel) {
			this.color = color;
			this.wheel = wheel;
			this.speed = speed;
			this.fuel = fuel;
		}
}
