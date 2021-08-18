package chapter3;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("구구단 2단...");
		
		System.out.println("2 * 1 = "  + ( 2* 1));
		System.out.println("2 * 1 = "  + ( 2* 2));
		System.out.println("2 * 1 = "  + ( 2* 3));
		System.out.println("2 * 1 = "  + ( 2* 4));
		System.out.println("2 * 1 = "  + ( 2* 5));
		System.out.println("2 * 1 = "  + ( 2* 6));
		System.out.println("2 * 1 = "  + ( 2* 7));
		System.out.println("2 * 1 = "  + ( 2* 8));
		System.out.println("2 * 1 = "  + ( 2* 9));
		
		int j = 2;
		while( j <=5) {
			int  i  =  1;
		while(i <= 9) {
			System.out.println( j  + "*"  + i  + "=" + (j*i));
				i += 1;
		}  // end while i
		
		j = j+1;
		} // end while j			
		}
	}

