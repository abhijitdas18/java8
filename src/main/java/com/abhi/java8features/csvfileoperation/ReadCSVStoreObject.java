package com.abhi.java8features.csvfileoperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ReadCSVStoreObject {

	public static void main(String[] args) {

		String fileName = "resources" + "/" + "employee.csv";
		ReadCSVStoreObject csvStoreObject = new ReadCSVStoreObject();
		List<EmployeeObj> employees = csvStoreObject.convertCSVToObject(fileName);
		System.out.println("Employees : " + employees);
		System.out.println();
		Map<String, Double>  employeeAvgAgePerCity = csvStoreObject.averageAgePerCity(employees);
		System.out.println("employeeAvgAgePerCity :::: " + employeeAvgAgePerCity);
		System.out.println();
		
		Map<String, Integer> ageCity = csvStoreObject.highestAgePerCity(employees);
		System.out.println("ageCity :"+ ageCity);

	}
///////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////

	public List<EmployeeObj> convertCSVToObject(String fileName) {

		List<EmployeeObj> employees = new ArrayList<>();
		try {

			EmployeeObj employee = null;
			Reader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while ((line = br.readLine()) != null) {
				String[] columns = line.split(",");
				employee = new EmployeeObj(columns[0], columns[1], Integer.parseInt(columns[2]));
				employees.add(employee);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return employees;
	}

	// Aveage age of person in city
	// group by city,then calculate age
	public Map<String, Double>  averageAgePerCity(List<EmployeeObj> employees) {
		Map<String, Double> employeeAvgAgePerCity = employees.stream()
				.collect(Collectors.groupingBy(EmployeeObj::getCity, Collectors.averagingInt(EmployeeObj::getAge)));

		return employeeAvgAgePerCity;

	}
	
	public Map<String, Integer> highestAgePerCity(List<EmployeeObj> employees)
	{
		Map<String, List<EmployeeObj>> employeeObj = employees.stream().collect(Collectors.groupingBy(EmployeeObj:: getCity));
		System.out.println("employeeObj:" + employeeObj);
		
		Set<String> cities = employeeObj.keySet();
		List<Integer> age =null;
		Map<String, Integer> ageCity = new HashMap<>();
		int hAge = 0;	
		
        for(String city : cities)
        {
        	
        	List<EmployeeObj> empls = employeeObj.get(city);
        	age = new ArrayList<>();
        	for(EmployeeObj e : empls)
        	{
        		age.add(e.getAge());
        	}
        	hAge = findMax(age);
        	
        	ageCity.put(city, hAge);
        	
        }
        
        return ageCity;
		
		
	}
	public int findMax(List<Integer> age)
	{
		
		int max = 0;
		for(int a : age)
		{
			if(max < a)
			{
				max = a;
			}
		}
		return max;
	}
	
	

}

////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////

class EmployeeObj {
	private String name;
	private String city;
	private int age;

	public EmployeeObj(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
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
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", age=" + age + "]";
	}

}
