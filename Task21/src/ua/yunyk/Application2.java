package ua.yunyk;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Application2 {
	
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d + "\n");
		System.out.println(dateToLoaclDate(d));
		System.out.println(dateToLocalTime(d));
		System.out.println(dateToLocalDateTime(d));
		
	}
	
	public static LocalDate dateToLoaclDate(Date d) {
		LocalDate ld = LocalDate.ofInstant(d.toInstant(), ZoneId.systemDefault());
		return ld;
	}
	
	public static LocalTime dateToLocalTime(Date d) {
		LocalTime lt = LocalTime.ofInstant(d.toInstant(), ZoneId.systemDefault());
		return lt;
	}
	
	public static LocalDateTime dateToLocalDateTime(Date d) {
		LocalDateTime ldt = LocalDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault());
		return ldt;
	}
	
}
