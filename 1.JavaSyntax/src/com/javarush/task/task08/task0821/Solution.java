package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Antonov", "Anton");
        map.put("Pavlov", "Anton");
        map.put("Serov", "Alen");
        map.put("Kon", "Lysyi");
        map.put("Ryb", "Kolya");
        map.put("Petichkin", "Vasya");
        map.put("Romanov", "Vitya");
        map.put("Sukin", "Kot");
        map.put("Serov", "Kompot");
        map.put("Sojral", "Elochku");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}