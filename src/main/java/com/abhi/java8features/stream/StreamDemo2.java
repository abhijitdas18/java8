package com.abhi.java8features.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {

		List <Employee01> employees  = Arrays.asList(
				new Employee01("Abhijit", 34, 5.8f, "Male", true ),
				new Employee01("Raju", 30, 5.2f, "Male", false ),
				new Employee01("Ravi", 31, 5.1f, "Male", true ),
				new Employee01("Madhu", 24, 6.0f, "Female", false ),
				new Employee01("Rajat", 44, 57f, "Male", true )
				);
		
		System.out.println("Display all Employee01 age is more than 30.......");
		Predicate <Employee01> empMoreThan30 = emp ->emp.getAge() > 30;
		empShow(employees, empMoreThan30);
		
		System.out.println("Display all female.......");
		Predicate <Employee01> empFemale = emp -> emp.getSex().equals("Female");
		empShow(employees, empFemale);
		
		
		System.out.println("Display all local Employee01.......");
		Predicate<Employee01> empLocal = emp ->emp.isLocal() == true;
		empShow(employees, empLocal);
		
		////////////////////////////////////////////////////////////////////////
		System.out.println("Display all Employee01 age is more than 30.......");
		employees.stream().filter(emp -> emp.getAge() > 30).forEach(x ->  System.out.println(x));
		
		System.out.println("Display all female.......");
		employees.stream().filter(emp -> emp.getSex().equals("Female")).forEach(System.out::println);
		
		System.out.println("Display all local Employee01.......");
		employees.stream().filter(emp -> emp.isLocal()).forEach(System.out::println);
		
		///////////////////////////////////////////////////////////////////////
		System.out.println("Get a Male Employee01");
		Optional <Employee01> anEmp = employees.stream().filter(x->x.getSex().equals("Male")).findFirst();
		System.out.println("Emp : " + anEmp);
		
		System.out.println("Get a Male Employee01 whose age less than 20. NO record found" );
		Optional <Employee01> anEmp20 = employees.stream()
				.filter(x->x.getSex().equals("Male"))
				.filter(x->x.getAge() < 20).findFirst();
		System.out.println("Emp : " + anEmp20);
		if(anEmp20.isPresent())
		{
			System.out.println("Emp is present");
		}
		else
		{
			System.out.println("Emp is not present");
		}
		
		// Use of map. map modifies the stream with the input condition
		System.out.println("Display the male names in upper case ");
		employees.stream().filter(x -> x.getSex().equals("Male")).map(x->x.getName().toUpperCase()).forEach(System.out::println);
		List<String> name = employees.stream().filter(x->x.getSex().equals("Male")).map(x->x.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println("Name : " + name);
		
		// Use of map . Display upper case of names
		employees.stream().map(e-> e.getName().toUpperCase()).forEach(System.out::println);
		
		// Check the list is not empty. Use of Collectors
		List<String> names = Arrays.asList("Abhi", " Raj", "Mohan", "Ravi");
		List<String> res = names.stream().filter(x-> !x.isEmpty()).collect(Collectors.toList());
		System.out.println("Result : " + res);
		
		List<String> emptyList = new ArrayList<>();
		List<String> res1 = emptyList.stream().filter(x-> !x.isEmpty()).collect(Collectors.toList());
		System.out.println("Result : " + res1);
		
		List<String> res2 = emptyList.stream().collect(Collectors.toList());
		System.out.println("Result : " + res2);
		
		//emptyList.add("Raj");
		emptyList.stream().forEach(x->System.out.println(x));
		
		
	}
	
	static void empShow(List<Employee01> Employee01, Predicate<Employee01> predicate)
	{
		List<Employee01> result = new ArrayList<>();
		for(Employee01 emp : Employee01)
		{
			if(predicate.test(emp))
			{
				result.add(emp);
			}
		}
		System.out.println(result);
	}

}

class Employee01
{
	String name;
	int age;
	float height;
	String sex;
	boolean isLocal;
	public Employee01(String name, int age, float height, String sex, boolean isLocal) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.sex = sex;
		this.isLocal = isLocal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public boolean isLocal() {
		return isLocal;
	}
	public void setLocal(boolean isLocal) {
		this.isLocal = isLocal;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + ", sex=" + sex + ", isLocal=" + isLocal
				+ "]";
	}	
}
