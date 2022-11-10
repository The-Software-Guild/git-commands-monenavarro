/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author JulianAcosta
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Employee {

	private int empId;
	private String empName;
	private String empDesignation;
	private String empDepartment;
	private double empSalary;
}
