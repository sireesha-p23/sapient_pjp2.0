package com.sapient.siri.DateTimeCalcFileProcessing;
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


public class FileHistoryOfOuputs {
	public void FileSessionHistory(String fileName,String writeline)
	{
		File myObj=null;
	 try {
		 //creating file
		  myObj = new File(fileName);
	      if (myObj.createNewFile()) {
	      } else {
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	 try { 
		  
         // Open given file in append mode. 
         BufferedWriter out = new BufferedWriter( 
                new FileWriter(fileName, true));
         out.write(writeline); 
         
         out.write("\n"+"\n"); 
         out.close(); 
     } 
     catch (IOException e) { 
         System.out.println("exception occoured" + e); 
     } 

   }
}

