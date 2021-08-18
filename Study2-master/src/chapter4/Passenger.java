package chapter4;

public class Passenger {
	
	

	private String name;
	private String tel;
	private String seat;

	public  Passenger (String name, String tel, String seat) { 
		this.name = name;
		this.tel = tel;
		this.seat =seat;
		
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	@Override
	public String toString() {	
		return "이름="+ name + tel  + seat;
	}
	// HashCode 구현
	@Override
	public int hashCode() {
		//String 클래스에 구현되어있는 HashCode를 적극적으로 활용하면
		//쉽고 간편하게 우리에게 필요한 해시 함수를 만들 수 있다.
		
	//	if(name.equals("홍길동")) {
	//		hashCode += 1;
	//	}
		
	//	if(tel.equals("010-7591-8524")) {
	//		hashCode += 2;
	//	}
		
	//	if(seat.equals("이코노미")) {
	//		hashCode += 3;		
		//	}
		//String 클래스의 hashCode 메서드
		// 문자열을 해시화함
		int hashCode = name.hashCode() + tel.hashCode() + seat.hashCode();
	
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Passenger) {
			// 매개변수로 전달받은 객체를 Passenger 클래스 타입으로 변환 할 수 있다면
			Passenger target = (Passenger) obj;
			
			return this.hashCode() == obj.hashCode();
		} else {
			// 매개변수로 전달받은 객체를 Passenger 클래스 타입으로 변환할 수 없다면
			// false
			return false;
		}
	}
}
	


