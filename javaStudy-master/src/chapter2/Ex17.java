package chapter2;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학생정보 클래스 객체를만들기
		Student student1 = new Student();
		student1.kor = 56;
		student1.eng = 41;
		student1.mat = 88;
		student1.sum = student1.kor + student1.eng + student1.mat ;
		student1.avg = student1.sum / (double) Student.AMOUNT_OF_SUBJECT;
		
	
		
		//객체 추출
		System.out.println("철수의 총점 =" + student1.sum);
		System.out.println("철수의 평균 =" + student1.avg);
		
	}
}
