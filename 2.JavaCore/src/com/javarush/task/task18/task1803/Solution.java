package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> bMax = new HashMap<Integer, Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fIS = new FileInputStream(reader.readLine());
        reader.close();
        while (fIS.available() > 0) {
            int data = fIS.read();
            if (bMax.containsKey(data)) {
                int value = bMax.get(data);
                bMax.put(data, ++value);
            }
            else bMax.put(data, 1);
        }
        fIS.close();

        ArrayList<Integer> listMaxBytes = new ArrayList<>();
        int mostOften = 0;
        for (Map.Entry<Integer, Integer> pair: bMax.entrySet()) {
            if (pair.getValue() > mostOften) {
                mostOften = pair.getValue();
                listMaxBytes.clear();
                listMaxBytes.add(pair.getKey());
            }
            else if (pair.getValue() == mostOften)
                    listMaxBytes.add(pair.getKey());
        }

        for (Integer value : listMaxBytes) {
            System.out.print(value + " ");
        }
    }
}
