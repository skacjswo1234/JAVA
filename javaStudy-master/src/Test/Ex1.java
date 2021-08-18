package Test;

import chapter11.Tv;

public class Ex1 {
	public static void main(String[] args) {
			
		Tv LG_TV = new Tv();
		LG_TV.setColor("red");
		
			//객체지향 프로그래밍은 기능을 중심으로 프로그램 개발하는 방법
			// 객체지향 프로그래밍은
			
			//전원을 켰을 때 현재 채널 번호를 알려주고 싶을때는?
			// 1. 전원을 켜고
			LG_TV.power();
			// 2. 채널 번호를 알려준다.
			// getter
			System.out.println("현재 채널 번호는 : " + LG_TV.getChannel() + "번 입니다.");
			LG_TV.channelDown();
			LG_TV.channelUp();
			
			//프로시저지향 프로그래밍 기법..
			//	LG_TV.channel++;
			
			
	
	}
}
