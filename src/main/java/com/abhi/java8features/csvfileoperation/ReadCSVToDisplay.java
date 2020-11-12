package com.abhi.java8features.csvfileoperation;

import com.abhi.java8features.helper.PersonPerCapita;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Read the csv file
 * store into a java object
 * @author AbDas
 *
 */
public class ReadCSVToDisplay {

	public static void main(String[] args) {
		
		String fileName = "resources" + "/" + "Input.csv";
		readCSVToObject(fileName);

	}
	
	
	public  static void readCSVToObject(String fileName)
	{
		List<PersonPerCapita> persons = new ArrayList<>();
		
//		try(Stream<String> stream = Files.lines(Paths.get(fileName)))
//		{
//			stream.forEach(x -> System.out.println(x));
//			
//		}
//		catch(IOException ioe)
//		{
//			ioe.printStackTrace();
//		}
		
		Scanner scanner = null;
		try
		{
			scanner = new Scanner(new File(fileName));
			scanner.useDelimiter(",");
			scanner.hasNext();
			String[]line = null;
			while(scanner.hasNext())
			{
				System.out.print(scanner.next());
				//scanner
				
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			scanner.close();
		}
		
	}
	
	
	

}
