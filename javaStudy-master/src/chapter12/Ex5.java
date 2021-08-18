package chapter12;

public class Ex5 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		 //(업캐스팅) 작은범위 ~ 큰
		car = (Car) fe1;  //행변환 연산자 생략가능
		
		fe2 = (FireEngine) car; // (다운캐스팅) 큰 범위 ~ 작은 범위 
		
		//car.water();
		fe1.water();
		fe2.water();
		
		FireEngine fe = new FireEngine();
		System.out.println(fe instanceof FireEngine);
		System.out.println(fe instanceof Car);
		System.out.println(fe instanceof Object);
	
		Car car1 = new Car();
		System.out.println(car1 instanceof FireEngine);
		System.out.println(car1 instanceof Car);
		System.out.println(car1 instanceof Object);

}
}
