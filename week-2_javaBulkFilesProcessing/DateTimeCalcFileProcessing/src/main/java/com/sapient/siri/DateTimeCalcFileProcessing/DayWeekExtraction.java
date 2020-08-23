package com.sapient.siri.DateTimeCalcFileProcessing;

import java.time.*;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Date;

//class that performs "3)Day and week extraction of given date" in menu.
public class DayWeekExtraction extends DateFormat{
	DayWeekExtraction()
	{
		super();
	}
	DayWeekExtraction(String date)
	{
		super(date);
	}
	
	//method to perform 3.1)Day extraction of given date.
	
	DayOfWeek extractDay(String date)
	{
		setDate(date);
		Date d=getDate();
		LocalDateTimeConvert obj=new LocalDateTimeConvert();
		LocalDate localgivendate=obj.convert(d);
		DayOfWeek dayofweek=localgivendate.getDayOfWeek();
		return dayofweek;
	}
	
	//method to perform 3.2)Week extraction of given date
	
	int extractWeek(String date)
	{
		setDate(date);
		Date d=getDate();
		LocalDateTimeConvert obj=new LocalDateTimeConvert();
		LocalDate localgivendate=obj.convert(d);
        // create WeekFields 
		WeekFields weekFields= WeekFields.of(DayOfWeek.SUNDAY, 1);
        // apply weekOfMonth() 
		TemporalField weekOfMonth = weekFields.weekOfMonth(); 
		 // get week of month for localDate 
        int wom =localgivendate.get(weekOfMonth); 
        return wom;
	}
	
	
}
