package com.sapient.siri.income;

import java.io.IOException;

public class IncomeRunner_main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String csvFile = "/home/sireesha/Desktop/SapientCodingExercise/src/com/sapient/siri/income/incomes.csv";
	       FileReaderCSV.read(csvFile);
	       OutputTableGenerator.printLog();;
	}

}
