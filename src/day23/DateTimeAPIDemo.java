package day23;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPIDemo {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println(today);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		System.out.println(LocalDate.of(1947, 8 , 15));
		System.out.println(LocalTime.of(18, 12,8,75));
		
		System.out.println(today.plusDays(7));
		System.out.println(today.plusMonths(4));
		System.out.println(today.plusWeeks(8));
		
		System.out.println(today.minusDays(7));
		
		LocalDate netflixSubscribeDate=LocalDate.now();
		LocalDate netflixSubscribeExpiryDate=netflixSubscribeDate.plusYears(1);
		System.out.println(netflixSubscribeExpiryDate);
		
		LocalDate netflixSubscribeExpiryDate1=LocalDate.of(2027, 07,15);
		LocalDate fifaWcFinalsDate=LocalDate.of(2026, 07,20);
		if(netflixSubscribeExpiryDate1.isAfter(fifaWcFinalsDate))
		{
			System.out.println("Enjoy the wc");
		}
		else
		{
			System.out.println("Please upgrade your subscription");
		}
		
		String formatted = netflixSubscribeExpiryDate.format(DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy"));
		System.out.println(formatted);
		
		
		String s = "26-01-1950"; //string convert into date
		String s1 = "10/10/1950"; //string convert into date
		LocalDate republicDay=LocalDate.parse(s1,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(republicDay.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) );
		
		ZoneId zone= ZoneId.of("Asia/Kolkata");
		System.out.println(zone);
		
		ZonedDateTime t1=ZonedDateTime.now(zone);
		System.out.println(t1);
		
		ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		ZonedDateTime usa = india.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println(usa);
		
		Instant instant = Instant.now();
		System.out.println(instant);
	}

}
