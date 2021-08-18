package chapter3;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	/*	int num = 3;
		
		switch(num) {
		case 1:
			System.out.println("1입니다");
			break;
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			
		case 4:
			System.out.println("4입니다.");
			break;
			
		} // end switch
			System.out.println("프로그램 종료");
	} // end main
	// end class */
		// 1년동안 한권도 읽지 않았을 경우 
	/*
		int book = 2;
		
		switch(book) {
		case 0:
			System.out.println("조금 더 읽으시는게 좋겠어요!");
			break;
		case 1:
			System.out.println("한 권이나 읽으셨군요");
			break;
		case 2:
			System.out.println("책을 사랑하는 분이시네요!");
			break;
		default :
			System.out.println("다독왕입니다!");
			break;
			
} // end switch
} // end main
 // end class*/

//1년동안 읽은 책의수
int book = 100;

//1년동안 책의수를 몫으로 
book = book/10 ;

if(book >=0) {
switch(book ) {
case 0:
	System.out.println("조금 더 노력하세요");
	break;
case 1:
	System.out.println("책 읽는 것을 즐기시는 분 ");
	break;
case 2:
	System.out.println("책을 사랑하시는 분");
	break;
default :
	System.out.println("당신은 다독왕입니다!");
	break;
} 
} // end switch
} // end main
} // end class
