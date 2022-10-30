/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classroster.dao;

import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author MonicaNavarro
 */
public class ClassRosterAuditDaoFileImpl implements ClassRosterAuditDao {
    
    public static final String AUDIT_FILE = "audit.txt";
   
    public void writeAuditEntry(String entry) throws ClassRosterPersistenceException {
        PrintWriter out;
       
        try {
            out = new PrintWriter(new FileWriter(AUDIT_FILE, true));
        } catch (IOException e) {
            throw new ClassRosterPersistenceException("Could not persist audit information.", e);
        }
 
        LocalDateTime timestamp = LocalDateTime.now();
        out.println(timestamp.toString() + " : " + entry);
        out.flush();
    }
}
