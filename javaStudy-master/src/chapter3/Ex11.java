package chapter3;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*		// i가 0부터
			int i  = 0;
			
			// 9이할일 동안
			while ( i <= 9)  {
				System.out.println(i);
				
				// 하나씩 증가하면서 
				i = i+ 1;
			} // end while*/
			
	/*		int a= 1;
				while( a <=10) {
					if (a % 2 == 0 )
						System.out.println(a);
					a = a +1;
					
				}
				//if문 없이 사용방법 
				int b= 2;
				while( b <=10) {
					if (b % 2 == 0 )
						System.out.println(b);
					b = b +2;  */
		int i = 10;
		
		while(i >= 1) {
			if( i % 2 == 1)
			System.out.println(i);			
			i = i-1;
				} //end while 		
		//-----------------------------
	
	int a = 11;	
		while(a >= 1) {
			System.out.println(a);
				a= a - 2;
				} //11, 9, 7, 5, 3, 1, -1	
		} // end main
} //end class	
