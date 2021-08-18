package chapter13;

// abstract 키워드를 붙이면 추상 클래스가 된다.
// 추상 클래스는 인스턴스를 생성 할  수 없다.
// 추상 클래스는 추상메서드가 필수는 아니다.
// 그러나 추상 메서드가 있는 클래스는 반드시 추상 클래스가 되어야한다.
public abstract class Player {
	public abstract void play(int pos);
	public abstract void stop();
	
}
