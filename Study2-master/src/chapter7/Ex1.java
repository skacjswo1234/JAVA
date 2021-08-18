package chapter7;

public class Ex1 {

	public static void main(String[] args)  {
			Thread thread = new Thread(new MyThread());
			// 1번밖에 사용못한다.(재활용X)
			thread.start();
			
			 thread = new Thread(new MyThread());
			// 1번밖에 사용못한다.(재활용X)
			thread.start();
	}

}
