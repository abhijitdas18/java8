package com.abhi.java8features.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * reading a file using try with resource Java 1.7
 * @author AbDas
 *
 */
public class TryWithResourceEx1 {

	public static void main(String[] args) {

		String fileName = "Hello.txt";
		try(Stream<String> stream = Files.lines(Paths.get("resources" + "/" + fileName)))
		{
			//stream.forEach(System.out :: println);
			stream.forEach(x->System.out.println(x));  //java.lang.IllegalStateException: stream has already been operated upon or closed
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
