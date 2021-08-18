package chapter13;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 부모 클래스에 정의되어있는 메서드를
		// 자식 클래스 마다 서로 다르게 구현해야할 때
		// 추상 클래스가 유용하게 사용됨
		
			Lion lion = new Lion();
			Person person = new Person();
			
			lion.run();
			lion.eat();
			
			person.run();
			person.eat();
			
			
	}

}
