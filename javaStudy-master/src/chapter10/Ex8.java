package chapter10;

public class Ex8 {
	int add(int num1, int num2) {
	int result = num1 + num2;
		return result;
	}
	// 두수를 나눈 나머지를 반환하는 div 메서드
	int div(int num1, int num2) {
		return num1 % num2;
	}
	// 1~N까지의 누적합을 반환하는 stackAdd 메서드
	// N은 0이상 100이하
	int stackAdd(int n) {
		if(n < 0 || n > 100) {
			System.out.println("n은 0이상 100이하만 가능합니다.");
	
			return -1;
		}
		int add = 0;
		
		for( int i=1; i<=n; i++) {
			add += n;
		}
		return add;
	}
	int div1(int num1, int num2) {
		return  num1 + num2;
	}
	float div2(float num1, float num2) {
		return  num1 + num2;
	}
	float div3(int num1, float num2) {
		return  num1 + num2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex8 ex8 = new Ex8();
		int result = ex8.add(1,1);
		System.out.println(result);
		
	}

}
