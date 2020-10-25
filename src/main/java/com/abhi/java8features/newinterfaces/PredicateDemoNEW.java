package com.abhi.java8features.newinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class PredicateDemoNEW {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList
				(new Student("Sumit", "9", 100), 
						new Student("Patrick", "9", 90), 
						new Student("Sam", "10", 80),
						new Student("Shreya","5", 95));
		
				
		System.out.println(findStudentByGrade(students,"9"));
		
		System.out.println(findStudentGTScore(students, 85));
		
		// Use of Predicate
		// Override the abstract method test() of the function interface Predicate
		// using Lambda expression
		Predicate <Student> nameStartsWithS = pre -> pre.name.startsWith("S");
		System.out.println("nameStartsWithS :" + findStudentByPredicate(students, nameStartsWithS));
		
		Predicate<Student> sample = new Predicate() {

			public boolean test(Object std) {
				if (((Student) std).getName().startsWith("S")) {
					return true;
				} else
					return false;
			}
		};
		
		System.out.println("nameStartsWithS : "+ findStudentByPredicate(students, sample));
		
		
		// Use of Predicate
        Predicate<Student> gradePredicate = pre -> pre.grade.equals("9");
        System.out.println(findStudentByPredicate(students, gradePredicate));
        
        //Use of predicate, find student mark less than 90
        Predicate<Student> markLess90 = pre -> pre.getMark() < 90;
        System.out.println("student mark less than 90 :::"+ findStudentByPredicate(students, markLess90));
        
        Predicate<Student> scorePredicate = pre -> pre.getMark() > 85;
        System.out.println(findStudentByPredicate(students, scorePredicate));
        
        //Display all students
        Predicate <Student> allStudentPredicate = pre -> true;
        System.out.println(findStudentByPredicate(students, allStudentPredicate));
        //Display no student
        Predicate <Student> noStudentPredicate = pre->false;
        System.out.println(findStudentByPredicate(students, noStudentPredicate));
        
        
        Predicate<Student> nameStartWithSPredicate = new PredicateImp();
        System.out.println(findStudentByPredicate(students, nameStartWithSPredicate));
       
        // Create Predicate with Annonmous class way
        Predicate <Student> gradeEqualFivePredicate = new Predicate<Student>() {
        	public boolean test(Student std)
        	{
        		return std.getGrade().equals("5");
        	}	
        };
        System.out.println(findStudentByPredicate(students, gradeEqualFivePredicate));
        
        
	}

	//Conventional approach . Applied for a single condition only
	static List<Student> findStudentByGrade(List<Student> students, String grade)
	{
		List<Student> result = new ArrayList();
		for(Student std : students)
		{
			if(std.getGrade().equals(grade))
			{
				result.add(std);
			}
		}
		return result;
		
	}
	//Conventional approach . Applied for a single condition only
	static List<Student> findStudentGTScore(List<Student> students, int score)
	{
		List<Student> result = new ArrayList();
		for(Student std : students)
		{
			if(std.getMark() > score)
			{
				result.add(std);
			}
		}
		return result;
	}
	
	static List<Student> findStudentByPredicate(List<Student> students, Predicate predicate)
	{
		List<Student> result = new ArrayList();
		for(Student std : students)
		{
			if(predicate.test(std))
			{
				result.add(std);
			}
		}
		return result ;
	}

}

// Create a custom predicate
class PredicateImp implements Predicate<Student>
{
	//Check the Student name starts with "P"
	public boolean test(Student std) {
		return std.getName().startsWith("P");
	}
	
}

class Test
{
	void func()
	{
		
	}
}

class Student
{
	String name;
	String grade;
	int mark;
	
	
	public Student(String name, String grade, int mark) {
		super();
		this.name = name;
		this.grade = grade;
		this.mark = mark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", mark=" + mark + "]";
	}
	
	
}
