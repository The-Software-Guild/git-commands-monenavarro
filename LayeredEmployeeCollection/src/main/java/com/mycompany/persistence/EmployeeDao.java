/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistence;

/**
 *
 * @author JulianAcosta
 */
import java.util.Collection;
import java.util.List;

import com.mycompany.entity.Employee;

/*
 * DAO : Data Access Object : Design Pattern to design persistence layer
 */
public interface EmployeeDao {

	Collection<Employee> getAllRecords();
	Employee searchRecord(int id);
	Employee insertRecord(Employee employee);
	Employee deleteRecord(int id);
}
