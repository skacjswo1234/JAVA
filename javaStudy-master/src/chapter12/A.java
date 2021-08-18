package chapter12;

// 모든 클래스의 최상위 부모 클래는 Object 클래스
// 상속을 받지 않는 모든 클래스는 Object 클래스를 자동으로 상속 받는다.
public class A {
	public int num1;
	private int num2;
	int num3;
	protected int num4;
	
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
			this.num2 = num2;
		}
	}

