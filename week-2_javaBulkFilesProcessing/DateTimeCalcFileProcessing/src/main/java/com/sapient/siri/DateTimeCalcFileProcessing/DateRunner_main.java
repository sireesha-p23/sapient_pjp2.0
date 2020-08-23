package com.sapient.siri.DateTimeCalcFileProcessing;

import java.util.*;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.*;
public class DateRunner_main {
	public static void main(String[] args) {
		BufferedReader objReader = null;
		FileFormatCalling file=new FileFormatCalling();
		String line;
		String date1="23-01-1999";
	    String date2="01-09-1999";
	    int n=23;
		  try {

		   objReader = new BufferedReader(new FileReader("/home/sireesha/eclipse-workspace2/DateTimeCalcFileProcessing/src/main/java/com/sapient/siri/DateTimeCalcFileProcessing/RandomNumbers.txt"));
		   line = objReader.readLine();
		   while (line != null) {

		    StringTokenizer st=new StringTokenizer(line);
		    String ch="1";
		    String ch1="1.1";
		    if(st.hasMoreTokens())
		    	ch=st.nextToken();
		    if(st.hasMoreTokens())
		    	ch1=st.nextToken();
		    
		    int c=1;
		    if(ch.equals("1"))
		    	c=1;
		    if(ch.equals("2"))
		    	c=2;
		    if(ch.equals("3"))
		    	c=3;
		    if(ch.equals("4"))
		    	c=4;
		    switch(c)
		    {
		    case 1:
				DateAndDateOperations obj=new DateAndDateOperations();
				if(ch1.equals("1.1"))
				{
					Date op=obj.addDates_inDate(date1,date2);
					String writeline="1)Date and Date Arthmetic operations 1.1)Add dates and display date input date1="+date1+" input date2="+date2+"output="+obj.toString(op);
					file.fileformat(writeline);
				}
				else if(ch1.contentEquals("1.2"))
				{
					Date op=obj.subtractDates_inDate(date1,date2);
					String writeline="1)Date and Date Arthmetic operations 1.2)Subtract dates and display date input date1="+date1+" input date2="+date2+" output="+obj.toString(op);
					file.fileformat(writeline);
				}
				else if(ch1.contentEquals("1.3"))
					{
					long op=obj.periodBtwDates_inDays(date1,date2);
					String writeline="1)Date and Date Arthmetic operations 1.3)Display period between two dates in terms of days input date1="+date1+" input date2="+date2+" output="+Integer.toString((int)op);
				file.fileformat(writeline);
					}
				else if(ch1.contentEquals("1.4"))
				{
					double op=obj.periodBtwDates_inWeeks(date1,date2);
					int point=(int)((op-(Math.floor(op)))*10);
					String writeline="1)Date and Date Arthmetic operations 1.4)Display period between two dates in terms of weeks input date1="+date1+" input date2="+date2+" output="+Integer.toString((int)op)+"."+Integer.toString(point);
					file.fileformat(writeline);
				}
				else
				{
					long op=obj.periodBtwDates_inMonths(date1,date2);
					String writeline="1)Date and Date Arthmetic operations 1.3)Display period between two dates in terms of months input date1"+date1+" input date2="+date2+" output="+Integer.toString((int)op);
					file.fileformat(writeline);
				}
				break;
		    case 2:
				Date_n_operations obj2=new Date_n_operations(date1);
				 if(ch1.contentEquals("2.1"))
				 {
						Date op=obj2.add_n_days(n);
						String writeline="2)Add n days/months/years to given date 2.1)Add n days to given date and display date input date="+date1+" input n="+n+" output="+obj2.toString(op);
						file.fileformat(writeline);
				 }
				 else if(ch1.contentEquals("2.2"))
				 {
						Date op=obj2.add_n_weeks(n);
						String writeline="2)Add n days/months/years to given date 2.2)Add n weeks to given date and display date input date="+date1+" input n="+n+" output="+obj2.toString(op);
						file.fileformat(writeline);

				 }
				 else
				 {
						Date op=obj2.add_n_months(n);
						String writeline="2)Add n days/months/years to given date 2.3)Add n weeks to given date and display date input date="+date1+" input n="+n+" output="+obj2.toString(op);
						file.fileformat(writeline);
				 }
		    	 break;
		    case 3:
				DayWeekExtraction obj3=new DayWeekExtraction(date1);
				if(ch1.contentEquals("3.1"))
				{
	            	DayOfWeek op=obj3.extractDay(date1);
	            	String writeline="3)Day and week extraction of given date 3.1)Day extraction of given date input="+date1+" output="+op;
					file.fileformat(writeline);
				}
				else
				{
	            	int op=obj3.extractWeek(date1);
	            	String writeline="3)Day and week extraction of given date 3.1)week extraction of given date input="+date1+" output="+op;
					file.fileformat(writeline);
				}
				break;
		    case 4:
				NaturalLangPhrases obj4=new NaturalLangPhrases();
				if(ch1.equals("4.1"))
				{
	            	String op=obj4.inTermsofDays(date1);
	            	String writeline="4)Display given date in terms of Natural language phrases eg:today,tomorrow,last week,next month etc 4.1)Display date in terms of days input="+date1+" output="+op;
					file.fileformat(writeline);
				}
				if(ch1.equals("4.2"))
				{
	            	String op=obj4.inTermsofWeeks(date1);
	            	String writeline="4)Display given date in terms of Natural language phrases eg:today,tomorrow,last week,next month etc 4.1)Display date in terms of weeks input="+date1+" output="+op;
					file.fileformat(writeline);
				}
				if(ch1.equals("4.3"))
				{
	            	String op=obj4.inTermsofMonths(date1);
	            	String writeline="4)Display given date in terms of Natural language phrases eg:today,tomorrow,last week,next month etc 4.1)Display date in terms of months input="+date1+" output="+op;
					file.fileformat(writeline);
				}
				else
				{
	            	String op=obj4.inTermsofYears(date1);
	            	String writeline="4)Display given date in terms of Natural language phrases eg:today,tomorrow,last week,next month etc 4.1)Display date in terms of years input="+date1+" output="+op;
					file.fileformat(writeline);
				}
		    }
		    line=objReader.readLine();
		   }
		  } catch (IOException e) {

		   e.printStackTrace();

		  } finally {

			   try {
			    if (objReader != null)
			     objReader.close();
			   } catch (IOException ex) {
			    ex.printStackTrace();
			   }
			  }
			 }
			}

		  
		  
		  
		  
		  
		  
		