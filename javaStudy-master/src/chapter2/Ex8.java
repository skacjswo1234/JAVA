package chapter2;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		//[] 세로(heigth) [] 가로(width)
		int[][] arr1 = new int[2][2];
		System.out.println(arr1);
		double[][] arr2 = new double[3][2];
		
		char[][] arr3 =  new char[2][3];
		*/
		char[][] arr1 = new char[3][3];
		
		double[][] arr2 = new double[4][1];
		
	
		int[][] scores = {
				{84,93,52,42},
				{62,71,79,100},
				{55,80,33,52}};
		System.out.println(scores);
		
		//[] 세로(heigth) [] 가로(width)
		int[][] student = {
				{84,62,55},
				{93,71,80},
				{42,10052}};
		System.out.println(student[0][0]);
		System.out.println(student[0][1]);
		System.out.println(student[0][2]);
		
		

	}

}
