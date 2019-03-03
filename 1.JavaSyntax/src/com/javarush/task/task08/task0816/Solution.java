package com.javarush.task.task08.task0816;

import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {

    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Lysyi", new Date("FEBRUARY 17 1987"));
        map.put("Schwarz", new Date("AUGUST 1 1980"));
        map.put("Norris", new Date("JULY 17 1968"));
        map.put("Aaron", new Date("MAY 15 1963"));
        map.put("Marshall", new Date("DECEMBER 10 1981"));
        map.put("Tony", new Date("JANUARY 2 1970"));
        map.put("Cop", new Date("JUNE 16 1989"));
        map.put("Sam", new Date("APRIL 11 1976"));
        map.put("Stathame", new Date("OCTOBER 12 1981"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,Date> pair = iterator.next();
            if (pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7)
                iterator.remove();
        }
    }

    public static void main(String[] args) {
//        HashMap<String, Date> map = createMap();
//        for (Map.Entry<String, Date> m : map.entrySet()) {
//            System.out.println(m.getKey()+" - "+m.getValue());
//        }
//        System.out.println();
//        removeAllSummerPeople(map);
//        for (Map.Entry<String, Date> m : map.entrySet()) {
//            System.out.println(m.getKey()+" - "+m.getValue());
//        }
    }
}
