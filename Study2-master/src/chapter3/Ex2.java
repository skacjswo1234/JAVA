package chapter3;

public class Ex2 {

	public static void main(String[] args) {
		Byte byteValue = Byte.valueOf((byte) 10);
		System.out.println(byteValue.byteValue());
	
		Short shortValue = Short.valueOf((short) 10);
		System.out.println(shortValue.shortValue());
		
		Long longValue = Long.valueOf( (long) 10);
		System.out.println(longValue.longValue());
		
		Float floatValue = Float.valueOf((float) 3.14 );
		System.out.println(floatValue.floatValue());
		
		Double doubleValue = Double.valueOf((double) 0.0);
		System.out.println(doubleValue.doubleValue());
		
		Character charValue = Character.valueOf((char) 'a');
		System.out.println(charValue.charValue());
		
		Boolean booleanValue = Boolean.valueOf((boolean) true) ;
		System.out.println(booleanValue.booleanValue());
		
		Integer intValue = Integer.valueOf((int) 0);
		System.out.println(intValue.intValue() );
	}

}
