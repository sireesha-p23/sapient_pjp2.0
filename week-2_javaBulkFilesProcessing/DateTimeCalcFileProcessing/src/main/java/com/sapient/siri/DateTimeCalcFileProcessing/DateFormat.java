package com.sapient.siri.DateTimeCalcFileProcessing;
import java.util.*;
import java.io.Serializable;
import java.text.*;

//class to parse input date taken as string to type Date

public class DateFormat implements Serializable{
	Date date;
    DateFormat()
    {}
	DateFormat(String date)
	{
	    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	    try {
			this.date=sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public Date getDate() {
		return date;
	}
	public void setDate(String date) {
	    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	    try {
			this.date =sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	//method to convert from type Date to String
	String toString(Date date)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
	    String strDate = formatter.format(date);  
		return strDate;
	}
}
