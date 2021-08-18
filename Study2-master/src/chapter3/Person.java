package chapter3;

// E - Element
// K - Key
// V - Value
// T - Type
// N - Number
public class Person<T1, T2> {
		private int eye;
		
		private int nose;
		
		private int mouth;
		
		private T1 tel;
	
		private T2 id;
		
		public Person(T1 tel) {
			this.tel = tel;
		}
		
		public void setTel(T1 tel) {
			this.tel = tel;
		}
	
		
	/*	public Person(int eye, int nose, int mouth, T id) {
			this.eye = eye;
			this.nose = nose;
			this.mouth = mouth;
			this.id = id;
		} */
		
		public void add(T1 val1, T1 val2) {
			System.out.println(1);
		}

		public void setID(T2 id) {
			this.id = id;
		}
		
		public T2 getID() {
			return id;
		}
	
		
}
