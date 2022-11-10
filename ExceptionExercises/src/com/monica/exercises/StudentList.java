package com.monica.exercises;

import com.monica.exercises.exception.*;

public class StudentList {
	
	private Student[] students;
	private int totalOfStudents;
	
	public StudentList(int totalOfStudents) {
		super();
		students = new Student[totalOfStudents];
		this.totalOfStudents = totalOfStudents;
	}
	
	public void inputStudent(Student student, int index) throws IDException {
		if (students[0] == null) {
			students[0] = student;
		}
		
		else {
			for (int a = 0; a < totalOfStudents; a++) {
				if ((students[a].getId()) == student.getId()) {
					throw new IDException("Duplicate Student ID entered!");
				}
			}
		}
	}
	
	public void displayStudents() {
		for (int i = 0; i < totalOfStudents; i++) {
			students[i].display();
		}
	}
	}
	
	
