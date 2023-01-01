package com.sapient.app;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;


public class App {

	public static void main(String[] args) {
		String s= "welcome";
		long count = s.chars().filter(a->a=='w').count();
		System.out.println("No. of i's in 'welcome' is "+count);
		
		System.out.println("Number of days between two dates-method-1");
		try {
			// Convert `String` to `Date`
			    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
			    Date dateBefore = sdf.parse("04/21/2022");
			    Date dateAfter = sdf.parse("04/25/2022");

			// Calculate the number of days between dates
			    long timeDiff = Math.abs(dateAfter.getTime() - dateBefore.getTime());
			    long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
			    System.out.println("The number of days between dates: " + daysDiff);
			}catch(Exception e){
			    e.printStackTrace();
			}
		
		System.out.println("Number of days between two dates-method-2");
		LocalDate dateBefore = LocalDate.of(2022, 4, 21);
		LocalDate dateAfter = LocalDate.of(2022, 4, 25);

		Period period = Period.between(dateBefore, dateAfter);
		long daysDiff = Math.abs(period.getDays());

		System.out.println("The number of days between dates: " + daysDiff);
		
		
		
		try {
		    dateBefore = LocalDate.parse("2022-04-21");
		    dateAfter = LocalDate.parse("2022-04-25");
		    System.out.println("Number of days between two dates-method-3");
		    // Approach 1
		    daysDiff = ChronoUnit.DAYS.between(dateBefore, dateAfter);
		    
		    System.out.println("The number of days between dates: " + daysDiff);
		    
		    System.out.println("Number of days between two dates-method-4");
		    // Approach 2
		    daysDiff = dateBefore.until(dateAfter, ChronoUnit.DAYS);
		    System.out.println("The number of days between dates: " + daysDiff);
		    
		}catch(Exception e){
		    e.printStackTrace();
		}
		
		
		
		
		

	}

}
