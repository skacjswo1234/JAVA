package chapter12;

public class TV {
		private boolean power;
		private int channel;
		
		public void power() {
			power = !power;
		}
		
		public void channelUp() {
			++channel;
		}
		public void channelDown() {
			--channel;
		}
}
