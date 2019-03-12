package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("Vaska", new Cat("1"));
        map.put("Aska", new Cat("2"));
        map.put("Ska", new Cat("3"));
        map.put("Ka", new Cat("4"));
        map.put("Vasska", new Cat("5"));
        map.put("Vaskka", new Cat("6"));
        map.put("Vaskaa", new Cat("7"));
        map.put("Vvaska", new Cat("8"));
        map.put("Vadaska", new Cat("9"));
        map.put("Vasaka", new Cat("10"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<Cat>();
        for (Map.Entry<String, Cat> m: map.entrySet()) {
            set.add(m.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat:set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat "+this.name;
        }
    }
}
