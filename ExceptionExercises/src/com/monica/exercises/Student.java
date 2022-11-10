package com.monica.exercises;

import com.monica.exercises.exception.*;

public class Student {
	
	private int id, age, marks;
	private String name;
	
	public Student() {
		
	}
	
	public Student(int age, int marks, String name) throws AgeException, MarksException {
		
		if (age >= 4 && age <= 18) {
			this.age = age;
			this.name = name;
		}
		
		else {
			throw new AgeException("Student age must be between 4 and 18!");
		}
		
		if (marks >= 0 && marks <= 100) {
			this.marks = marks;
		}
		
		else {
			throw new MarksException("Invalid entry for marks!");
		}
		
			
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeException {
		
		if (age >= 4 && age <= 18) {
			this.age = age;
		}
		else
			throw new AgeException("Age must be between 4 and 18");
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) throws MarksException {
		if (marks >= 0 && marks <= 100) {
			this.marks = marks;
		}
		else {
			throw new MarksException("Invalid entry for marks!");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);
		System.out.println("Student Marks: " + marks);
	}

	
	
	
	

}
