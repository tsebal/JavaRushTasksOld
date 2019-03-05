package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> mon = new HashMap<String, Integer>();
        mon.put("JANUARY", 1);
        mon.put("FEBRUARY", 2);
        mon.put("MARCH", 3);
        mon.put("APRIL", 4);
        mon.put("MAY", 5);
        mon.put("JUNE", 6);
        mon.put("JULY", 7);
        mon.put("AUGUST", 8);
        mon.put("SEPTEMBER", 9);
        mon.put("OCTOBER", 10);
        mon.put("NOVEMBER", 11);
        mon.put("DECEMBER", 12);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String name2 = name.toUpperCase();

        Iterator<Map.Entry<String, Integer>> iterator = mon.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();

            if (pair.getKey().equals(name2))
                System.out.println(name + " is " + pair.getValue() + " month");
        }
    }
}