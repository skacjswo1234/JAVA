package chapter1;

public class Ex2 {
	static double div(int val1,int val2) {
	try {
		double result = val1 / val2;
		
		return result;
	} catch(ArithmeticException  e ) {
			System.out.println(e.getLocalizedMessage());
			
			return 0;
		}
}
	static int readArrayElement(int index) throws ArrayIndexOutOfBoundsException   {

		try{
			int array[] = {9, 8, 7};
			
			if(index <0) {
				throw new WrongIndexException("인덱스는 0 또는 양의 정수만 가능");
			}
			return array[index];
		} catch(WrongIndexException e) {
			System.out.println(e.getLocalizedMessage());
			
			return 0;
		}
	}
	static void makeException(boolean turn) throws MyException {
		System.out.println("makeException 실행");
		
		if(turn) {
		throw new MyException("내가 만든 예외 발생");
		}
	}

	public static void main(String[] args)  {
		double result1 = div(10, 0);
		System.out.println(result1);
		
		// readArrayElement가 예외를 던지는데 처리(try-catch)하지 않았음에도 컴파일 오류가 발생하지않음.
		int result2 = readArrayElement(3);
			System.out.println(result2);
	
			// makeException이 예외를 던지는데 처리하지 않았더니 컴파일 오류가 발생하고 있음.
			makeException(false);
	
	}
}


