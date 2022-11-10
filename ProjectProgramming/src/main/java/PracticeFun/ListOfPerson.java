/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeFun;

/**
 *
 * @author MonicaNavarro
 */
public class ListOfPerson {
    
    private Person[] persons;
    private int totalNoOfPersons;

    public ListOfPerson(int totalNoOfPersons) {
        this.totalNoOfPersons = totalNoOfPersons;
        persons = new Person[totalNoOfPersons];
    }
    
    public void inputPerson(Person person, int index) {
        persons[index] = person;
    }
    
    public void displayPersonList() {
        for (int index = 0; index < totalNoOfPersons; index++) {
            System.out.println(persons[index].getId() + " " + persons[index].getName() + " " + persons[index].getAge());
        }
    }

    
    
}
