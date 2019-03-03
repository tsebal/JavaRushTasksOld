package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Vasechkin", 560);
        map.put("Petichkin", 660);
        map.put("Antonov", 770);
        map.put("Rafikov", 330);
        map.put("Papizh", 225);
        map.put("Denisov", 1500);
        map.put("Gnida", 228);
        map.put("Skotskiy", 331);
        map.put("Rodionov", 765);
        map.put("Konev", 557);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair: copy.entrySet()) {
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        HashMap<String, Integer> map = createMap();
//        for (Map.Entry<String, Integer> m : map.entrySet()) {
//            System.out.println(m.getKey()+" - "+m.getValue());
//        }
//        System.out.println();
//        removeItemFromMap(map);
//        for (Map.Entry<String, Integer> m : map.entrySet()) {
//            System.out.println(m.getKey()+" - "+m.getValue());
//        }
    }
}