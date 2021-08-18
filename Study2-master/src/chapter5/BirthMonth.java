package chapter5;

public enum  BirthMonth {
		Jan("= 1월"), Feb("= 2월"), Mar("= 3월"), Apr("= 4월"), May("= 5월"),
		Jun("= 6월"), Jul("= 7월"), Aug("= 8월"), Sep("= 9월"), Oct("= 10월"),
		Nov("= 11월"), Dec("= 12월"),   ;
	
		private final String korMonth;
		BirthMonth (String korMonth) {
			this.korMonth = korMonth; // 메서드 생성자.
		}
		
		public String getKorMonth() {
			return korMonth;
		}
		// 사용자가 xx월을 입력했을 때 해당하는 월의 상수를 반환하는 메서드
		 public static BirthMonth getBirthMonth(String month) {
			 BirthMonth[] birthMonthArr = BirthMonth.values();
				
			 BirthMonth result = null;
			 
				for(BirthMonth birthMonth : birthMonthArr) {
					// n번째 상수가 갖고있는 데이터인 xx월 문자열로 저장
					String korMonth = birthMonth.getKorMonth();
					if(month.equals(korMonth)) {
						result = birthMonth;			
					}
					
		 }
				return result;
}
}
