package com.sapient.siri.DateTimeCalcFileProcessing;

public class FileFormatCalling {
public void fileformat(String writeline)
{
	FileHistoryOfOuputs format=new FileHistoryOfOuputs();
	String fileName;
	fileName="/home/sireesha/eclipse-workspace2/historyoutputs.txt";
	format.FileSessionHistory(fileName,writeline);
	fileName="/home/sireesha/eclipse-workspace2/historyoutputs.csv";
	format.FileSessionHistory(fileName,writeline);
	fileName="/home/sireesha/eclipse-workspace2/historyoutputs.json";
	format.FileSessionHistory(fileName,writeline);
	fileName="/home/sireesha/eclipse-workspace2/historyoutputs.xml";
	format.FileSessionHistory(fileName,writeline);
}
}
