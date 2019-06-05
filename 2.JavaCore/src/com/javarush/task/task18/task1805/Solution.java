package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> bytesList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fIS = new FileInputStream(reader.readLine());
        reader.close();
        while (fIS.available() > 0) {
            int data = fIS.read();
            if (!bytesList.contains(data))
                bytesList.add(data);
        }
        fIS.close();

        Collections.sort(bytesList);

        for (Integer value : bytesList) {
            System.out.print(value + " ");
        }
    }
}