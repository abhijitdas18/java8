package com.abhi.java8features.newinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionIterfaceDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Employee, String> empToString = new Function<Employee, String>() {

			@Override
			public String apply(Employee t) {
				
				return t.getName();
			}
			
		};
		
		List<Employee> emps = Arrays.asList(new Employee(1, "Abhi1"), 
				new Employee(2, "Abhi2"),
				new Employee(3, "Abhi3"),
				new Employee(4, "Abhi4")
				);
		
		List<String> empNameList = new ArrayList<>();
		for(Employee e: emps)
		{
			empNameList.add(empToString.apply(e));
			
		}
		
		System.out.println(empNameList);

	}

}

class Employee
{
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}