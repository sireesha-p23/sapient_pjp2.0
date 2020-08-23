package com.sapient.siri.DateTimeCalcFileProcessing;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.concurrent.TimeUnit;

//Class that performs operations for choice "1) Date and Date Arthmetic operations" in menu.

public class DateAndDateOperations extends DateFormat {

	DateAndDateOperations()
	{
		super();
	}
	DateAndDateOperations(String date)
	{
		super(date);
	}
	
	//method to perform "1.1)Add dates and display date"
	
	Date addDates_inDate(String date1,String date2)
	{
		setDate(date1);
		Date firstDate = getDate();
		setDate(date2);
		Date secondDate =getDate();
		long sum=secondDate.getTime() + firstDate.getTime();
		return (new Date(sum));	
	}
	
	//method to perform 1.2)subtract dates and display date
	
	Date subtractDates_inDate(String date1,String date2)
	{
		setDate(date1);
		Date firstDate = getDate();
		setDate(date2);
		Date secondDate =getDate();
		long diff = Math.abs(secondDate.getTime() - firstDate.getTime());
		return (new Date(diff));
	}
	
	//method to perform 1.3)Display period between two dates in terms of days
	
	long periodBtwDates_inDays(String date1,String date2) {
		setDate(date1);
		Date firstDate = getDate();
		setDate(date2);
		Date secondDate =getDate();
		long diff = Math.abs(secondDate.getTime() - firstDate.getTime());
	    long diffInDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	    return diffInDays;
	}
	
	//method to perform 1.4)Display period between two dates in terms of weeks
	
	double periodBtwDates_inWeeks(String date1,String date2)
	{
		long days=periodBtwDates_inDays(date1,date2);
		double weeks=days/7.0;
	    return weeks;
	}
	
	//method to perform 1.5)Display period between two dates in terms of months
	
	long periodBtwDates_inMonths(String date1,String date2) {
		setDate(date1);
		Date firstDate = getDate();
		setDate(date2);
		Date secondDate =getDate();
		LocalDateTimeConvert obj=new LocalDateTimeConvert();
		LocalDate dateone=obj.convert(firstDate);
		LocalDate datetwo=obj.convert(secondDate);
		Period age = Period.between(dateone, datetwo);
        long months = age.getMonths();
        return months;
	}
	

}
