package chapter11;

public class Ex2 {

	
	//속성 멤버변수
	//기능 메서드	
	
	boolean power;			
	int size;
	double cm;
	int  height;
	String color;
	String volumn;  
	int channel;
	
	void power() {
		power = !power;
		
		if(power) {
			System.out.println("전원을 켰습니다");
		} else {
			System.out.println("전원을 껐습니다");
		}
	}
	void channelUp() {
		channel++;
		System.out.println("현재채널번호는 :" + channel + "번입니다.");
	}	
	void channelDown() {
		channel--;
		System.out.println("현재채널번호는 :" + channel + "번입니다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1 obj = new Ex1();
		
		obj.num1 = 1;
		obj.num2 = 3.14;
		obj.num3 = 'a';
		obj.num4 = "Hello";
		
		obj.func1();
		obj.func2();
		obj.func3();
		obj.func4();
		System.out.println("================");
		
		
		Ex1 obj2 = new Ex1();
		obj2.num1 = 1;
		obj2.num2 = 3.14;
		obj2.num3 = 'a';
		obj2.num4 = "Hello";
		
		obj2.func1();
		obj2.func2();
		obj2.func3();
		obj2.func4();
	}

}
