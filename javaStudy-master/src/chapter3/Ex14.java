package chapter3;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 초기식 자리에 선안한 변수는 for문에서만 사용할 수 있다.
		//실행 순서 : 초기식  -> 조건식  -> 증감식  -> 조건식  -> 증감식  -> 조건식  -> . . .
		/*for ( int i =1; i<=10;  i++) { 
			System.out.println( i );*/
	/*	
		int sum = 0;
		for(int i =1; i<=10; i++) {
			sum += i ;
		}
		System.out.println(sum);*/
	
	int sum = 0;
	for(int i =1; i<=10; i++) {
		int su = i%2;
		
		if(su == 1) sum += i;
	}
	System.out.println(sum);

	int sum1 = 0;
	for(int i =1; i<=10; i++) {
		int su1 = i%2;
		
		if(su1 == 0) sum1+= i;
	}
	System.out.println(sum1);
	
	int sum2 = 0;			//2씩 증가 
	for(int i =2; i <=10;  i+=2) {
	sum2 += i;
	}
	System.out.println(sum2);
}
		
}
