package chapter2;

public class SimpleType2 {
			int var1;
			static int var2;
			static int var3;
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
					
				SimpleType1 type1 = new SimpleType1();
				type1.num1 = 10;
				SimpleType1.num2 = 11;
					
		
				SimpleType1 type2 = new SimpleType1();
				type2.num1 = 20;
				SimpleType1.num2 = 21;
				
				System.out.println(type1.num1);
				System.out.println(type2.num1);
				
				System.out.println(SimpleType1.num2);
				System.out.println(SimpleType1.num2);
}
}
