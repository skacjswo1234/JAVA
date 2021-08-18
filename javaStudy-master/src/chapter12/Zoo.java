package chapter12;

public class Zoo {

	public static void main(String[] args) {
		
		//사육사 james 생성
		ZooKeeper james = new ZooKeeper();
		
		Animal animal1 = new Lion();
		
		//사자에게 먹이를 주기
		Lion lion = new Lion();
		james.feed(lion);
	
		// 토끼에게 먹이를 주기
		Rabbit rabbit = new Rabbit();
		james.feed(rabbit);
		
		// 원숭이에게 먹이를 주기
		Monkey monkey = new Monkey();
		james.feed(monkey);

	}

}
