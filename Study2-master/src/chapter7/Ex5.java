package chapter7;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		Thread thread = new Thread(new MyThread4());
		
		thread.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력하신 값은" + input + "입니다.");

	}

}
