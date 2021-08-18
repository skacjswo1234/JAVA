package chapter3;

public class Ex3 {

	private static final double BMI = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double  kg = 170;
		double tall = 65;
	
		System.out.println("BMI 지수 =" + kg / tall  * 10000);
			if(BMI < 18.5) {
				System.out.println("저체중");
			}
			if(BMI >=18.5 && BMI <=22) {
				System.out.println("정상");
			}
			if(BMI >=21&& BMI <=22) {
				System.out.println("과체중 의심");
			}
			if(BMI >=23 && BMI <=23) {
				System.out.println("비만");
			}
			if(BMI >=25 && BMI <=29) {
				System.out.println("고도비민");
			}
			if( BMI >=30) {
				System.out.println("고도비민");
			}
		
			}

	private static int tall() {
		// TODO Auto-generated method stub
		return 0;
	}
		
	}


