package chapter2;

import java.text.DecimalFormat;

public class Ex5 {

	public static void main(String[] args) {
		int balance = 1278455091;
		
		// #(샵) - 10진수, .(점) - 소수점구분자 , ,(콤마) - 콤마 문자 그자체 
		DecimalFormat df = new DecimalFormat("#,###");
		String data = (df.format(balance));
		System.out.println(data);
		
		double avg = 87.53710297;
		df = new DecimalFormat("#.##");
		System.out.println(df.format(avg));

	}

}
