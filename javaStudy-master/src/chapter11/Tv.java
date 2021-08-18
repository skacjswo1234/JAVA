package chapter11;

public class Tv {
	// 외부로 공개하면 안되는 데이터를 감추는 것을 캡슐화, 정보은닉	
		
		private String color;
		private boolean power;
		private  int channel;
		private int volumn;
		private int hour;
		private int minute;
		
		public Tv() {
			color = "검정";
			power = false;
			channel =1;
		}
		
		// 객체지향프로그램 장단점
		// 객체지향은 데이터들을 갖고 있을 객체를 생각해야하고
		// 객체가 제공하는 기능을 설계해야하므로
		// 프로젝트 개발 기간이 길어지는 단점이 있음
		// 프로젝트의 규모가 커지면 점점 복잡해짐
		// 프로젝트를 객체지향적으로 제대로 설계를 해두면
		
		// 유지보수에 굉장히 유리하다.
		// 프로시저 장단점
		// 프로시져지향은 데이터만 생각하면 되므로
		// 프로젝트 개발 기간이 상대적으로 짧은 장점이 있음
		// 프로젝트의 규모가 커지면 데이터가 거미줄처럼 얽혀서 사용되므로
		// 유지보수 속도가 굉장히 느려진다.
		
		// setter -> private 접근 제어자인 멤버 변수에 원하는 값을 설정해야할 때 필요한 메서드
		public void setColor(String color) {
		// TV의 컬러는 RED, BLUE만 가능하다.
		if(color.equals("red") || color.equals("blue")) {  //이퀄스문으로 색비교 및 지정
			this.color = color;
		} else {
			System.out.println("컬러는 레드와 블루만 됩니다.");
		}
		}
		public void setPower(boolean power) {
			this.power = power;
		}

		public void setChannel(int channel) {
			this.channel = channel;
		}

		public void setVolumn(int volumn) {
			this.volumn = volumn;
		}

		public void setHour(int hour) {
			this.hour = hour;
		}

		public void setMinute(int minute) {
			this.minute = minute;
		}

		public void setSecond(int second) {
			this.second = second;
		}
		
		public int getVolumn() {
			return volumn;
		}

		public int getHour() {
			return hour;
		}

		public int getMinute() {
			return minute;
		}

		public int getSecond() {
			return second;
		}
		private int second;
		
		public String getColor() {
			return color;
		}
	
		public boolean getPower() {
			return power;
		}
	
		public int getChannel() {
			return channel;
		}
		
		
		// 좋은 메서드 - 한번에 하나의 기능만 제공하는 메서드
		// 1. 전원을 켜고
		// 2. 현재 채널 번호를 알려준다
	
		public void power() {
			power = !power;
			
			if(power) {
				System.out.println("전원을 켰습니다.");
			
				showChannel();
			} else {
				System.out.println("전원을 껐습니다");
			}
		}
		
		public void channelUp() {
			channel ++;
			channel = (channel % 500) + 1;
			showChannel();
		}	
		public void channelDown() {
			channel --;
			if(--channel < 1) {
				channel =500;
			}
			showChannel();
		}
		// channelUp/ Down 메서드를 위한 메서드
		private void showChannel() {
			System.out.println("현재 채널번호는" + channel + "번입니다.");
		}
		public Tv(String color) {
			
			this.color = color;
			System.out.println("매개변수 하나인 생성자");
		}
		public Tv(boolean power, int channel) {
			this.power = power;
			this.channel = channel;
			System.out.println("매개변수 두개인 생성자");
		}
}
