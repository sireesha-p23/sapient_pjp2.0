package com.sapient.siri.DateTimeCalc;

import java.util.*;
import java.time.*;
import java.util.Scanner;
public class DateRunner_main {
	public static List<String> history=new ArrayList<>();
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("----------------------------------menu----------------------------------------------");
		System.out.println("1)Date and Date Arthmetic operations");
		System.out.println("2)Add n days/months/years to given date");
		System.out.println("3)Day and week extraction of given date");
		System.out.println("4)Display given date in terms of Natural language phrases eg:today,tomorrow,last week,next month etc");
		int flag=1;
		while(flag==1)
		{
		System.out.println("Input date should be in dd-mm-yy foramt");
		System.out.println("Enter your choice among 1,2,3,4");
		int ch=scan.nextInt();
		switch(ch)
		{
		case 1: 
			DateAndDateOperations obj=new DateAndDateOperations();
			System.out.println("1.1)Add dates and display date");
			System.out.println("1.2)subtract dates and display date");
			System.out.println("1.3)Display period between two dates in terms of days");
			System.out.println("1.4)Display period between two dates in terms of weeks");
			System.out.println("1.5)Display period between two dates in terms of months");
			System.out.println("Enter your choice among 1.1, 1.2, 1.3, 1.4, 1.5");
			String ch1=scan.next();
			if(ch1.equals("1.1"))
			{
				System.out.println("Enter 2 dates");
				String date1=scan.next();
				String date2=scan.next();
				Date op=obj.addDates_inDate(date1,date2);
				System.out.println(obj.toString(op));
				history.add("1)Date and Date Arthmetic operations 1.1)Add dates and display date input date1="+date1+" input date2="+date2+"output="+obj.toString(op));
			}
			else if(ch1.equals("1.2"))
			{
				System.out.println("Enter 2 dates");
				String date1=scan.next();
				String date2=scan.next();
				Date op=obj.subtractDates_inDate(date1,date2);
				System.out.println(obj.toString(op));
				history.add("1)Date and Date Arthmetic operations 1.2)Subtract dates and display date input date1="+date1+" input date2="+date2+" output="+obj.toString(op));
			}
			else if(ch1.equals("1.3"))
			{
				System.out.println("Enter 2 dates");
				String date1=scan.next();
				String date2=scan.next();
				long op=obj.periodBtwDates_inDays(date1,date2);
				System.out.println(op);
				history.add("1)Date and Date Arthmetic operations 1.3)Display period between two dates in terms of days input date1="+date1+" input date2="+date2+" output="+Integer.toString((int)op));
			}
			else if(ch1.equals("1.4"))
			{
				System.out.println("Enter 2 dates");
				String date1=scan.next();
				String date2=scan.next();
				double op=obj.periodBtwDates_inWeeks(date1,date2);
				System.out.println(op);
				int point=(int)((op-(Math.floor(op)))*10);
				history.add("1)Date and Date Arthmetic operations 1.4)Display period between two dates in terms of weeks input date1="+date1+" input date2="+date2+" output="+Integer.toString((int)op)+"."+Integer.toString(point));
			}
			else if(ch1.equals("1.5"))
			{
				System.out.println("Enter 2 dates");
				String date1=scan.next();
				String date2=scan.next();
				long op=obj.periodBtwDates_inMonths(date1,date2);
				System.out.println(op);
				history.add("1)Date and Date Arthmetic operations 1.3)Display period between two dates in terms of months input date1"+date1+" input date2="+date2+" output="+Integer.toString((int)op));
			}
			
			else
				System.out.println("invalid choice");
			break;
		case 2:
			System.out.println("Enter a date");
			String date=scan.next();
			Date_n_operations obj2=new Date_n_operations(date);
			System.out.println("2.1)Add n days to given date and display date");
			System.out.println("2.2)Add n weeks to given date and display date");
			System.out.println("2.3)Add n months to given date and display date");
			System.out.println("Enter your choice among 2.1, 2.2, 2.3");
			String ch2=scan.next();
			if(ch2.equals("2.1"))
			{
				System.out.println("Enter no.of days to be added");
				int n=scan.nextInt();
				Date op=obj2.add_n_days(n);
				System.out.println(obj2.toString(op));
				history.add("2)Add n days/months/years to given date 2.1)Add n days to given date and display date input date="+date+" input n="+n+" output="+obj2.toString(op));

			}
			else if(ch2.equals("2.2"))
			{
				System.out.println("Enter no.of weeks to be added");
				int n=scan.nextInt();
				Date op=obj2.add_n_weeks(n);
				System.out.println(obj2.toString(op));
				history.add("2)Add n days/months/years to given date 2.2)Add n weeks to given date and display date input date="+date+" input n="+n+" output="+obj2.toString(op));
			}
			else if(ch2.equals("2.3"))
			{
				System.out.println("Enter no.of months to be added");
				int n=scan.nextInt();
				Date op=obj2.add_n_months(n);
				System.out.println(obj2.toString(op));
				history.add("2)Add n days/months/years to given date 2.3)Add n weeks to given date and display date input date="+date+" input n="+n+" output="+obj2.toString(op));
			}
			else
				System.out.println("invalid choice");
			break;
		case 3:
			System.out.println("Enter a date");
			String date3=scan.next();
			DayWeekExtraction obj3=new DayWeekExtraction(date3);
			System.out.println("3.1)Day extraction of given date");
			System.out.println("3.2)Week extraction of given date");
            System.out.println("Enter choice among 3.1, 3.2");
            String ch3=scan.next();
            if(ch3.equals("3.1"))
            {
            	DayOfWeek op=obj3.extractDay(date3);
				System.out.println(op);
				history.add("3)Day and week extraction of given date 3.1)Day extraction of given date input="+date3+" output="+op);

            }
            else if(ch3.equals("3.2"))
            {
            	int op=obj3.extractWeek(date3);
				System.out.println(op);
				history.add("3)Day and week extraction of given date 3.2)Day extraction of given date input="+date3+" output="+Integer.toString(op));

            }
            else
				System.out.println("invalid choice");
			break;
		case 4:
			System.out.println("Enter a date");
			String date4=scan.next();
			NaturalLangPhrases obj4=new NaturalLangPhrases();
			System.out.println("4.1)Display date in terms of days");
			System.out.println("4.2)Display date in terms of weeks");
			System.out.println("4.3)Display date in terms of months");
			System.out.println("4.4)Display date in terms of years");
            System.out.println("Enter choice among 4.1, 4.2, 4.3, 4.4");
            String ch4=scan.next();
            if(ch4.equals("4.1"))
            {
            	String op=obj4.inTermsofDays(date4);
            	System.out.println(op);
				history.add("4)Display given date in terms of Natural language phrases eg:today,tomorrow,last week,next month etc 4.1)Display date in terms of days input="+date4+" output="+op);
            }
            else if(ch4.equals("4.2"))
            {
            	String op=obj4.inTermsofWeeks(date4);
            	System.out.println(op);
				history.add("4)Display given date in terms of Natural language phrases eg:today,tomorrow,last week,next month etc 4.2)Display date in terms of weeks input="+date4+" output="+op);

            }
            else if(ch4.equals("4.3"))
            {
            	String op=obj4.inTermsofMonths(date4);
            	System.out.println(op);
				history.add("4)Display given date in terms of Natural language phrases eg:today,tomorrow,last week,next month etc 4.3)Display date in terms of months input="+date4+" output="+op);

            }
            else if(ch4.equals("4.4"))
            {
            	String op=obj4.inTermsofYears(date4);
            	System.out.println(op);
				history.add("4)Display given date in terms of Natural language phrases eg:today,tomorrow,last week,next month etc 4.4)Display date in terms of years input="+date4+" output="+op);
            }
            else
				System.out.println("invalid choice");
			break;
		default:
			System.out.println("invalid choice");	
		}
		System.out.println("Do you want to continue 1/0");
		 flag=scan.nextInt();
		}
		System.out.println("Do you want to see history of this session 1/0");
		int hist=scan.nextInt();
		if(hist==1)
		{
			SessionHistorytoConsole h=new SessionHistorytoConsole();
			h.displaySessionHistory();
		}
		FileFormatCalling file=new FileFormatCalling();
		file.fileformat();
	}
}
