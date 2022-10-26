/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StateCapitals;

/**
 *
 * @author MonicaNavarro
 */
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
        
public class StateCapitals {
    public static void main(String[] args) {

        HashMap<String, String> statesAndCapitals = new HashMap<>();
    
        statesAndCapitals.put("Alabama", "Montogomery");
        statesAndCapitals.put("Alaska", "Juneau");
        statesAndCapitals.put("Arizona", "Phoenix");
        statesAndCapitals.put("Arkansas", "Little Rock");
        
        System.out.println(statesAndCapitals.size());
        
        // Print keys
        System.out.println("STATES:");
        System.out.println("=========");
        Set<String> keys = statesAndCapitals.keySet();
        for (String k : keys) {
            System.out.println(k);
        }
        
        // Print values
        System.out.println("\nCAPITALS:");
        System.out.println("=========");
        Collection<String> capitals = statesAndCapitals.values();
        for (String c : capitals) {
            System.out.println(c);
        }
        
        // Print key-value pairs
        System.out.println("\nSTATE/CAPITAL PAIRS:");
        System.out.println("=========");
        for (String i : statesAndCapitals.keySet()) {
            System.out.println(i + " - " + statesAndCapitals.get(i));
        }
        
    }
}
