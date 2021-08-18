package chapter10;

public class Ex6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex6 ex6 = new Ex6();
		
		SimpleType1 type = new SimpleType1();
		type.num1 = 10;
		
		System.out.println("before : " + type.num1);
		ex6.change(type);
		System.out.println("after : " + type.num1);
		
		int[] arr = {1, 2, 3};
		System.out.println("before : " + arr[0]);
		ex6.change(arr);
		System.out.println("after : " + arr[0]);
		
		System.out.println("before : " + arr[0]);
		ex6.change(arr[0]);
		System.out.println("after : " + arr[0]);
		}
		//클래스 타입 	
	void change(SimpleType1 type) {
			type.num1 = type.num1 * 10;
			 System.out.println("change(SimpleType1) : " + type.num1);
		}
		// 배열타입
		void change(int[]arr) {
			arr[0] = arr[0] * 10;
			
			System.out.println("change(int[]) : " + arr[0]);
		}
		//기본타입
		void change(int num1) {
			num1 = num1 * 10;
			System.out.println("change(int) : " + num1);
		}

}


