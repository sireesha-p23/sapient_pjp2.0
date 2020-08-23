package com.sapient.siri.DateTimeCalc;

public class FileFormatCalling {
public void fileformat()
{
	System.out.println("File formats : text, csv, json, xml");
	HistoryOf100SessionstoFile format=new HistoryOf100SessionstoFile();
	String fileName;
	fileName="/home/sireesha/eclipse-workspace2/DateTimeCalculatorConsole_IO/src/com/sapient/siri/DateTimeCalc/history100.txt";
	format.FileSessionHistory(fileName);
	fileName="/home/sireesha/eclipse-workspace2/DateTimeCalculatorConsole_IO/src/com/sapient/siri/DateTimeCalc/history100.csv";
	format.FileSessionHistory(fileName);
	fileName="/home/sireesha/eclipse-workspace2/DateTimeCalculatorConsole_IO/src/com/sapient/siri/DateTimeCalc/history100.json";
	format.FileSessionHistory(fileName);
	fileName="/home/sireesha/eclipse-workspace2/DateTimeCalculatorConsole_IO/src/com/sapient/siri/DateTimeCalc/history100.xml";
	format.FileSessionHistory(fileName);
}
}
