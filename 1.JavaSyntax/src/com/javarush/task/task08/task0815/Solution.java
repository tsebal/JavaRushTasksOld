package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {

    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Петичкин","Вася");
        map.put("Васечкин","Петя");
        map.put("Оноприй","Антон");
        map.put("Блатной","Конь");
        map.put("Резван","Вася");
        map.put("Карамбов","Женя");
        map.put("Хмурая","Марина");
        map.put("Сукин","Кот");
        map.put("Папиж","Лось");
        map.put("Артёмов","Женя");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;

        for (Map.Entry<String, String> m : map.entrySet()) {
            if (m.getValue().equals(name)) count++;
        }

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> m : map.entrySet()) {
            if (m.getKey().equals(lastName)) count++;
        }

        return count;
    }

    public static void main(String[] args) {
//        HashMap<String, String> map = createMap();
//        System.out.println(getCountTheSameFirstName(map, "Вася"));
//        System.out.println(getCountTheSameLastName(map, "Петичкин"));
    }
}
