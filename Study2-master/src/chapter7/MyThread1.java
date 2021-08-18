package chapter7;

public class MyThread1 implements Runnable{
	@Override
	public void run() {
		long[] time = new long[2];
		//첫번째 작업을 시작하기전의 시간	 //현재 시간의 밀리초단위 시간
		long start = System.currentTimeMillis();
		
		int count = 0;
		for(int i=0; i<1000000; i++) {
			count++;
			
			if(count % 50 ==0) {
				System.out.println();
			} // end if
			
			System.out.println("-");
		} // end for 


//===============================================		
		
		
		// 두 번째 작업후 걸린 시간 
		 long end = System.currentTimeMillis();
		// 두  번째 작업의 소요시간
		time[1] = end - start;

			// 두 번째 작업후 걸린 시간 
			 start = System.currentTimeMillis();
			// 두  번째 작업의 소요시간
			time[0] = end - start;
			
			 long[] time1 = new long[2];
			//두번째 작업을 시작하기전의 시간	 //현재 시간의 밀리초단위 시간
			 start = System.currentTimeMillis();
			
			int count1 = 0;
			for(int i=0; i<1000000; i++) {
				count1++;
				
				if(count1 % 50 ==0) {
					System.out.println();
				} // end if
				
				System.out.println("|");
			} // end for 
			
			// 두 번째 작업후 걸린 시간 
			 end = System.currentTimeMillis();
			// 두  번째 작업의 소요시간
			time1[1] = end - start;
			
			System.out.println("소요시간1 = " + time1[0]);
			System.out.println("소요시간2 = " + time1[1]);
	}
}
