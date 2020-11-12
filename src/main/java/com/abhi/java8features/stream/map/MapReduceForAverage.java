package com.abhi.java8features.stream.map;
// mapToInt :
import java.util.ArrayList;
import java.util.List;
// find the average age of the employee using map reduce of java 8
public class MapReduceForAverage {

	public static void main(String[] args) {

		List<Employee001> employees = new ArrayList<>();
		employees.add(new Employee001("Abhijit", 34, 4000));
		employees.add(new Employee001("Raju", 31, 3000));
		employees.add(new Employee001("Pankaj", 24, 1000));
		employees.add(new Employee001("Pranab", 39, 4000));
		employees.add(new Employee001("Madhu", 45, 8000));
		employees.add(new Employee001("Raj", 21, 3000));
		
		averageAge(employees);
	}
	
	public static void averageAge(List<Employee001> emp)
	{
		Double averageAge = emp.stream().mapToInt(x -> x.getAge()).average().getAsDouble();
		System.out.println("Average age :" + averageAge);
		
		Double averageAge1 = emp.parallelStream().mapToInt(x->x.getAge()).average().getAsDouble();
		System.out.println("Average age :" + averageAge1);

		System.out.println("Using mapToInt");
		emp.stream().mapToInt(x -> x.getAge()).forEach(x-> System.out.print(x + ","));
		//alternate
	}

}





class Employee001
{
	private String name;
	private int age;
	private int salary;
	public Employee001(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
