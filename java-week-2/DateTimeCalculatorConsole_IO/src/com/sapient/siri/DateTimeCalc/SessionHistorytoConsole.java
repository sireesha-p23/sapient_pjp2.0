package com.sapient.siri.DateTimeCalc;

// class to to capture and display history of the calculations in the session in Memory.

public class SessionHistorytoConsole {

  public void displaySessionHistory()
  {
	  for(String s:DateRunner_main.history)
	  {
		  System.out.println(s);
	  }
  }
}
