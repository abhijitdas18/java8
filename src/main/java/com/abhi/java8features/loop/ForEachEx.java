package com.abhi.java8features.loop;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

public class ForEachEx {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Abhi", "raju", "madhu", "jhon");
		
		//read all elements of a collection
		//forEach(Consumer )
		names.forEach(name -> System.out.print(name + ", "));
		System.out.println("\n.....................................");
		names.forEach(System.out :: println);
		
		System.out.println(".....................................");
		// using Consumer interface
		names.forEach(new MyConsumer());
		
		System.out.println(".....................................");
		// forEach with multi threaded
		ConcurrentHashMap<String, Integer> hashMap = new ConcurrentHashMap<>();
		hashMap.put("A", 1);
		hashMap.put("B", 2);
		hashMap.put("C", 3);
		hashMap.put("D", 4);
		hashMap.put("E", 5);
		hashMap.put("F", 6);
		hashMap.put("G", 7);
		hashMap.put("H", 8);
		hashMap.put("I", 9);
		hashMap.put("J", 10);
		hashMap.put("K", 11);
		hashMap.put("L", 12);
		hashMap.put("M", 13);
		hashMap.put("N", 14);
		System.out.println("ConcurrentHAshMap : ");
		hashMap.forEach((key,value) -> System.out.println("Key : " + key + ", Value : " + value + " Thread name : " + Thread.currentThread().getName()));
		
		System.out.println(".....................................");
		//Using parallelismThreshold
		//forEach(long parallelismThreshold,BiConsumer<? super K,? super V> action)
		System.out.println("Parallelism using threshold : ");
		hashMap.forEach(2, (key, value) -> System.out.println("Key : " + key + ", Value : " + value + " Thread name : " + Thread.currentThread().getName()));
		
/*		Output :
Key : A, Value : 1 Thread name : main
Key : H, Value : 8 Thread name : ForkJoinPool.commonPool-worker-2
Key : I, Value : 9 Thread name : ForkJoinPool.commonPool-worker-2
Key : L, Value : 12 Thread name : ForkJoinPool.commonPool-worker-1
Key : B, Value : 2 Thread name : main
Key : M, Value : 13 Thread name : ForkJoinPool.commonPool-worker-1
Key : J, Value : 10 Thread name : ForkJoinPool.commonPool-worker-2
Key : D, Value : 4 Thread name : ForkJoinPool.commonPool-worker-3
Key : N, Value : 14 Thread name : ForkJoinPool.commonPool-worker-1
Key : C, Value : 3 Thread name : main
Key : E, Value : 5 Thread name : ForkJoinPool.commonPool-worker-3
Key : K, Value : 11 Thread name : ForkJoinPool.commonPool-worker-2
Key : F, Value : 6 Thread name : ForkJoinPool.commonPool-worker-3
Key : G, Value : 7 Thread name : ForkJoinPool.commonPool-worker-3*/
		
		
		Map <String, Integer> map = new HashMap<>();
		map.put("A1", 1);
		map.put("B1", 2);
		map.put("C1", 3);
		map.put("D1", 4);
		map.put("E1", 5);
		map.put("F1", 6);
		map.put("G1", 7);
		//forEach(BiConsumer<? super K, ? super V> action)
		System.out.println("\nMap : ");
		map.forEach((k, v) -> System.out.print(k + " " + v + ", "));
		
		
		Map<String, Integer> linkedMap = new LinkedHashMap<>();
		linkedMap.put("A11", 1);
		linkedMap.put("B11", 2);
		linkedMap.put("C11", 3);
		linkedMap.put("D11", 4);
		linkedMap.put("E11", 5);
		linkedMap.put("F11", 6);
		linkedMap.put("G11", 7);
		System.out.println("\nLinkedMap :");
		linkedMap.forEach((k, v) -> System.out.print(k + "  " + v + ", "));
	}	

}

class MyConsumer implements Consumer<String> {
	
	@Override
	public void accept(String obj) {
		System.out.println("Traversing using accept() : " + obj);
	}

	
	
}
