package com.sapient.siri.income;

import java.util.Comparator;

public class SortByIncome implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		String arr1[] = o1.split(",");
		String arr2[] = o2.split(",");
		return (int)Double.parseDouble(arr1[2]) - (int)Double.parseDouble(arr2[2]);
	}

}