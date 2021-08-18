package chapter5;

public class Ex1 {

	public static void main(String[] args) {
		BirthMonth[] birthMonthArr = BirthMonth.values();
		for(int i=0; i<birthMonthArr.length; i++) {
		BirthMonth birthMonth = birthMonthArr[i];
			System.out.println();
		
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
	
		//MALE, FEMALE ENUM을 배열로 만들어줌 .
		Gender[] genderArr = Gender.values();
		for(int i1=0; i1<genderArr.length; i1++) {
			Gender gender = genderArr[i1];
			System.out.println(genderArr[i1]);
		}
		
		for(Gender gender : genderArr) {
			System.out.println(gender);
		}
	
	
	}
	}
}
