package com.sapient.siri.DateTimeCalc;
import java.io.BufferedWriter;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

//Class to to capture, persist (file storage) and display history for the last 100 sessions


public class HistoryOf100SessionstoFile {
	public void FileSessionHistory(String fileName)
	{
		int sessionflag=1;	
		File myObj=null;
	 try {
		 //creating file
	       myObj = new File(fileName);
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println("File already exists:"+myObj.getName());
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	 try { 
		  
         // Open given file in append mode. 
         BufferedWriter out = new BufferedWriter( 
                new FileWriter(fileName, true));
         if(myObj.length()==0)
         {
         out.write("0");
         out.write("\n"+"\n");
         }
         //reading 1st line to get session number
         else
         {
        	 String firstline;
        	 String count="0";
        	 try(Scanner fileReader = new Scanner(myObj)) { 
        		  firstline=fileReader.nextLine(); 
        		} 
        	 StringTokenizer st=new StringTokenizer(firstline);
        		 count=st.nextToken();
        	 
        	 int scount=(Integer.parseInt(count))+1;
        	 if(scount==101)
        	 {
        		 myObj.delete();
        		 sessionflag=0;
        	 }
        	 Path filePath = Paths.get(fileName);
        	    List<String> lines = Files.readAllLines(filePath);
        	    lines.set(0, Integer.toString(Integer.parseInt(lines.get(0)) + 1));
        	    Files.write(filePath, lines);
             
         }
         if(sessionflag==1)
         {
         for(String s:DateRunner_main.history)
         {
         out.write(s+"\n"); 
         }
         out.write("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"); 
         }
         out.close(); 
     } 
     catch (IOException e) { 
         System.out.println("exception occoured" + e); 
     } 

   }
}

