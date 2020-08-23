package com.sapient.siri.DateTimeCalcFileProcessing;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateTimeConvert {
	
	//conversion from Date to LocalDate
	
	public LocalDate convert(Date dateToConvert) {
	    return dateToConvert.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDate();
	}
	
	//conversion from LocalDate to Date
	
	public Date convert_reverse(LocalDate dateToConvert) {
	    return java.util.Date.from(dateToConvert.atStartOfDay()
	      .atZone(ZoneId.systemDefault())
	      .toInstant());
	}
}
