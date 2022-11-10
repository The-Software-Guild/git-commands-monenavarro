/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeFun;

/**
 *
 * @author MonicaNavarro
 */
import java.util.*;

public class MainPerson {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total number of persons: ");
        int total = input.nextInt();
        
        ListOfPerson listOfPerson;
        listOfPerson = new ListOfPerson(total);
        
        for (int index = 0; index < total; index++) {
            Person person = new Person();
            System.out.println("Enter " + (index + 1) + "person ID: ");
            person.setId(input.nextInt());
            System.out.println("Enter " + (index + 1) + "person name: ");
            person.setName(input.next());
            System.out.println("Enter " + (index + 1) + "person age: ");
            person.setAge(input.nextInt());
            
            listOfPerson.inputPerson(person, index);
            
            
        }
        listOfPerson.displayPersonList();      
        
        
        
    }
}
