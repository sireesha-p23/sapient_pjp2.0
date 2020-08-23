package com.sapient.siri.DateTimeCalcFileProcessing;

import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;

//class to perform 4)Display given date in terms of Natural language phrases eg:today,tomorrow,last week,next month etc" in menu.

public class NaturalLangPhrases extends DateAndDateOperations{
	NaturalLangPhrases()
	{
		super();
	}
	NaturalLangPhrases(String date)
	{
		super(date);
	}
	
	//method to perform 4.1)Display date in terms of days.
	
	String inTermsofDays(String date)
	{
		LocalDate now=LocalDate.now();
		LocalDateTimeConvert obj=new LocalDateTimeConvert();
		Date firstDate=obj.convert_reverse(now);
		setDate(date);
		Date secondDate =getDate();
		long flag=secondDate.getTime() - firstDate.getTime();
		long d = Math.abs(secondDate.getTime() - firstDate.getTime());
	    long diff = TimeUnit.DAYS.convert(d, TimeUnit.MILLISECONDS);
	    if(flag<0)
	    	diff=diff*-1;
		if(Math.abs(diff)==0)
		{
			return "Today";
		}
		else if(Math.abs(diff)==1)
		{
			if(diff==1)
				return "Tomorrow";
			else
				return "Yesterday";
		}
		else if(Math.abs(diff)==2)
		{
			if(diff==2)
				return "Day after Tomorrow";
			else
				return "Day before yesterday";
		}
		else
		{
			if(diff<0)
			{
				int absdiff=(int)Math.abs(diff);
			return Integer.toString(absdiff)+" days earlier";
			}
			else
			{
				return Integer.toString((int)diff)+" days from now";
			}
		}
		
		
	}
	
	//method to perform 4.2)Display date in terms of weeks.
	
	String inTermsofWeeks(String date)
	{
		LocalDate now=LocalDate.now();
		LocalDateTimeConvert obj=new LocalDateTimeConvert();
		Date firstDate=obj.convert_reverse(now);
		DayWeekExtraction w=new DayWeekExtraction(date);
		int thisweek=w.extractWeek(toString(firstDate));
		int thatweek=w.extractWeek(date);
		int diff=thisweek-thatweek;
		if(Math.abs(diff)==0)
		{
			return "This week";
		}
		else if(Math.abs(diff)==1)
		{
			if(diff==1)
				return "Last week";
			else
				return "Next week";
		}
		else
		{
			if(diff>0)
			{
				int absdiff=Math.abs(diff);
			return Integer.toString(absdiff)+" weeks earlier";
			}
			else
			{
				return Integer.toString(diff)+" weeks from now";
			}
		}	
	}
	
	//method to perform 4.3)Display date in terms of months.

	String inTermsofMonths(String date)
	{
		LocalDate now=LocalDate.now();
		int curmonth=now.getMonthValue();
		setDate(date);
		Date givenDate=getDate();
		LocalDateTimeConvert obj=new LocalDateTimeConvert();
		LocalDate localgivendate=obj.convert(givenDate);
		int givenmonth=localgivendate.getMonthValue();
		int diff=curmonth-givenmonth;
		int givenyear=localgivendate.getYear();
		int curyear=now.getYear();
		diff=(curyear-givenyear)+diff;
		if(Math.abs(diff)==0)
		{
			return "This month";
		}
		else if(Math.abs(diff)==1)
		{
			if(diff==1)
				return "Last month";
			else
				return "Next month";
		}
		else
		{
			if(diff>0)
			{
				int absdiff=Math.abs(diff);
			return Integer.toString(absdiff)+" months earlier";
			}
			else
			{
				int absdiff=Math.abs(diff);
				return Integer.toString(absdiff)+" months from now";
			}
	}
}
	//method to perform 4.4)Display date in terms of years.
	
	String inTermsofYears(String date)
	{
		LocalDate now=LocalDate.now();
		int curyear=now.getYear();
		setDate(date);
		Date givenDate=getDate();
		LocalDateTimeConvert obj=new LocalDateTimeConvert();
		LocalDate localgivendate=obj.convert(givenDate);
		int givenyear=localgivendate.getYear();
		int diff=curyear-givenyear;
		if(Math.abs(diff)==0)
		{
			return "This year";
		}
		else if(Math.abs(diff)==1)
		{
			if(diff==1)
				return "Last year";
			else
				return "Next year";
		}
		else
		{
			if(diff>0)
			{
				int absdiff=Math.abs(diff);
			return Integer.toString(absdiff)+" years earlier";
			}
			else
			{
				int absdiff=Math.abs(diff);
				return Integer.toString(absdiff)+" years from now";
			}
	}
	}
}
