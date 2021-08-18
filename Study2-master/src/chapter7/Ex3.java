package chapter7;

public class Ex3 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThread2());
		Thread thread2 = new Thread(new MyThread3());
		
		// 멀티쓰레드 환경에서 2개의 작업을 처리하는데 소요된 시간 3028초
		thread1.start();
		thread2.start();

	}

}
