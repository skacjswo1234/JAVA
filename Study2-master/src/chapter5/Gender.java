package chapter5;

public enum Gender {
		MALE, FEMALE;
		
		public static Gender getGender(int value) throws IllegalArgumentException  {
			if(value ==1) {
				return Gender.MALE;
		} else if(value ==2) {
			return Gender.FEMALE;
		} else {
			throw new IllegalArgumentException();

}
		}
}
