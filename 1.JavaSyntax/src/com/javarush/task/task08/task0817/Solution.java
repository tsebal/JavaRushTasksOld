package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {

    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Stallone", "Silvester");
        map.put("Lysyi", "Oleg");
        map.put("Schwarz", "Arnold");
        map.put("Norris", "Chuck");
        map.put("Aaron", "Arnold");
        map.put("Marshall", "Anton");
        map.put("Tony", "Stark");
        map.put("Cop", "Skot");
        map.put("Sam", "Skot");
        map.put("Stathame", "Jason");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //Копируем переданную мапу 2 раза
        HashMap<String, String> map2 = new HashMap<String, String>(map);
        HashMap<String, String> map3 = new HashMap<String, String>(map);
        //цикл по map2
        for (Map.Entry<String, String> pair : map2.entrySet()) {
            //удаляем из map3 пару, которая соответствует pair
            map3.remove(pair.getKey());
            //проверяем на наличие  в map3 значений соответсвующего значению из pair
            if (map3.containsValue(pair.getValue())) {
                //Если есть такие же значения - вызываем удаление текующего значения pair из переданной map
                removeItemFromMapByValue(map, pair.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        HashMap<String, String> map = createMap();
//        for (Map.Entry<String, String> m : map.entrySet()) {
//            System.out.println(m.getKey()+" - "+m.getValue());
//        }
//        System.out.println();
//        removeTheFirstNameDuplicates(map);
//        for (Map.Entry<String, String> m : map.entrySet()) {
//            System.out.println(m.getKey()+" - "+m.getValue());
//        }
    }
}
