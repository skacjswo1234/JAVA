package chapter12;


// 2차원의 한 점을 표현하기 위한 클래스
public class Point {
			private int x;
			private int y;
			
			public String getLocation() {
				// 2차원의 한 점의 좌표를 문자열로 반환
				return " x : " + x + " , y :" + y;
			}

			public int getX() {
				return x;
			}

			public int getY() {
				return y;
			}
			
}
