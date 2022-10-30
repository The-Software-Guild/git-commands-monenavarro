/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.classroster.service;

import com.mycompany.classroster.dao.ClassRosterPersistenceException;
import com.mycompany.classroster.dto.Student;
import java.util.List;

/**
 *
 * @author MonicaNavarro
 */
public interface ClassRosterServiceLayer {
    
    void createStudent(Student student) throws
            ClassRosterDuplicateIdException,
            ClassRosterDataValidationException,
            ClassRosterPersistenceException;
 
    List<Student> getAllStudents() throws
            ClassRosterPersistenceException;
 
    Student getStudent(String studentId) throws
            ClassRosterPersistenceException;
 
    Student removeStudent(String studentId) throws
            ClassRosterPersistenceException;
    
}
