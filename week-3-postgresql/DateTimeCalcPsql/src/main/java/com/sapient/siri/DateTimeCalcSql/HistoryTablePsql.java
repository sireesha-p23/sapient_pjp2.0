package com.sapient.siri.DateTimeCalcSql;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HistoryTablePsql {
	public void insertIntoHistory()
	{
		try {
			Connection c = null;
			Class.forName("org.postgresql.Driver");
	        c = DriverManager
	           .getConnection("jdbc:postgresql://localhost/psql",
	           "postgres", "siri");
	        try {
	  	      File myObj = new File("/home/sireesha/eclipse-workspace2/DateTimeCalcFileProcessing/src/main/java/com/sapient/siri/DateTimeCalcFileProcessing/RandomNumbers.txt");
	  	      File opObj=new File("/home/sireesha/eclipse-workspace2/historyoutputs.txt");
	  	      Scanner myReader = new Scanner(myObj);
	  	      Scanner opReader=new Scanner(opObj);
	  	      while (myReader.hasNextLine()) {
	  	        String data = myReader.nextLine();
	  	        StringTokenizer st = new StringTokenizer(data);
	  	        String input1 = st.nextToken();
	  	        String input2 = st.nextToken();
	  	        String line=opReader.nextLine();
	  	      PreparedStatement sql1=c.prepareStatement("INSERT INTO choiceInputs (choiceInput1, subchoiceInput2) VALUES  (?, ?);");
	   	     sql1.setInt(1, Integer.parseInt(input1));
	   	     sql1.setString(2,input2);
	   	         sql1.executeUpdate();
	   	         sql1.close();
	  	     PreparedStatement sql=c.prepareStatement("INSERT INTO choiceHistoryOutputs (choiceInput1, subchoiceInput2, historyOutput) VALUES  (?, ?, ?);");
	  	     sql.setInt(1, Integer.parseInt(input1));
	  	     sql.setString(2,input2);
	  	     sql.setString(3, line);
	  	     sql.executeUpdate();
	  	         sql.close();
	  	      
	  	      }
	  	      
	  	    PreparedStatement sqlquery=c.prepareStatement("SELECT COUNT(historyOutput) FROM choiceHistoryOuputs WHERE choiceInput1= ?");
	  	      sqlquery.setInt(1, 4);
	  	    ResultSet rs = sqlquery.executeQuery();
	  	    rs.next();
	  	    sqlquery.close();
	  	    int count=rs.getInt(1);
	  	    System.out.println(count);
	  	      myReader.close();
	  	      opReader.close();
	  	    } catch (FileNotFoundException e) {
	  	      System.out.println("An error occurred.");
	  	      e.printStackTrace();
	  	    }
		}
		catch(Exception e)
		{
			 e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
		}
	
	}
}
