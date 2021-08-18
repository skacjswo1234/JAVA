package chapter1;

import java.util.Scanner;

public class Ex1 {
	static String Text = "a";
	
	public static void main  (String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int val1 = 10;
		int val2 = 1;
		int[] val3 = new int[5]; //주소
	
		try {	
		//		System.out.println(val1 / --val2);
			
			int index = scanf.nextInt();
			if(index < 0 || index > 4) {
				// throw : 예외를 발생시키는 것 
				throw new WrongIndexException("인덱스는 0이상 4이하로만 사용할 수 있습니다.");
			}
			System.out.println(val3[index]);
			
							
		
		//예외 메세지를 분석하고
		// 두 가지 스타일의 catch문으로 처리하세요.
		// 1. 각 각의 catch문으로 예외처리 Ex  : catch (NullPointerException e ) {
		// 2.  | 로 예외들을 묶어서 하나의 catch문으로 예외처리   catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e ) {
				
			
			char c = Ex1.Text.charAt(0);
			
			// throw -> 예외를 의도적으로 발생시키는 키워드
			throw new MyException("MyException 발생");
			
		//	System.out.println("try의 끝");
			
		} catch (ArrayIndexOutOfBoundsException  e ) {
			System.out.println("배열의 범위를 벗어났습니다.");
			System.out.println("배열의 마지막 요소를 출력합니다.");
			
			System.out.println(e.getMessage());
			
			
			//사용하려는 배열의 마지막 요소 출력
			System.out.println(val3[val3.length-1]);
			
			} catch(ArithmeticException e) {
				System.out.println("예외가 발생했습니다.");
			
			} catch (NullPointerException e ) {
				System.out.println("NullPointerException 발생");
			} catch(MyException e) {
				System.out.println( e.getMessage());
			} catch(WrongIndexException e) {
				System.out.println("예외가 발생했습니다.");
			} finally {
				System.out.println("Finally 코드 실행");
				scanf.close();		
			}
			
					int result = val1 + val2;	
					System.out.println(result);
			}
}
