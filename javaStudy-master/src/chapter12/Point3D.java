package chapter12;

// 3차원의 한점을 표현하기 위한 클래스
public class Point3D extends Point {
		private int z;
		
		public int getZ() {
			return z;
		}
	// 오버라이딩 : 부모 클래스에 정의되어있는 메서드를 자식 클래스에서 재정의하는 방법
/*	public String getLocation() {
			int x = getX();
			int y = getY();
			
			return "x : " + x + " , y : " + y + " , z :" + z ;*/
	
	// this와 마찬가지로 super 붙이지 않고 메서드를 호출	
		@Override
		public String getLocation() {
			// TODO Auto-generated method stub
			return super.getLocation() + " , z : " + z;
		}	
		
		}

