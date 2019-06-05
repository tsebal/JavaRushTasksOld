package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> bMin = new HashMap<Integer, Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fIS = new FileInputStream(reader.readLine());
        reader.close();
        while (fIS.available() > 0) {
            int data = fIS.read();
            if (bMin.containsKey(data)) {
                int value = bMin.get(data);
                bMin.put(data, ++value);
            }
            else bMin.put(data, 1);
        }
        fIS.close();

        ArrayList<Integer> listMinBytes = new ArrayList<>();
        int mostOften = 10000;
        for (Map.Entry<Integer, Integer> pair: bMin.entrySet()) {
            if (pair.getValue() < mostOften) {
                mostOften = pair.getValue();
                listMinBytes.clear();
                listMinBytes.add(pair.getKey());
            }
            else if (pair.getValue() == mostOften)
                listMinBytes.add(pair.getKey());
        }

        for (Integer value : listMinBytes) {
            System.out.print(value + " ");
        }
    }
}
