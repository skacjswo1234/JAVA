package chapter2;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] student = {
				{84, 62, 55},
				{93, 71, 80},
				{42, 100, 52}};

			
			int kor1 = student[0][0];
			
			// 행번호만 사용했을 때 적절한 타입의 변수에 저장하세요.
			//열번호로는 접근불가
			int[] student1 = student[0];
			System.out.println(student1[0]);
			System.out.println(student1[1]);
			System.out.println(student1[2]);
			
			int[][] studentInfo = new int[3][];
			studentInfo[0] = new int[3];
			studentInfo[1] = new int[5];
			studentInfo[2] = new int[1];
}
}