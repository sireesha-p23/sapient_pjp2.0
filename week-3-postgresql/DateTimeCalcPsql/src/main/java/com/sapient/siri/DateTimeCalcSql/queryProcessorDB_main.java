package com.sapient.siri.DateTimeCalcSql;

public class queryProcessorDB_main{
	public static void main(String[] args) {
		
		DateOutput dop=new DateOutput();
		dop.dateOutputToFile();
		HistoryTablePsql history=new HistoryTablePsql();
		history.insertIntoHistory();
	}
	
}