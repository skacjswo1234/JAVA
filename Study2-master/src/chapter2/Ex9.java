package chapter2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex9 {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		
		dateTime = LocalDateTime.of(2021, 03, 19, 00, 00 ,00);
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		
		dateTime = LocalDateTime.of(date, time);
		
		date = dateTime.toLocalDate();
		
		time = dateTime.toLocalTime();
		
		dateTime = date.atTime(time);
		
		dateTime = time.atDate(date);

	}

}
