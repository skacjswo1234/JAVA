package chapter2;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.141592;
		
		double pi_1= pi * 1000;
		System.out.println( pi_1);
		
		double pi_2 = (int) (pi * 1000);
		System.out.println( pi_2);
		
		double pi_3 = (int) (pi * 1000) / 1000.0;
		System.out.println( pi_3);
		
		System.out.println( pi);

	}

}
