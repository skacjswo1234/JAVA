package chapter12;

public class Ex6 {

	public static void main(String[] args) {
		// 과일 진열대에는 과일만 저장되도록
		// 사과는 과일이면서 상품이다.
		// 바나나는 과일이면서 상품이다.
		Product[] fruitShelf = new Product[3];
		fruitShelf[0] = new Apple();
		fruitShelf[1] = new Banana();
		
		//채소 진열대에는 채소만 저장되도록
		Product[] vegetableShelf = new Product[3];
		vegetableShelf[0] = new Apple();
		
		 Fruit f1 = new Fruit();
		
		// 사과를 담을 수 있는 바구니를 만들어서 바구니에 사과를 담아보세요
	//	Apple[] basket = new Apple[3];
	//	basket[0] = new Apple();
		
		// 바나나를 담을 수 있는 바구니를 만들어서 바구니에 바나나르 담아보세요.
	//	Banana[] bananabasket = new Banana[3];
	//	bananabasket[0] = new Banana();
		
		// 양파를 담을 수 있는 바구니를 만들어서 바구니에 양파를 담아보세요.
	//	Onion[] onionbasket = new Onion[3];
	//	onionbasket[0] = new Onion();
//	}
		
		
		Product[] basket = new Product[3];
		
		basket[0] = new Apple();
		basket[1] = new Banana();
		basket[2] = new Onion();
}
}
