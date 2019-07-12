package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = new TreeMap<String, Double>();
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        String[] symbols;
        String line;
        Double currentValue;
        while ((line = file.readLine()) != null) {
            symbols = line.split(" ");
            if (map.containsKey(symbols[0])) {
                currentValue = map.get(symbols[0]);
                map.put(symbols[0], Double.parseDouble(symbols[1]) + currentValue);
            }
            else {
                map.put(symbols[0], Double.parseDouble(symbols[1]));
            }
        }
        file.close();

        currentValue = 0.0;
        for (String key : map.keySet()) {
            if (map.get(key) > currentValue)
                line = key;
        }
        System.out.println(line);
    }
}