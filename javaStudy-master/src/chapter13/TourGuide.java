package chapter13;

public class TourGuide {
	//  여행을 위한 지식
	private Providable tour;
	
	public TourGuide(String location) {
		if(location.equals("korea")) {
			tour = new KoreaTour();
		} else if(location.equals("japan")) {
				tour = new JapanTour();
		}
				
	}
	public void doLeisureSports() {
		tour.leisureSports();
	}
	
	public void doSightseeing() {
		tour.sightseeing();
	}
	public void eatFood() {
		tour.food();
	}
}
