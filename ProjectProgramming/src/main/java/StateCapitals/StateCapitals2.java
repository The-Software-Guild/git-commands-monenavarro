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
import java.util.Map;
import java.util.Scanner;

public class StateCapitals2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Capital> stateCapitals = new HashMap<>();

        stateCapitals.put("Alabama", new Capital("Montgomery", 201332, 161.54));
        stateCapitals.put("Alaska", new Capital("Juneau", 31276, 3253.92));
        stateCapitals.put("Arizona", new Capital("Phoenix", 1615017, 517.9));
        stateCapitals.put("Arkansas", new Capital("Little Rock", 193524, 121.3));

        stateCapitals.put("California", new Capital("Sacramento", 466488, 517.9));

        System.out.println("\nState/Capital Pairs\n");

        for (String state : stateCapitals.keySet()) {
            System.out.println(state + " - " + stateCapitals.get(state).getName() + " | Pop: "
                    + stateCapitals.get(state).getPopulation() + " | Area: " + stateCapitals.get(state).getSize());
        }

        System.out.println("\nPlease enter a population filter (int): ");
        int filter = sc.nextInt();
        System.out.println("");
        for (String state : stateCapitals.keySet()) {
            if (stateCapitals.get(state).getPopulation() > filter) {
                System.out.println(state + " - " + stateCapitals.get(state).getName() + " | Pop: "
                        + stateCapitals.get(state).getPopulation() + " | Area: " + stateCapitals.get(state).getSize());
            }
        }
    }
}
