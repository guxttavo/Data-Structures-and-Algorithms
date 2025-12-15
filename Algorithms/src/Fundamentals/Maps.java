package Fundamentals;

import java.util.HashMap;

public class Maps<K, V> {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap();

        empIds.put("Gustavo", 24);
        empIds.put("Ellen", 28);

        empIds.get("Gustavo");

        System.out.println(empIds.get("Gustavo"));
        System.out.println(empIds);
    }
}
