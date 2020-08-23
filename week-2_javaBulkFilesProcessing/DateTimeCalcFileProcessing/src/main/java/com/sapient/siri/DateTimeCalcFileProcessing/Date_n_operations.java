package com.sapient.siri.DateTimeCalcFileProcessing;

import java.time.LocalDate;
import java.util.Date;

//class to perform operations for choice "2)Add n days/months/years to given date" in menu.

public class Date_n_operations extends DateFormat{
	Date_n_operations()
	{
		super();
	}
	Date_n_operations(String date)
	{
		super(date);
	}
	
	//method to calculate 2.1)Add n days to given date and display date
	
	Date add_n_days(int ndays)
	{
		LocalDateTimeConvert obj=new LocalDateTimeConvert();
		LocalDate localcurdate=obj.convert(super.date);
		LocalDate localdatefinal=localcurdate.plusDays(ndays);
		Date datefinal=obj.convert_reverse(localdatefinal);
		return datefinal;	
	}
	
	//method to calculate 2.2)Add n weeks to given date and display date.
	
	Date add_n_months(int ndays)
	{
		
		LocalDateTimeConvert obj=new LocalDateTimeConvert();
		LocalDate localcurdate=obj.convert(super.date);
		LocalDate localdatefinal=localcurdate.plusMonths(ndays);
		Date datefinal=obj.convert_reverse(localdatefinal);
		return datefinal;
	}
	
	//method to calculate 2.3)Add n months to given date and display date.
	
	Date add_n_weeks(int ndays)
	{
		
		LocalDateTimeConvert obj=new LocalDateTimeConvert();
		LocalDate localcurdate=obj.convert(super.date);
		LocalDate localdatefinal=localcurdate.plusWeeks(ndays);
		Date datefinal=obj.convert_reverse(localdatefinal);
		return datefinal;
	}
}
