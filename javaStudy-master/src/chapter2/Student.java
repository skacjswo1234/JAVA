package chapter2;

public class Student {

	String name;
	int age;
	String addr;
	int kor;
	int eng;
	int mat;
	int sum;
	double avg;
	
	//일반 변수는 카멜표기법으로 변수명을 짓는다
	
	//응시한 과목의 수 
	// 일반적으로 static final 키워드가 붙은 기준이되는 값은
	// 변수의 이름을 대문자로 지어준다.
	static final int AMOUNT_OF_SUBJECT = 3;
}
