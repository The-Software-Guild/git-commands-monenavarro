package com.monica.exercises;

import java.util.Scanner;

import com.monica.exercises.exception.*;

public class StudentMain {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter total number of students: ");
			int total = scanner.nextInt();
			
			StudentList studentList = new StudentList(total);
			
			for (int index = 0; index < total; index++) {
				Student student = new Student();
				
				
				System.out.println("Enter student ID#: ");
				student.setId(scanner.nextInt());
				
				System.out.println("Enter student name: ");
				student.setName(scanner.next());
				
				System.out.println("Enter student age: ");
				student.setAge(scanner.nextInt());
				
				System.out.println("Enter student marks: ");
				student.setMarks(scanner.nextInt());
				
				studentList.inputStudent(student, index);
			}
			
			studentList.displayStudents();
		} catch (IDException exception) {
			System.out.println(exception.getMessage());
		} catch (AgeException exception) {
			System.out.println(exception.getMessage());
		} catch (MarksException exception) {
			System.out.println(exception.getMessage());
			
		} catch (Exception exception) {
			System.out.println("ERROR! Please try again.");
		
	} finally {
        scanner.close();
    }
		
	}

}
