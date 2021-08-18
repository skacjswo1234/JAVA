package chapter5;

public class Ex5 {
	@Deprecated
	public static final int oldValue = 10;
		
		public static void oldMethod() {
			System.out.println("old");
		}
		@Deprecated
		public static final int newValue = 11;
		
		public static void newMethod() {
			System.out.println("new");
		}
	
		public static void main(String[] args) {
		System.out.println(Ex5.oldValue);
		Ex5.oldMethod();
		
		System.out.println(Ex5.newValue);
		Ex5.newMethod();

	}

}
