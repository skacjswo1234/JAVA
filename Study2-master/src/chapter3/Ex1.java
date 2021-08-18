package chapter3;

public class Ex1 {

	public static void main(String[] args) {
		ClassName<Object> object1 = new ClassName<Object>();
		ClassName<String> object2 = new ClassName<String>();
		
		ClassName<Integer> object3 = new ClassName<>();
		ClassName<Double> object4 = new ClassName<>();
		
	//	Person<String> p1 = new Person<String>();
	//	Person<String> p2 = new Person<>();
		
		//제네릭 타입 자레이는 기본 데이터 타입은 들어갈 수 없음
		// 제네릭 타입 자리에는 클래스만 올 수 가 있다.
		// 기본 데이터 타입을 클래스로 만들어 두었다.
		// 정수, 실수, 문자를 제네릭 타입 자리에 쓰려면
		// 기본 데이터 타입을 클래스로 만들어둔 클래스를 사용해야한다.
	//	Person<Integer> p3 = new Person<Integer>();
	//	p3.setID(10);
	
	//Integer ID = p3.getID();
	//	int intID =ID.intValue();
		Person<String,Integer> p1 = new Person<>("010-1234-5678");
	//	Person<Integer> p2 = new Person<>(1012345678);
	}

}
