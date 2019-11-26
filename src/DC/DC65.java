package DC;

import java.util.HashMap;

public class DC65 {
    public static void main(String[] args) {

        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John".toString(), 32);
        people.put("Steve".toString(), 30);
        people.put("Angie".toString(), 33);
        people.put("DC".toString(), 21);
        for (String i : people.keySet()) {
            System.out.println("Name: " + i + " Age: " + people.get(i));
        }
    }
}