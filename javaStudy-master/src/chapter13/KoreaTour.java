package chapter13;
// 한국여행을 위한 지식
public  class KoreaTour implements Providable {
	@Override
	public  void leisureSports() {
		System.out.println("한강에서 수상스키투어");
}
	@Override
	public  void sightseeing() {
		System.out.println("경북궁 관람 투어");
}
	@Override
	public  void food() {
		System.out.println("전주 비빔밥 투어");
}
}
