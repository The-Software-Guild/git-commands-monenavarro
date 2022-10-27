/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserIO;

/**
 *
 * @author MonicaNavarro
 */
import static java.lang.Integer.parseInt;
import java.util.*;

public class UserIOImpl implements UserIO {
    
    Scanner scanner = new Scanner(System.in);
    
    @Override
    public void print(String message) {
        System.out.println(message);
    }
    
    @Override
    public double readDouble(String prompt) {
        return Double.parseDouble(readString(prompt));
        
    }

    @Override
    public int readInt(String prompt) {
        return Integer.parseInt(readString(prompt));
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        double returnedDouble;
        do {
            returnedDouble = Double.parseDouble(readString(prompt));
        } while (returnedDouble < min || returnedDouble > max);
        return returnedDouble;
    }
    
    @Override
    public float readFloat(String prompt) {
        return Float.parseFloat(readString(prompt));
    }
    
    @Override 
    public float readFloat(String prompt, float min, float max) {
        float returnedFloat;
        do {
            returnedFloat = Float.parseFloat(readString(prompt));
        } while (returnedFloat < min || returnedFloat > max);
        return returnedFloat;
    }
    
    @Override
    public int readInt(String prompt, int min, int max) {
        int returnedInt;
        do {
            returnedInt = Integer.parseInt(readString(prompt));
        } while (returnedInt < min || returnedInt > max);
        return returnedInt;
    }
    
    @Override 
    public long readLong(String prompt) {
        return Long.parseLong(readString(prompt));
    }
    
    @Override
    public long readLong(String prompt, long min, long max) {
        long returnedLong;
        do {
            returnedLong = Long.parseLong(readString(prompt));
        } while (returnedLong < min || returnedLong > max);
        return returnedLong;
    }
    
    @Override
    public String readString(String prompt) {
        String stringIn = "";
        System.out.println(prompt);
        stringIn = scanner.nextLine();
        return stringIn;
    }
    
}
