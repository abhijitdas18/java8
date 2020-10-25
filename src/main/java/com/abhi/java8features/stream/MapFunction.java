package com.abhi.java8features.stream;
// Convert a object into another object using map
// map(Function func)   -- a function that accepts one argument and produces a result.
// apply() is a method
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapFunction {

	public static void main(String[] args) {

		List<Staff> staff = Arrays.asList(
				new Staff("abhi", 32, new BigDecimal(3000)),
				new Staff("raju", 42, new BigDecimal(1000)),
				new Staff("Mike", 23, new BigDecimal(4000))
				);
		
		//System.out.println("Before conversion : " + );
		// convert the object Staff  into StaffPublic using map
		MyFunction mf = new MyFunction();
		List<StaffPublic> sp = staff.stream().map(mf).collect(Collectors.toList());
		
		System.out.println("After conversion : " + sp);
		
		// using lambda function		
		List<StaffPublic> sp01 = staff.stream().map(temp -> {
			StaffPublic staffpublic = new StaffPublic();
			staffpublic.setName( temp.getName());
			staffpublic.setAge(temp.getAge());
			staffpublic.setExtra(temp.getSalary().toString());
			return staffpublic;
		}).collect(Collectors.toList());
		System.out.println("Another approach : " + sp01);
	}


}
// a function that accepts one argument and produces a result.
class MyFunction implements Function<Staff, StaffPublic>
{
	@Override
	public StaffPublic apply(Staff staff)
	{
		StaffPublic sp = new StaffPublic();
		sp.setName( staff.getName());
		sp.setAge(staff.getAge());
		sp.setExtra(staff.getSalary().toString());
		return sp;
	}
	
}

class Staff
{
	private String name;
	private int age;
	private BigDecimal salary;
	
	public Staff(String name, int age, BigDecimal salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
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
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}

class StaffPublic
{
	private String name;
	private int age;
	private String extra;
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
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	@Override
	public String toString() {
		return "StaffPublic [name=" + name + ", age=" + age + ", extra=" + extra + "]";
	}
	
	
}
