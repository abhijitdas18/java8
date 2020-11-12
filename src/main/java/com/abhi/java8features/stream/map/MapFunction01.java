package com.abhi.java8features.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

// convert lower case to upper case using map
public class MapFunction01 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("abhi", "biju", "madu");
		
		//map(Function )
		List <String> nameUpper = names.stream().map(new MyFunctionToUpper()).collect(Collectors.toList());
		System.out.println("upper : " + nameUpper);

		List<String> nameUpper1 = names.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.print("Name upper : " + nameUpper1);

		//////////////////////////////
		names.stream().map(s -> s.toUpperCase()).forEach(x->System.out.println(x));
	}
	
	

}

class MyFunctionToUpper implements Function<String, String>
{
	@Override
	public String apply(String str)
	{
		return str.toUpperCase();
	}

	
}
